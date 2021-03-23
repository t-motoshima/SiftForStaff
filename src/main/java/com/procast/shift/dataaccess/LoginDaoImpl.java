package com.procast.shift.dataaccess;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.util.Date;

import org.springframework.stereotype.Repository;

import com.procast.shift.entity.StaffInfo;

@Repository
class LoginDaoImpl implements LoginDao {

	static final int STAFF_FLAG = 0;
	static final int OWNER_FLAG = 1;

	@Override
	public StaffInfo getStaffInfoLogin(String staffCode, String passCode) throws Exception {
		StaffInfo staffInfo = new StaffInfo();
		// TODO とりあえずいまは固定値だよー
		staffInfo.setStaffCode("S99999");
		staffInfo.setStaffName("山田花子");
		staffInfo.setStaffFurigana("やまだはなこ");
		staffInfo.setEmploymentDate(DateFormat.getDateInstance().parse("2020/12/1"));
		staffInfo.setRetirementDate(null);
		staffInfo.setAffiliation("PCL(派遣)");
		staffInfo.setWorkBaseCode("NRT");
		staffInfo.setStaffGrade("スポット");
		staffInfo.setMainProcess("出荷");
		staffInfo.setSalespersonCode(54321);
		staffInfo.setOwnerFlg(0);
		staffInfo.setPassCode(passCode);
		staffInfo.setHolidaySunFlg(1);
		staffInfo.setHolidayMonFlg(0);
		staffInfo.setHolidayTueFlg(0);
		staffInfo.setHolidayWedFlg(0);
		staffInfo.setHolidayThuFlg(0);
		staffInfo.setHolidayFriFlg(0);
		staffInfo.setHolidaySatFlg(1);
		staffInfo.setPaidLeaveRemaing(BigDecimal.ONE);
		staffInfo.setCreateDate(new Date());
		staffInfo.setCreateUser("S11111");
		staffInfo.setLastUpdateDate(new Date());
		staffInfo.setLastUpdateUser("S11111");

		return staffInfo;
	}
}
