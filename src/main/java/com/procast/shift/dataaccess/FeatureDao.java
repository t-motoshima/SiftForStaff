package com.procast.shift.dataaccess;

import java.util.List;

import com.procast.shift.entity.Feature;

public interface FeatureDao {
	/**
	 * スタッフコードに紐づく機能を取得する。
	 *
	 * @param staffCode
	 * @return
	 * @throws Exception
	 */
	List<Feature> featureSearch(String staffCode) throws Exception;

}
