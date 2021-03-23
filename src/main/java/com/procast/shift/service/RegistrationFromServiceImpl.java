package com.procast.shift.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.procast.shift.dataaccess.RegistrationFromDao;
import com.procast.shift.dto.StaffRegistrationFrom;
import com.procast.shift.dto.UserFromItemDto;

@Service
public class RegistrationFromServiceImpl implements RegistrationFromService {

	// フォーム情報のDao
	@Autowired
	private RegistrationFromDao registrationFromDao;

	@Override
	public UserFromItemDto getStaffFormItem() throws Exception {

		UserFromItemDto createStaffRegistrationFrom = registrationFromDao.createStaffRegistrationFrom();

		return createStaffRegistrationFrom;
	}

	@Override
	public void createStaff(StaffRegistrationFrom staffRegistrationFrom) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public UserFromItemDto getOwnerFormItem() throws Exception {

		UserFromItemDto createStaffRegistrationFrom = registrationFromDao.createOwnerRegistrationFrom();

		return createStaffRegistrationFrom;
	}


}
