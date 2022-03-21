package jp.co.dk.ip.application.response;

import java.util.List;

import jp.co.dk.ip.application.response.data.BaseRes;
import jp.co.dk.ip.application.response.data.BookingModelRes;
import lombok.Getter;
import lombok.Setter;

/**
 * agent data reception call back response
 */
@Getter
@Setter
public class APIBookingRes extends BaseRes {

	private List<BookingModelRes> bookingModelResList;
}
