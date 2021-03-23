package com.procast.shift.dataaccess;

import java.util.List;

import com.procast.shift.entity.ShiftCalendar;
import com.procast.shift.entity.StaffShift;

public interface StaffShiftDao {

	/**
	 * カレンダーを取得する
	 *
	 * @return
	 * @throws Exception
	 */
	List<ShiftCalendar> getShiftCalendarList() throws Exception;

	/**
	 * 引数の月のカレンダーを取得する
	 *
	 * @param month
	 * @return
	 * @throws Exception
	 */
	List<ShiftCalendar> getMonthlyShiftCalendarList(int month) throws Exception;

	/**
	 * シフトを取得する
	 * @return
	 * @throws Exception
	 */
	List<StaffShift> getAllStaffShiftList() throws Exception;

	/**
	 * 1ヶ月のリストを取得する
	 *
	 * @param month
	 * @return
	 * @throws Exception
	 */
	List<StaffShift> getMonthlyShiftList(int month) throws Exception;

	/**
	 * スタッフコードと1ヶ月のリストを取得する
	 *
	 * @param staffCode
	 * @param month
	 * @return
	 * @throws Exception
	 */
	List<StaffShift> getMonthlyStaffShiftList(String staffCode, int month) throws Exception;
}
