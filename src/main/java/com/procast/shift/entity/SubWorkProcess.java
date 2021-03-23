package com.procast.shift.entity;

/**
 * サブ工程のentity
 *
 * @author takata
 *
 */
public class SubWorkProcess {

	/** スタッフコード */
	private String staffCode;

	/** 拠点コード */
	private String workBaseCode;

	/** 工程コード */
	private String processCode;

	/** 工程名 */
	private String processName;

	/**
	 * コンストラクタ
	 *
	 * @param staffCode
	 * @param workBaseCode
	 * @param processCode
	 * @param processName
	 */
	public SubWorkProcess(String staffCode, String workBaseCode, String processCode, String processName) {
		super();
		this.staffCode = staffCode;
		this.workBaseCode = workBaseCode;
		this.processCode = processCode;
		this.processName = processName;
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
	 * @return workBaseCode
	 */
	public String getWorkBaseCode() {
		return workBaseCode;
	}

	/**
	 * @param workBaseCode セットする workBaseCode
	 */
	public void setWorkBaseCode(String workBaseCode) {
		this.workBaseCode = workBaseCode;
	}

	/**
	 * @return processCode
	 */
	public String getProcessCode() {
		return processCode;
	}

	/**
	 * @param processCode セットする processCode
	 */
	public void setProcessCode(String processCode) {
		this.processCode = processCode;
	}

	/**
	 * @return processName
	 */
	public String getProcessName() {
		return processName;
	}

	/**
	 * @param processName セットする processName
	 */
	public void setProcessName(String processName) {
		this.processName = processName;
	}
}
