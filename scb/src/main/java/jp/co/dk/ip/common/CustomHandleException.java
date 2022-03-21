package jp.co.dk.ip.common;

import jp.co.dk.ip.application.response.data.ErrorRes;

import org.springframework.beans.factory.annotation.Autowired;

/**.
 * カスタム異常
 */
@SuppressWarnings("serial")
public class CustomHandleException extends RuntimeException {

    @SuppressWarnings("rawtypes")
    @Autowired
    private ErrorRes errorRes;

    @SuppressWarnings("rawtypes")
    public CustomHandleException(ErrorRes tempErrorRes) {
        errorRes = tempErrorRes;
    }

    /**.
     * 異常レスポンス情報を取得
     *
     * @return 共通レスポンス情報
     */
    @SuppressWarnings("rawtypes")
    public ErrorRes getErrorMessage() {
        return errorRes;
    }
}
