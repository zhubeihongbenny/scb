package jp.co.dk.ip.application.response.data;

import lombok.Getter;
import lombok.Setter;

/**.
 * APIレスポンスの共通項目
 */
@Getter
@Setter
public class BaseRes {

    // 処理コード
    private String resultCode;

    // 処理結果件数
    private Integer resultCnt;

    // メッセージコード
    private String messageCode;

    // メッセージ
    private String message;
}
