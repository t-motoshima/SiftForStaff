package com.procast.shift.entity;

import java.util.Date;

/**
 * 機能のBean
 *
 *
 * @author takata
 *
 */
public class Feature {
	/** 機能コード */
	private String featureCode;

	/** 機能名 */
	private String featureName;

	/** 機能URL */
	private String featureUrl;

	/** 作成日時 */
	private Date createDate;

	/** 作成者 */
	private String createUser;

	/** 更新日時 */
	private Date lastUpdateDate;

	/** 更新者 */
	private String lastUpdateUser;

	public Feature() {
		super();
	}

	/**
	 * コンストラクタ
	 *
	 * @param featureCode 機能コード
	 * @param featureName 機能名
	 * @param featureUrl 機能URL
	 * @param createDate 作成日時
	 * @param createUser 作成者
	 * @param lastUpdateDate 更新日時
	 * @param lastUpdateUser 更新者
	 */
	public Feature(String featureCode, String featureName, String featureUrl, Date createDate, String createUser,
			Date lastUpdateDate, String lastUpdateUser) {
		super();
		this.featureCode = featureCode;
		this.featureName = featureName;
		this.featureUrl = featureUrl;
		this.createDate = createDate;
		this.createUser = createUser;
		this.lastUpdateDate = lastUpdateDate;
		this.lastUpdateUser = lastUpdateUser;
	}

	/**
	 * @return featureCode
	 */
	public String getFeatureCode() {
		return featureCode;
	}

	/**
	 * @param featureCode セットする featureCode
	 */
	public void setFeatureCode(String featureCode) {
		this.featureCode = featureCode;
	}

	/**
	 * @return featureName
	 */
	public String getFeatureName() {
		return featureName;
	}

	/**
	 * @param featureName セットする featureName
	 */
	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}

	/**
	 * @return featureUrl
	 */
	public String getFeatureUrl() {
		return featureUrl;
	}

	/**
	 * @param featureUrl セットする featureUrl
	 */
	public void setFeatureUrl(String featureUrl) {
		this.featureUrl = featureUrl;
	}

	/**
	 * @return createDate
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * @param createDate セットする createDate
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * @return createUser
	 */
	public String getCreateUser() {
		return createUser;
	}

	/**
	 * @param createUser セットする createUser
	 */
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	/**
	 * @return lastUpdateDate
	 */
	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	/**
	 * @param lastUpdateDate セットする lastUpdateDate
	 */
	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	/**
	 * @return lastUpdateUser
	 */
	public String getLastUpdateUser() {
		return lastUpdateUser;
	}

	/**
	 * @param lastUpdateUser セットする lastUpdateUser
	 */
	public void setLastUpdateUser(String lastUpdateUser) {
		this.lastUpdateUser = lastUpdateUser;
	}

}
