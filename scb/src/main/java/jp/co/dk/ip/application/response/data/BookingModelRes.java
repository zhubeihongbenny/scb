package jp.co.dk.ip.application.response.data;

import lombok.Getter;
import lombok.Setter;

/**.
 * booking model response
 */
@Getter
@Setter
public class BookingModelRes {

	/**
	 * . 客人账户
	 */
	private String accountId;

	/**
	 * . 酒店名称
	 */
	private String hotelName;

	/**
	 * . 入住日期
	 */
	private String checkInDate;

	/**
	 * . 离店日期
	 */
	
	private String checkOutDate;

	/**
	 * . 房间号码
	 */
	
	private String roomNumber;
}
