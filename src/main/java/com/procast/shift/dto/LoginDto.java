package com.procast.shift.dto;

import java.util.List;

import com.procast.shift.entity.Feature;
import com.procast.shift.entity.StaffInfo;

import lombok.Data;

@Data
public class LoginDto {

	/** ユーザー情報 */
	private StaffInfo userInfo;

	/** 機能情報のリスト */
	private List<Feature> featureList;
}
