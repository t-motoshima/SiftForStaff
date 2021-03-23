package com.procast.shift.entity;

import java.util.Date;

public class StaffShift {

	/** スタッフコード */
	private String staffCode;

	/** 希望勤務日付 */
	private Date shiftDate;

	/** シフトパターン */
	private String shiftPatternCode;

	/** 開始時刻 */
	private String startTime;

	/** 終了時刻 */
	private String endTime;

	/** 労働時間 */
	private String hour;

	/** 取り込み日 */
	private Date loadedDate;

	/**
	 * コンストラクタ
	 */
	public StaffShift() {
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
	public StaffShift(String staffCode, Date shiftDate, String shiftPatternCode, String startTime, String endTime,
			String hour, Date loadedDate) {
		super();
		this.staffCode = staffCode;
		this.shiftDate = shiftDate;
		this.shiftPatternCode = shiftPatternCode;
		this.startTime = startTime;
		this.endTime = endTime;
		this.hour = hour;
		this.loadedDate = loadedDate;
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
	 * @return shiftDate
	 */
	public Date getShiftDate() {
		return shiftDate;
	}

	/**
	 * @param shiftDate セットする shiftDate
	 */
	public void setShiftDate(Date shiftDate) {
		this.shiftDate = shiftDate;
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

	/**
	 * @return loadedDate
	 */
	public Date getLoadedDate() {
		return loadedDate;
	}

	/**
	 * @param loadedDate セットする loadedDate
	 */
	public void setLoadedDate(Date loadedDate) {
		this.loadedDate = loadedDate;
	}
}
