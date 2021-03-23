package com.procast.shift.dto;

import java.util.List;

import com.procast.shift.entity.Feature;
import com.procast.shift.entity.StaffShiftPattern;
import com.procast.shift.entity.SubWorkProcess;

import lombok.Data;
/**
 * フォームの設定値
 *
 * @author takata
 *
 */
@Data
public class UserFromItemDto {
	/** 工程のリスト */
	List<SubWorkProcess> workProcessList;

	/** シフトパターンのリスト */
	List<StaffShiftPattern> shiftPatternList;

	/** 機能のリスト */
	List<Feature> featureList;
}
