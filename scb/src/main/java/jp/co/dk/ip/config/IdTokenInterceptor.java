package jp.co.dk.ip.config;

import java.util.Base64;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.dk.ip.common.Const;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**.
 * IDトークンのデコード
 */
public class IdTokenInterceptor extends HandlerInterceptorAdapter {

    private static final Logger logger = LoggerFactory.getLogger(IdTokenInterceptor.class);

    private static final String AUTHORIZATION = "Authorization";
    private static final String PAYLOAD_TOKEN_USE = "token_use";
    private static final String PAYLOAD_USER_ID = "cognito:username";
    private static final String PAYLOAD_AUTHOR_ID = "custom:authorId";

    private static final int JWT_PARTS = 3;
    private static final int PAYLOAD_INDEX = 1;
    private static final String CHARSET = "UTF-8";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String userId = Const.EMPTY_STRING;
        String authorId = Const.EMPTY_STRING;

        try {
            // IDトークンのデコード
            String jwt = request.getHeader(AUTHORIZATION);
            String[] jwtParts = jwt != null ? jwt.split("\\.") : new String[] {};
            if (jwtParts.length == JWT_PARTS) {
                String payload = jwtParts[PAYLOAD_INDEX];
                byte[] payloadBytes = Base64.getUrlDecoder().decode(payload);
                String payloadString = new String(payloadBytes, CHARSET);
                ObjectMapper mapper = new ObjectMapper();
                JsonNode payloadObj = mapper.readTree(payloadString);
                if ("id".equals(payloadObj.get(PAYLOAD_TOKEN_USE).asText())) {
                    userId = payloadObj.get(PAYLOAD_USER_ID).asText();
                    authorId = payloadObj.get(PAYLOAD_AUTHOR_ID).asText();
                }
            }
        } catch (Exception e) {
            logger.error("IDトークンのデコードが失敗しました。", e);
        }

        // ユーザ情報をリクエストに設定
        request.setAttribute(Const.REQ_ATTR_USER_ID, userId);
        request.setAttribute(Const.REQ_ATTR_AUTHOR_ID, authorId);

        // ユーザ情報をログに設定
        MDC.put(Const.REQ_ATTR_USER_ID, userId);

        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {

        // ユーザ情報をリクエストから削除
        request.removeAttribute(Const.REQ_ATTR_USER_ID);
        request.removeAttribute(Const.REQ_ATTR_AUTHOR_ID);

        // ユーザ情報をログから削除
        MDC.remove(Const.REQ_ATTR_USER_ID);
    }
}
