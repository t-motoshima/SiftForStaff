package com.procast.shift.entity;

import java.util.Date;

import lombok.Data;

@Data
public class ShiftPattern {

	/** シフトパターン */
	private String shiftPatternCode;

	/** 開始時刻 */
	private String startTime;

	/** 終了時刻 */
	private String endTime;

	/** 労働時間 */
	private String hour;

	/** 有効開始日 */
	private Date effectiveDate;

	/** 失効日 */
	private Date expireDate;

	/**
	 * コンストラクタ
	 */
	public ShiftPattern() {
		super();
	}

	public ShiftPattern(String shiftPatternCode, String startTime, String endTime, String hour, Date effectiveDate,
			Date expireDate) {
		super();
		this.shiftPatternCode = shiftPatternCode;
		this.startTime = startTime;
		this.endTime = endTime;
		this.hour = hour;
		this.effectiveDate = effectiveDate;
		this.expireDate = expireDate;
	}
}
