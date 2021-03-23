package com.procast.shift.service;

import java.util.List;

import com.procast.shift.entity.week;

/**
 * ユーザー一覧のService
 *
 * @author
 *
 */
public interface WeekService {
	/**
	 * スタッフ一覧取得
	 *
	 * @return
	 * @throws Exception
	 */
	List<week> getWeekList() throws Exception;

	/**
	 * 編集するスタッフを取得する。
	 *
	 * @param staffCode
	 * @return
	 * @throws Exception
	 */
//	EditStaffDto getEditStaff(String staffCode) throws Exception;

	/**
	 * 管理者一覧取得
	 *
	 * @return
	 * @throws Exception
	 */
//	List<week> getWeekList() throws Exception;

}
