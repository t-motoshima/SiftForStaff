package com.procast.shift.service;

import com.procast.shift.dto.StaffShiftListDto;

/**
 * シフト一覧のService
 *
 * @author takata
 *
 */
public interface StaffShiftListService {

	/**
	 * シフト一覧全リスト取得のService
	 *
	 * @return
	 * @throws Exception
	 */
	StaffShiftListDto getAllStaffShiftList() throws Exception;

	/**
	 * 指定月のシフト取得
	 *
	 * @param month
	 * @return
	 * @throws Exception
	 */
	StaffShiftListDto getMonthlyStaffShiftList(int month) throws Exception;

}
