package com.procast.shift.dto;

import java.util.List;

import com.procast.shift.entity.StaffInfo;
import com.procast.shift.entity.StaffShiftPattern;
import com.procast.shift.entity.SubWorkProcess;

import lombok.Data;
/**
 * スタッフ編集のフォーム
 *
 * @author takata
 *
 */
@Data
public class EditStaffDto {

	/** ユーザー情報 */
	private StaffInfo editStaffInfo;

	/** サブ工程のリスト */
	private List<SubWorkProcess> checkedSubProcessList;

	/** シフトパターンのリスト */
	private List<StaffShiftPattern> checkedShiftPatternList;

}