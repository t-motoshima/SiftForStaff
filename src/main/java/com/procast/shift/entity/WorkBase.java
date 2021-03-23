package com.procast.shift.entity;

import java.util.Date;

import lombok.Data;

@Data
public class WorkBase {

	/** 拠点コード */
	private String workBaseCode;

	/** 拠点名 */
	private String workBaseName;

	/** 有効開始日 */
	private Date effectiveDate;

	/** 失効日 */
	private Date expireDate;

	/** 作成日時 */
	private Date createDate;

	/** 作成者 */
	private String createUser;

	/** 更新日時 */
	private Date lastUpdateDate;

	/** 更新者 */
	private String lastUpdateUser;


	public WorkBase() {
		super();
	}

	public WorkBase(String workBaseCode, String workBaseName, Date effectiveDate, Date expireDate, Date createDate,
			String createUser, Date lastUpdateDate, String lastUpdateUser) {
		super();
		this.workBaseCode = workBaseCode;
		this.workBaseName = workBaseName;
		this.effectiveDate = effectiveDate;
		this.expireDate = expireDate;
		this.createDate = createDate;
		this.createUser = createUser;
		this.lastUpdateDate = lastUpdateDate;
		this.lastUpdateUser = lastUpdateUser;
	}
}
