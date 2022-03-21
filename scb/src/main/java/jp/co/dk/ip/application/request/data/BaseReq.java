package jp.co.dk.ip.application.request.data;

import java.util.List;

import javax.validation.Valid;

import lombok.Getter;
import lombok.Setter;

/**.
 * APIリクエストの共通項目
 */
@Getter
@Setter
public class BaseReq {

    // ソートリスト
    @Valid
    private List<SortReq> sort;
}
