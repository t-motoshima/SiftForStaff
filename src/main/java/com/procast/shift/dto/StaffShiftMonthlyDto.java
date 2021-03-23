package com.procast.shift.dto;

import java.util.List;

import com.procast.shift.entity.StaffShift;

import lombok.Data;

/**
 * スタッフのシフトDTO
 *
 * @author takata
 *
 */
@Data
public class StaffShiftMonthlyDto {

	/** スタッフコード */
	private String staffCode;

	/** 氏名 */
	private String staffName;

	/** スタッフシフトのリスト */
	List<StaffShift> staffShiftList;

}
