package com.procast.shift.dataaccess;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.procast.shift.entity.Feature;

@Repository
public class FeatureDaoImpl implements FeatureDao {

	// 機能のリスト
	List<Feature> featureList = new ArrayList<Feature>();

	@Override
	public List<Feature> featureSearch(String staffCode) throws Exception {

		// TODO 取得したのをここでリストにつめる。とりあえず固定値
		featureList.add(new Feature("F0001", "シフト申請", "/shiftapplication", new Date(), "S0001", new Date(), "S0001"));
		featureList.add(new Feature("F0002", "マイシフト", "/shiftlist", new Date(), "S0001", new Date(), "S0001"));
		featureList.add(new Feature("F0011", "マイページ", "/mypage", new Date(), "S0001", new Date(), "S0001"));
		featureList.add(new Feature("F0012", "ヘルプ", "/help", new Date(), "S0001", new Date(), "S0001"));

		return featureList;
	}

}
