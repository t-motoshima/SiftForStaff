package com.procast.shift.service;

import java.util.List;

import com.procast.shift.dto.EditStaffDto;
import com.procast.shift.entity.StaffInfo;

/**
 * ユーザー一覧のService
 *
 * @author takata
 *
 */
public interface UserListService {
	/**
	 * スタッフ一覧取得
	 *
	 * @return
	 * @throws Exception
	 */
	List<StaffInfo> getStaffList() throws Exception;

	/**
	 * 編集するスタッフを取得する。
	 *
	 * @param staffCode
	 * @return
	 * @throws Exception
	 */
	EditStaffDto getEditStaff(String staffCode) throws Exception;

	/**
	 * 管理者一覧取得
	 *
	 * @return
	 * @throws Exception
	 */
	List<StaffInfo> getOwnerList() throws Exception;

}
