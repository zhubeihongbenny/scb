package jp.co.dk.ip.domain.model;

import lombok.Getter;
import lombok.Setter;

/**
 * . room model
 */
@Getter
@Setter
public class RoomModel {

	/**
	 * . 酒店id
	 */
	private String hotelId;
	
	/**
	 * . 酒店名称
	 */
	private String hotelName;
	
	/**
	 * . 房间号码
	 */
	private String roomNumber;

	/**
	 * . 是否入住
	 */
	private String isCheckedIn;
	
	/**
	 * . 占用开始日期
	 */
	private String dateBegin;
	
	/**
	 * . 占用结束日期
	 */
	private String dateEnd;
}
