package com.procast.shift.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * ユーザー情報のBean
 *
 * @author takata
 *
 */
public class StaffInfo implements Serializable {
	/** スタッフコード */
	private String staffCode;

	/** 氏名 */
	private String staffName;

	/** ふりがな */
	private String staffFurigana;

	/** 入社年月日 */
	private Date employmentDate;

	/** 退職年月日 */
	private Date retirementDate;

	/** 所属 */
	private String affiliation;

	/** 拠点 */
	private String workBaseCode;

	/** 等級 */
	private String staffGrade;

	/** メイン工程 */
	private String mainProcess;

	/** 販売者番号 */
	private int salespersonCode;

	/** 管理者フラグ */
	private int ownerFlg;

	/** パスコード */
	private String passCode;

	/** 公休日（日） */
	private int holidaySunFlg;

	/** 公休日（月） */
	private int holidayMonFlg;

	/** 公休日（火） */
	private int holidayTueFlg;

	/** 公休日（水） */
	private int holidayWedFlg;

	/** 公休日（木） */
	private int holidayThuFlg;

	/** 公休日（金） */
	private int holidayFriFlg;

	/** 公休日（土） */
	private int holidaySatFlg;

	/** 有給残日数 */
	private BigDecimal paidLeaveRemaing;

	/** 備考 */
	private String note;

	/** 作成日時 */
	private Date createDate;

	/** 作成者 */
	private String createUser;

	/** 更新日時 **/
	private Date lastUpdateDate;

	/** 更新者 */
	private String lastUpdateUser;

	/**
	 * @return staffCode
	 */
	public String getStaffCode() {
		return staffCode;
	}

	public StaffInfo() {
		super();
	}

	/**
	 *
	 * コンストラクタ
	 *
	 * @param staffCode
	 * @param staffName
	 * @param staffFurigana
	 * @param employmentDate
	 * @param retirementDate
	 * @param affiliation
	 * @param workBaseCode
	 * @param staffGrade
	 * @param mainProcess
	 * @param salespersonCode
	 * @param ownerFlg
	 * @param passCode
	 * @param holidaySunFlg
	 * @param holidayMonFlg
	 * @param holidayTueFlg
	 * @param holidayWedFlg
	 * @param holidayThuFlg
	 * @param holidayFriFlg
	 * @param holidaySatFlg
	 * @param paidLeaveRemaing
	 * @param createDate
	 * @param createUser
	 * @param lastUpdateDate
	 * @param lastUpdateUser
	 */
	public StaffInfo(String staffCode, String staffName, String staffFurigana, Date employmentDate, Date retirementDate,
			String affiliation, String workBaseCode, String staffGrade, String mainProcess, int salespersonCode,
			int ownerFlg, String passCode, int holidaySunFlg, int holidayMonFlg, int holidayTueFlg, int holidayWedFlg,
			int holidayThuFlg, int holidayFriFlg, int holidaySatFlg, BigDecimal paidLeaveRemaing, Date createDate,
			String createUser, Date lastUpdateDate, String lastUpdateUser) {
		super();
		this.staffCode = staffCode;
		this.staffName = staffName;
		this.staffFurigana = staffFurigana;
		this.employmentDate = employmentDate;
		this.retirementDate = retirementDate;
		this.affiliation = affiliation;
		this.workBaseCode = workBaseCode;
		this.staffGrade = staffGrade;
		this.mainProcess = mainProcess;
		this.salespersonCode = salespersonCode;
		this.ownerFlg = ownerFlg;
		this.passCode = passCode;
		this.holidaySunFlg = holidaySunFlg;
		this.holidayMonFlg = holidayMonFlg;
		this.holidayTueFlg = holidayTueFlg;
		this.holidayWedFlg = holidayWedFlg;
		this.holidayThuFlg = holidayThuFlg;
		this.holidayFriFlg = holidayFriFlg;
		this.holidaySatFlg = holidaySatFlg;
		this.paidLeaveRemaing = paidLeaveRemaing;
		this.createDate = createDate;
		this.createUser = createUser;
		this.lastUpdateDate = lastUpdateDate;
		this.lastUpdateUser = lastUpdateUser;
	}

	/**
	 * @return staffName
	 */
	public String getStaffName() {
		return staffName;
	}

	/**
	 * @param staffName セットする staffName
	 */
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	/**
	 * @return staffFurigana
	 */
	public String getStaffFurigana() {
		return staffFurigana;
	}

	/**
	 * @param staffFurigana セットする staffFurigana
	 */
	public void setStaffFurigana(String staffFurigana) {
		this.staffFurigana = staffFurigana;
	}

	/**
	 * @return employmentDate
	 */
	public Date getEmploymentDate() {
		return employmentDate;
	}

	/**
	 * @param employmentDate セットする employmentDate
	 */
	public void setEmploymentDate(Date employmentDate) {
		this.employmentDate = employmentDate;
	}

	/**
	 * @return retirementDate
	 */
	public Date getRetirementDate() {
		return retirementDate;
	}

	/**
	 * @param retirementDate セットする retirementDate
	 */
	public void setRetirementDate(Date retirementDate) {
		this.retirementDate = retirementDate;
	}

	/**
	 * @return affiliation
	 */
	public String getAffiliation() {
		return affiliation;
	}

	/**
	 * @param affiliation セットする affiliation
	 */
	public void setAffiliation(String affiliation) {
		this.affiliation = affiliation;
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
	 * @return staffGrade
	 */
	public String getStaffGrade() {
		return staffGrade;
	}

	/**
	 * @param staffGrade セットする staffGrade
	 */
	public void setStaffGrade(String staffGrade) {
		this.staffGrade = staffGrade;
	}

	/**
	 * @return mainProcess
	 */
	public String getMainProcess() {
		return mainProcess;
	}

	/**
	 * @param mainProcess セットする mainProcess
	 */
	public void setMainProcess(String mainProcess) {
		this.mainProcess = mainProcess;
	}

	/**
	 * @return salespersonCode
	 */
	public int getSalespersonCode() {
		return salespersonCode;
	}

	/**
	 * @param salespersonCode セットする salespersonCode
	 */
	public void setSalespersonCode(int salespersonCode) {
		this.salespersonCode = salespersonCode;
	}

	/**
	 * @return ownerFlg
	 */
	public int getOwnerFlg() {
		return ownerFlg;
	}

	/**
	 * @param ownerFlg セットする ownerFlg
	 */
	public void setOwnerFlg(int ownerFlg) {
		this.ownerFlg = ownerFlg;
	}

	/**
	 * @return passCode
	 */
	public String getPassCode() {
		return passCode;
	}

	/**
	 * @param passCode セットする passCode
	 */
	public void setPassCode(String passCode) {
		this.passCode = passCode;
	}

	/**
	 * @return holidaySunFlg
	 */
	public int getHolidaySunFlg() {
		return holidaySunFlg;
	}

	/**
	 * @param holidaySunFlg セットする holidaySunFlg
	 */
	public void setHolidaySunFlg(int holidaySunFlg) {
		this.holidaySunFlg = holidaySunFlg;
	}

	/**
	 * @return holidayMonFlg
	 */
	public int getHolidayMonFlg() {
		return holidayMonFlg;
	}

	/**
	 * @param holidayMonFlg セットする holidayMonFlg
	 */
	public void setHolidayMonFlg(int holidayMonFlg) {
		this.holidayMonFlg = holidayMonFlg;
	}

	/**
	 * @return holidayTueFlg
	 */
	public int getHolidayTueFlg() {
		return holidayTueFlg;
	}

	/**
	 * @param holidayTueFlg セットする holidayTueFlg
	 */
	public void setHolidayTueFlg(int holidayTueFlg) {
		this.holidayTueFlg = holidayTueFlg;
	}

	/**
	 * @return holidayWedFlg
	 */
	public int getHolidayWedFlg() {
		return holidayWedFlg;
	}

	/**
	 * @param holidayWedFlg セットする holidayWedFlg
	 */
	public void setHolidayWedFlg(int holidayWedFlg) {
		this.holidayWedFlg = holidayWedFlg;
	}

	/**
	 * @return holidayThuFlg
	 */
	public int getHolidayThuFlg() {
		return holidayThuFlg;
	}

	/**
	 * @param holidayThuFlg セットする holidayThuFlg
	 */
	public void setHolidayThuFlg(int holidayThuFlg) {
		this.holidayThuFlg = holidayThuFlg;
	}

	/**
	 * @return holidayFriFlg
	 */
	public int getHolidayFriFlg() {
		return holidayFriFlg;
	}

	/**
	 * @param holidayFriFlg セットする holidayFriFlg
	 */
	public void setHolidayFriFlg(int holidayFriFlg) {
		this.holidayFriFlg = holidayFriFlg;
	}

	/**
	 * @return holidaySatFlg
	 */
	public int getHolidaySatFlg() {
		return holidaySatFlg;
	}

	/**
	 * @param holidaySatFlg セットする holidaySatFlg
	 */
	public void setHolidaySatFlg(int holidaySatFlg) {
		this.holidaySatFlg = holidaySatFlg;
	}

	/**
	 * @return paidLeaveRemaing
	 */
	public BigDecimal getPaidLeaveRemaing() {
		return paidLeaveRemaing;
	}

	/**
	 * @param paidLeaveRemaing セットする paidLeaveRemaing
	 */
	public void setPaidLeaveRemaing(BigDecimal paidLeaveRemaing) {
		this.paidLeaveRemaing = paidLeaveRemaing;
	}

	/**
	 * @return note
	 */
	public String getNote() {
		return note;
	}

	/**
	 * @param note セットする note
	 */
	public void setNote(String note) {
		this.note = note;
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

	/**
	 * @param staffCode セットする staffCode
	 */
	public void setStaffCode(String staffCode) {
		this.staffCode = staffCode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((affiliation == null) ? 0 : affiliation.hashCode());
		result = prime * result + ((createDate == null) ? 0 : createDate.hashCode());
		result = prime * result + ((createUser == null) ? 0 : createUser.hashCode());
		result = prime * result + ((employmentDate == null) ? 0 : employmentDate.hashCode());
		result = prime * result + holidayFriFlg;
		result = prime * result + holidayMonFlg;
		result = prime * result + holidaySatFlg;
		result = prime * result + holidaySunFlg;
		result = prime * result + holidayThuFlg;
		result = prime * result + holidayTueFlg;
		result = prime * result + holidayWedFlg;
		result = prime * result + ((lastUpdateDate == null) ? 0 : lastUpdateDate.hashCode());
		result = prime * result + ((lastUpdateUser == null) ? 0 : lastUpdateUser.hashCode());
		result = prime * result + ((mainProcess == null) ? 0 : mainProcess.hashCode());
		result = prime * result + ((note == null) ? 0 : note.hashCode());
		result = prime * result + ownerFlg;
		result = prime * result + ((paidLeaveRemaing == null) ? 0 : paidLeaveRemaing.hashCode());
		result = prime * result + ((passCode == null) ? 0 : passCode.hashCode());
		result = prime * result + ((retirementDate == null) ? 0 : retirementDate.hashCode());
		result = prime * result + salespersonCode;
		result = prime * result + ((staffCode == null) ? 0 : staffCode.hashCode());
		result = prime * result + ((staffFurigana == null) ? 0 : staffFurigana.hashCode());
		result = prime * result + ((staffGrade == null) ? 0 : staffGrade.hashCode());
		result = prime * result + ((staffName == null) ? 0 : staffName.hashCode());
		result = prime * result + ((workBaseCode == null) ? 0 : workBaseCode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StaffInfo other = (StaffInfo) obj;
		if (affiliation == null) {
			if (other.affiliation != null)
				return false;
		} else if (!affiliation.equals(other.affiliation))
			return false;
		if (createDate == null) {
			if (other.createDate != null)
				return false;
		} else if (!createDate.equals(other.createDate))
			return false;
		if (createUser == null) {
			if (other.createUser != null)
				return false;
		} else if (!createUser.equals(other.createUser))
			return false;
		if (employmentDate == null) {
			if (other.employmentDate != null)
				return false;
		} else if (!employmentDate.equals(other.employmentDate))
			return false;
		if (holidayFriFlg != other.holidayFriFlg)
			return false;
		if (holidayMonFlg != other.holidayMonFlg)
			return false;
		if (holidaySatFlg != other.holidaySatFlg)
			return false;
		if (holidaySunFlg != other.holidaySunFlg)
			return false;
		if (holidayThuFlg != other.holidayThuFlg)
			return false;
		if (holidayTueFlg != other.holidayTueFlg)
			return false;
		if (holidayWedFlg != other.holidayWedFlg)
			return false;
		if (lastUpdateDate == null) {
			if (other.lastUpdateDate != null)
				return false;
		} else if (!lastUpdateDate.equals(other.lastUpdateDate))
			return false;
		if (lastUpdateUser == null) {
			if (other.lastUpdateUser != null)
				return false;
		} else if (!lastUpdateUser.equals(other.lastUpdateUser))
			return false;
		if (mainProcess == null) {
			if (other.mainProcess != null)
				return false;
		} else if (!mainProcess.equals(other.mainProcess))
			return false;
		if (note == null) {
			if (other.note != null)
				return false;
		} else if (!note.equals(other.note))
			return false;
		if (ownerFlg != other.ownerFlg)
			return false;
		if (paidLeaveRemaing == null) {
			if (other.paidLeaveRemaing != null)
				return false;
		} else if (!paidLeaveRemaing.equals(other.paidLeaveRemaing))
			return false;
		if (passCode == null) {
			if (other.passCode != null)
				return false;
		} else if (!passCode.equals(other.passCode))
			return false;
		if (retirementDate == null) {
			if (other.retirementDate != null)
				return false;
		} else if (!retirementDate.equals(other.retirementDate))
			return false;
		if (salespersonCode != other.salespersonCode)
			return false;
		if (staffCode == null) {
			if (other.staffCode != null)
				return false;
		} else if (!staffCode.equals(other.staffCode))
			return false;
		if (staffFurigana == null) {
			if (other.staffFurigana != null)
				return false;
		} else if (!staffFurigana.equals(other.staffFurigana))
			return false;
		if (staffGrade == null) {
			if (other.staffGrade != null)
				return false;
		} else if (!staffGrade.equals(other.staffGrade))
			return false;
		if (staffName == null) {
			if (other.staffName != null)
				return false;
		} else if (!staffName.equals(other.staffName))
			return false;
		if (workBaseCode == null) {
			if (other.workBaseCode != null)
				return false;
		} else if (!workBaseCode.equals(other.workBaseCode))
			return false;
		return true;
	}
}
