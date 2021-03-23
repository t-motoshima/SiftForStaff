package com.procast.shift.entity;

import java.time.LocalDate;

import lombok.Data;

@Data
public class MonthlyStaffShift {

	/** スタッフコード */
	private String staffCode;

	/** 希望勤務年 */
	private int shiftYear;

	/** 希望勤務月 */
	private int shiftMonth;

	/** 希望勤務日 */
	private int shiftDay;

	/** 希望勤務年月日 */
	private LocalDate shiftDate;

	/** 希望勤務曜日 */
	private int shiftWeekDay;

	/** 工程 **/
	private String process;

	/** シフトパターン */
	private String shiftPatternCode;

	/** 申請ステータス */
	private String status;
	/**
	 * コンストラクタ
	 */
	public MonthlyStaffShift() {
		super();
	}

	/**
	 *
	 * コンストラクタ
	 *
	 * @param staffCode
	 * @param shiftDate
	 * @param shiftPatternCode
	 * @param startTime
	 * @param endTime
	 * @param hour
	 * @param loadedDate
	 */
	public MonthlyStaffShift(String staffCode,LocalDate shiftDate,int shiftYear,int shiftMonth,int shiftDay,int shiftWeekDay, String process, String shiftPatternCode,String status) {
		super();
		this.staffCode = staffCode;
		this.shiftDate = shiftDate;
		this.shiftYear =shiftYear;
		this.shiftMonth = shiftMonth;
		this.shiftDay = shiftDay;
		this.shiftWeekDay = shiftWeekDay;
		this.process = process;
		this.shiftPatternCode = shiftPatternCode;
		this.status = status;
	}

}
