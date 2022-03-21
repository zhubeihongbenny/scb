package jp.co.dk.ip.config;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import jp.co.dk.ip.common.Const;

import org.springframework.data.domain.AuditorAware;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**.
 * システムの監査実現、ユーザIDの検証
 */
public class AuditorAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {

        HttpServletRequest request = null;
        RequestAttributes requestAttributes = null;
        Object userIdObj = null;

        requestAttributes = RequestContextHolder.getRequestAttributes();
        if (null != requestAttributes) {
            request = ((ServletRequestAttributes) requestAttributes).getRequest();
        }
        if (null != request) {
            userIdObj = request.getAttribute(Const.REQ_ATTR_USER_ID);
        }
        if (StringUtils.isEmpty(userIdObj)) {
            return Optional.of(Const.EMPTY_STRING);
        } else {
            return Optional.of(userIdObj.toString());
        }
    }
}
