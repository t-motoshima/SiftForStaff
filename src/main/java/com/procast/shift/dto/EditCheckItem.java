package com.procast.shift.dto;

import lombok.Data;

/**
 * チェックボックスのDTO
 *
 * @author takata
 *
 */
@Data
public class EditCheckItem {
	/** チェックコード */
	private String checkCode;

	/** チェック値 */
	private String checkValue;

	/** チェック名称 */
	private String checkName;

	/** チェックテキスト */
	private String checkText;

	/** チェックフラグ */
	private Boolean checkFlag;

	/**
	 * コンストラクタ
	 */
	public EditCheckItem() {
		super();
	}

	/**
	 * コンストラクタ
	 *
	 * @param checkCode
	 * @param checkValue
	 * @param checkName
	 * @param checkText
	 * @param checkFlag
	 */
	public EditCheckItem(String checkCode, String checkValue, String checkName, String checkText, Boolean checkFlag) {
		super();
		this.checkCode = checkCode;
		this.checkValue = checkValue;
		this.checkName = checkName;
		this.checkText = checkText;
		this.checkFlag = checkFlag;
	}

	/**
	 * コンストラクタ（フラグなし）
	 *
	 * @param checkCode
	 * @param checkValue
	 * @param checkName
	 */
	public EditCheckItem(String checkCode, String checkValue, String checkName, String checkText) {
		super();
		this.checkCode = checkCode;
		this.checkValue = checkValue;
		this.checkName = checkName;
		this.checkText = checkText;
	}
}
