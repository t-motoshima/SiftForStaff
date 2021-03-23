package com.procast.shift.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.procast.shift.dataaccess.FeatureDao;
import com.procast.shift.dataaccess.LoginDao;
import com.procast.shift.dto.LoginDto;
import com.procast.shift.entity.Feature;
import com.procast.shift.entity.StaffInfo;

@Service
public class LoginServiceImpl implements LoginService {

	// ユーザー情報のDao
	 @Autowired
	 private LoginDao loginDao;

	// 機能のDao
	 @Autowired
	 private FeatureDao featureDao;


	@Override
	public LoginDto findStaffInfo(String staffCode, String passCode) throws Exception {

		// ユーザー情報
		StaffInfo userInfo;

		userInfo = loginDao.getStaffInfoLogin(staffCode, passCode);

		// ユーザー情報が見つからない場合の処理
		if (userInfo == null) {
		}

		List<Feature> featureSearch = featureDao.featureSearch(staffCode);

		// 機能がからだった場合の処理
		if (CollectionUtils.isEmpty(featureSearch)) {
		}

		// ユーザー情報の返却
		LoginDto loginDto = new LoginDto();
		loginDto.setUserInfo(userInfo);
		loginDto.setFeatureList(featureSearch);

		return loginDto;
	}

}
