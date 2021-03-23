package com.procast.shift.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.procast.shift.dataaccess.RegistrationFromDao;
import com.procast.shift.dataaccess.UserDao;
import com.procast.shift.dto.EditStaffDto;
import com.procast.shift.dto.UserFromItemDto;
import com.procast.shift.entity.StaffInfo;
import com.procast.shift.entity.StaffShiftPattern;
import com.procast.shift.entity.SubWorkProcess;

/**
 * ユーザー一覧用のService
 *
 * @author takata
 *
 */
@Service
public class UserListServiceImpl implements UserListService {

	static final int STAFF_FLAG = 0;
	static final int OWNER_FLAG = 1;

	// ユーザー情報のDao
	@Autowired
	private UserDao userDao;
	// フォーム情報のDao
	@Autowired
	private RegistrationFromDao registrationFromDao;

	@Override
	public List<StaffInfo> getStaffList() throws Exception {
		//ユーザー一覧を取得
		return userDao.getUserList(STAFF_FLAG);
	}

	@Override
	public EditStaffDto getEditStaff(String staffCode) throws Exception {
		//編集スタッフのDTO
		EditStaffDto editStaffFrom = new EditStaffDto();
		//編集スタッフ情報をセット
		StaffInfo editStaffInfo = userDao.getUserInfo(staffCode);
		editStaffFrom.setEditStaffInfo(editStaffInfo);

		//フォームにセットする要素を取得(設定済と比較するため)
		UserFromItemDto createStaffRegistrationFrom = registrationFromDao.createStaffRegistrationFrom(staffCode);

		//スタッフのシフトパターンリスト
		List<StaffShiftPattern> staffShiftPattern = userDao.getShiftPaternList(staffCode);
		editStaffFrom.setCheckedShiftPatternList(staffShiftPattern);

		//サブ工程の選択済含むリスト
		List<SubWorkProcess> subWorkProcess = userDao.getSubProcessList(staffCode);
		editStaffFrom.setCheckedSubProcessList(subWorkProcess);

		return editStaffFrom;
	}

	@Override
	public List<StaffInfo> getOwnerList() throws Exception {
		//管理者一覧を取得
		List<StaffInfo> userList = userDao.getUserList(OWNER_FLAG);

		return userList;
	}
}
