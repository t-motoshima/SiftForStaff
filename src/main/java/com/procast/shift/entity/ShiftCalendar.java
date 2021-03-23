package com.procast.shift.entity;

import java.util.Date;

import lombok.Data;

@Data
public class ShiftCalendar {

	/**  */
	private Date dateYmd;

	/**  */
	private String shiftYear;

	/**  */
	private String shiftMonth;

	/**  */
	private String shiftDate;

	/**  */
	private String shiftDay;

	public ShiftCalendar(Date dateYmd, String shiftYear, String shiftMonth, String shiftDate, String shiftDay) {
		super();
		this.dateYmd = dateYmd;
		this.shiftYear = shiftYear;
		this.shiftMonth = shiftMonth;
		this.shiftDate = shiftDate;
		this.shiftDay = shiftDay;
	}
}