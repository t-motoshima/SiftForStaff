package com.procast.shift.entity;

import java.util.Date;

import lombok.Data;
/**
 * 工程のentity
 *
 * @author takata
 *
 */
@Data
public class WorkProcess {

	/** 拠点コード */
	private String workBaseCode;

	/** 工程コード */
	private String processCode;

	/** 工程名 */
	private String processName;

	/** 有効開始日 */
	private Date effectiveDate;

	/** 失効日 */
	private Date expireDate;

	/**
	 * コンストラクタ
	 *
	 * @param workBaseCode
	 * @param processCode
	 * @param processName
	 * @param effectiveDate
	 * @param expireDate
	 */
	public WorkProcess(String workBaseCode, String processCode, String processName, Date effectiveDate,
			Date expireDate) {
		super();
		this.workBaseCode = workBaseCode;
		this.processCode = processCode;
		this.processName = processName;
		this.effectiveDate = effectiveDate;
		this.expireDate = expireDate;
	}
}
