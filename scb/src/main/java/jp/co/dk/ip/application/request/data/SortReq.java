package jp.co.dk.ip.application.request.data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import lombok.Getter;
import lombok.Setter;

/**.
 * ソート
 */
@Getter
@Setter
public class SortReq {

    // ソート項目
    @NotEmpty(message = "{ECT012}")
    @Pattern(regexp = "^[0-9a-zA-Z_]{1,}$", message = "{ECT007}")
    @Length(max = 50, message = "{ECT010}")
    private String sortItem;

    // 昇順/降順（1：昇順、2:降順）
    @NotEmpty(message = "{ECT012}")
    @Pattern(regexp = "\\d*", message = "{ECT009}")
    @Length(max = 1, message = "{ECT010}")
    private String order;
}
