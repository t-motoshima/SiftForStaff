package com.procast.shift.dto;

import java.util.List;

import com.procast.shift.entity.ShiftCalendar;
import com.procast.shift.entity.StaffInfo;

import lombok.Data;

/**
 * シフトリストのDTO
 *
 * @author takata
 *
 */
@Data
public class StaffShiftListDto {

	/** スタッフリスト */
	List<StaffInfo> staffList;

	/** カレンダーのリスト */
	List<ShiftCalendar> shiftCalendarList;

	/** スタッフとシフトのリスト */
	List<StaffShiftMonthlyDto> staffShiftMonthlyDto;
}
