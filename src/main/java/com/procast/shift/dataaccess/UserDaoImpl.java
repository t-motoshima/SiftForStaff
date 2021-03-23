package com.procast.shift.dataaccess;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.procast.shift.entity.StaffInfo;
import com.procast.shift.entity.StaffShiftPattern;
import com.procast.shift.entity.SubWorkProcess;

@Repository
class UserDaoImpl implements UserDao {

	//フラグの定数
	static final int STAFF_FLAG = 0;
	static final int OWNER_FLAG = 1;

	@Override
	public StaffInfo getUserInfo(String staffCode) throws Exception {
		StaffInfo userInfo = new StaffInfo();
		// TODO とりあえずいまは固定値だよー
		userInfo.setStaffCode(staffCode);
		userInfo.setStaffName("笹山芳人");
		userInfo.setStaffFurigana("ささやまよしと");
		userInfo.setEmploymentDate(DateFormat.getDateInstance().parse("2020/12/1"));
		userInfo.setRetirementDate(null);
		userInfo.setAffiliation("A002");
		userInfo.setWorkBaseCode("WB002");
		userInfo.setStaffGrade("G002");
		userInfo.setMainProcess("F00003");
		userInfo.setSalespersonCode(12345);
		userInfo.setOwnerFlg(0);
		userInfo.setPassCode("pass");
		userInfo.setHolidaySunFlg(1);
		userInfo.setHolidayMonFlg(0);
		userInfo.setHolidayTueFlg(0);
		userInfo.setHolidayWedFlg(1);
		userInfo.setHolidayThuFlg(0);
		userInfo.setHolidayFriFlg(0);
		userInfo.setHolidaySatFlg(1);
		userInfo.setPaidLeaveRemaing(BigDecimal.ONE);
		userInfo.setCreateDate(new Date());
		userInfo.setCreateUser("S11111");
		userInfo.setLastUpdateDate(new Date());
		userInfo.setLastUpdateUser("S11111");

		return userInfo;
	}

	@Override
	public List<StaffInfo> getUserList() throws Exception {
		List<StaffInfo> userList = new ArrayList<StaffInfo>();
		// TODO とりあえずいまは固定値だよー
		userList.add(new StaffInfo("S10001", "名取 慎治", "なとり しんじ", DateFormat.getDateInstance().parse("2020/12/1"), null, "PCL(SP)", "NRT", "レギュラー", "入荷検品", 10001, 0, "pass", 1 , 0, 0, 0, 0, 0, 1, BigDecimal.ONE, new Date(), "S11111", new Date(), "S11111"));
		userList.add(new StaffInfo("S20002", "藪元 真奈巳", "やぶもと まなみ", DateFormat.getDateInstance().parse("2019/12/1"), null, "PCL(SP)", "KIX", "レギュラー", "入荷検品", 20002, 0, "pass", 1 , 0, 0, 0, 0, 0, 1, BigDecimal.ONE, new Date(), "S11111", new Date(), "S11111"));
		userList.add(new StaffInfo("S30003", "生川 ちか子", "いくかわ ちかこ", DateFormat.getDateInstance().parse("2015/12/1"), null, "PCL派遣", "NRT", "スポット", "出荷", 30003, 0, "pass", 1 , 0, 0, 0, 0, 0, 1, BigDecimal.ONE, new Date(), "S11111", new Date(), "S11111"));
		userList.add(new StaffInfo("S40004", "牧ノ瀬 砂羽", "まきのせ さわ", DateFormat.getDateInstance().parse("2020/11/1"), null, "PCL派遣", "KIX", "スポット", "出荷", 40004, 0, "pass", 1 , 0, 0, 0, 0, 0, 1, BigDecimal.ONE, new Date(), "S11111", new Date(), "S11111"));
		userList.add(new StaffInfo("S50005", "花島 英晃", "はなじま えいじ", DateFormat.getDateInstance().parse("2020/12/1"), null, "アデコ", "NRT", "スポット", "在庫管理", 50005, 0, "pass", 1 , 0, 0, 0, 0, 0, 1, BigDecimal.ONE, new Date(), "S11111", new Date(), "S11111"));
		userList.add(new StaffInfo("S60006", "小手川  一俊", "こてがわ かずとし", DateFormat.getDateInstance().parse("2020/12/1"), null, "アデコ", "KIX", "スポット", "在庫管理", 60006, 0, "pass", 1 , 0, 0, 0, 0, 0, 1, BigDecimal.ONE, new Date(), "S11111", new Date(), "S11111"));

		return userList;
	}

	@Override
	public List<StaffInfo> getUserList(int ownerFlag) throws Exception {
		// TODO とりあえずいまは固定値だよー
		//戻り値のためのリスト作成
		List<StaffInfo> userList = new ArrayList<StaffInfo>();
		if (ownerFlag == STAFF_FLAG) {
			userList.add(new StaffInfo("S10001", "名取 慎治", "なとり しんじ", DateFormat.getDateInstance().parse("2020/12/1"), null, "PCL(SP)", "NRT", "レギュラー", "入荷検品", 10001, 0, "pass", STAFF_FLAG, 0, 0, 0, 0, 0, 1, BigDecimal.ONE, new Date(), "S11111", new Date(), "S11111"));
			userList.add(new StaffInfo("S20002", "藪元 真奈巳", "やぶもと まなみ", DateFormat.getDateInstance().parse("2019/12/1"), null, "PCL(SP)", "KIX", "レギュラー", "入荷検品", 20002, 0, "pass", STAFF_FLAG, 0, 0, 0, 0, 0, 1, BigDecimal.ONE, new Date(), "S11111", new Date(), "S11111"));
			userList.add(new StaffInfo("S30003", "生川 ちか子", "いくかわ ちかこ", DateFormat.getDateInstance().parse("2015/12/1"), null, "PCL派遣", "NRT", "スポット", "出荷", 30003, 0, "pass", STAFF_FLAG, 0, 0, 0, 0, 0, 1, BigDecimal.ONE, new Date(), "S11111", new Date(), "S11111"));
			userList.add(new StaffInfo("S40004", "牧ノ瀬 砂羽", "まきのせ さわ", DateFormat.getDateInstance().parse("2020/11/1"), null, "PCL派遣", "KIX", "スポット", "出荷", 40004, 0, "pass", STAFF_FLAG, 0, 0, 0, 0, 0, 1, BigDecimal.ONE, new Date(), "S11111", new Date(), "S11111"));
			userList.add(new StaffInfo("S50005", "花島 英晃", "はなじま えいじ", DateFormat.getDateInstance().parse("2020/12/1"), null, "アデコ", "NRT", "スポット", "在庫管理", 50005, 0, "pass", STAFF_FLAG, 0, 0, 0, 0, 0, 1, BigDecimal.ONE, new Date(), "S11111", new Date(), "S11111"));
			userList.add(new StaffInfo("S60006", "小手川  一俊", "こてがわ かずとし", DateFormat.getDateInstance().parse("2020/12/1"), null, "アデコ", "KIX", "スポット", "在庫管理", 60006, 0, "pass", STAFF_FLAG, 0, 0, 0, 0, 0, 1, BigDecimal.ONE, new Date(), "S11111", new Date(), "S11111"));
		} else if(ownerFlag == OWNER_FLAG) {
			userList.add(new StaffInfo("S10011", "西別府 知貴", "にしべっぷ ともき", DateFormat.getDateInstance().parse("2020/12/1"), null, "PCL", "NRT", "レギュラー", "", 00000, 0, "pass", OWNER_FLAG, 0, 0, 0, 0, 0, 1, BigDecimal.valueOf(11), new Date(), "S11111", new Date(), "S11111"));
			userList.add(new StaffInfo("S20022", "宮澤 公太郎", "みやさわ こうたろう", DateFormat.getDateInstance().parse("2019/12/1"), null, "PCL", "KIX", "レギュラー", "", 00000, 0, "pass", OWNER_FLAG, 0, 0, 0, 0, 0, 1, BigDecimal.valueOf(18), new Date(), "S11111", new Date(), "S11111"));
			userList.add(new StaffInfo("S30033", "川福 まり香", "かわふく まりか", DateFormat.getDateInstance().parse("2015/12/1"), null, "PCL(SP)", "NRT", "レギュラー", "", 00000, 0, "pass", OWNER_FLAG , 0, 0, 0, 0, 0, 1, BigDecimal.valueOf(8), new Date(), "S11111", new Date(), "S11111"));
			userList.add(new StaffInfo("S40044", "水岡 七海", "みずおか なみ", DateFormat.getDateInstance().parse("2020/11/1"), null, "PCL(SP)", "KIX", "レギュラー", "", 00000, 0, "pass", OWNER_FLAG, 0, 0, 0, 0, 0, 1, BigDecimal.valueOf(2), new Date(), "S11111", new Date(), "S11111"));
			userList.add(new StaffInfo("S50055", "藤堂 千陽", "とうどう ちはる", DateFormat.getDateInstance().parse("2020/12/1"), null, "PCL(支社)", "NRT", "レギュラー", "", 00000, 0, "pass", OWNER_FLAG, 0, 0, 0, 0, 0, 1, BigDecimal.valueOf(13), new Date(), "S11111", new Date(), "S11111"));
			userList.add(new StaffInfo("S60066", "榎原 一政", "えはら かずまさ", DateFormat.getDateInstance().parse("2020/12/1"), null, "PCL(支社)", "KIX", "レギュラー", "", 00000, 0, "pass", OWNER_FLAG, 0, 0, 0, 0, 0, 1, BigDecimal.valueOf(21), new Date(), "S11111", new Date(), "S11111"));
		} else {
			//変な値が入ってきたときの処理
		}
		return userList;
	}

	@Override
	public List<SubWorkProcess> getSubProcessList(String staffCode) throws Exception {
		// TODO とりあえず固定値
		List<SubWorkProcess> subProcessList = new ArrayList<SubWorkProcess>();
		subProcessList.add(new SubWorkProcess(staffCode, "NRT1", "F00002", "出荷"));
		subProcessList.add(new SubWorkProcess(staffCode, "NRT1", "F00003", "在庫管理"));
		subProcessList.add(new SubWorkProcess(staffCode, "NRT1", "F00005", "SK"));
		subProcessList.add(new SubWorkProcess(staffCode, "NRT1", "F00006", "松山"));
		return subProcessList;
	}

	@Override
	public List<StaffShiftPattern> getShiftPaternList(String staffCode) throws Exception {
		// TODO とりあえず固定値
		List<StaffShiftPattern> shiftPaternList = new ArrayList<StaffShiftPattern>();
		shiftPaternList.add(new StaffShiftPattern(staffCode, "Z", "8:00", "17:00", "8"));
		shiftPaternList.add(new StaffShiftPattern(staffCode, "Z-1", "8:00", "16:00", "7"));
		shiftPaternList.add(new StaffShiftPattern(staffCode, "A", "9:00", "18:00", "8"));
		shiftPaternList.add(new StaffShiftPattern(staffCode, "A-5", "9:00", "13:00", "3"));
		shiftPaternList.add(new StaffShiftPattern(staffCode, "B-2", "10:00", "17:00", "6"));
		return shiftPaternList;
	}
}