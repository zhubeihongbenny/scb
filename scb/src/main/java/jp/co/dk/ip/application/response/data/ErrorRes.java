package jp.co.dk.ip.application.response.data;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**.
 * APIエラー共通のレスポンス
 * @param <T> ジェネリック対象
 */
@Getter
@Setter
public class ErrorRes<T> extends BaseRes {

    // 処理メッセージのパラメータ
    private String[] messageContent;

    // 署名付きURLの生成
    private String presignedUrl;

    // 復帰値フラグ
    private String resFlg;

    // エンティティ対象
    private T tbObj;

    // リスト対象
    private List<T> listObj;
}
