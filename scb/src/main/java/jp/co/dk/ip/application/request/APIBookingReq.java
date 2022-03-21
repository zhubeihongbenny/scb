package jp.co.dk.ip.application.request;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import jp.co.dk.ip.application.request.data.BaseReq;
import lombok.Getter;
import lombok.Setter;

/**
 * booking request
 */
@Getter
@Setter
public class APIBookingReq extends BaseReq {

    // 账号
    @NotEmpty(message = "{ECT008}")
    @Length(max = 32, message = "{ECT010}")
    private String accountId;
    
    // 酒店名称
    @NotEmpty(message = "{ECT008}")
    @Length(max = 32, message = "{ECT010}")
    private String hotelName;

    // 入住日期，格式为：yyyyMMddHHmmss
    @NotEmpty(message = "{ECT008}")
    @Length(max = 14, message = "{ECT010}")
    private String checkInDate;
    
    // 离店日期，格式为：yyyyMMddHHmmss
    @NotEmpty(message = "{ECT008}")
    @Length(max = 14, message = "{ECT010}")
    private String checkOutDate;

    // 房间号码
    @NotEmpty(message = "{ECT008}")
    @Length(max = 5, message = "{ECT010}")
    private String roomNumber;
}