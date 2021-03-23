package com.procast.shift.entity;

public class StaffShiftPattern {

	/** スタッフコード */
	private String staffCode;

	/** シフトパターン */
	private String shiftPatternCode;

	/** 開始時刻 */
	private String startTime;

	/** 終了時刻 */
	private String endTime;

	/** 労働時間 */
	private String hour;

	/**
	 * コンストラクタ
	 */
	public StaffShiftPattern() {
		super();
	}

	/**
	 * コンストラクタ
	 *
	 * @param staffCode
	 * @param shiftPatternCode
	 * @param startTime
	 * @param endTime
	 * @param hour
	 */
	public StaffShiftPattern(String staffCode, String shiftPatternCode, String startTime, String endTime, String hour) {
		super();
		this.staffCode = staffCode;
		this.shiftPatternCode = shiftPatternCode;
		this.startTime = startTime;
		this.endTime = endTime;
		this.hour = hour;
	}

	/**
	 * @return staffCode
	 */
	public String getStaffCode() {
		return staffCode;
	}

	/**
	 * @param staffCode セットする staffCode
	 */
	public void setStaffCode(String staffCode) {
		this.staffCode = staffCode;
	}

	/**
	 * @return shiftPatternCode
	 */
	public String getShiftPatternCode() {
		return shiftPatternCode;
	}

	/**
	 * @param shiftPatternCode セットする shiftPatternCode
	 */
	public void setShiftPatternCode(String shiftPatternCode) {
		this.shiftPatternCode = shiftPatternCode;
	}

	/**
	 * @return startTime
	 */
	public String getStartTime() {
		return startTime;
	}

	/**
	 * @param startTime セットする startTime
	 */
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	/**
	 * @return endTime
	 */
	public String getEndTime() {
		return endTime;
	}

	/**
	 * @param endTime セットする endTime
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	/**
	 * @return hour
	 */
	public String getHour() {
		return hour;
	}

	/**
	 * @param hour セットする hour
	 */
	public void setHour(String hour) {
		this.hour = hour;
	}

}
