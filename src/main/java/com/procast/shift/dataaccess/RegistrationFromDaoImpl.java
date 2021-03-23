package com.procast.shift.dataaccess;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.procast.shift.dto.UserFromItemDto;
import com.procast.shift.entity.StaffShiftPattern;
import com.procast.shift.entity.SubWorkProcess;

@Repository
public class RegistrationFromDaoImpl implements RegistrationFromDao {


	@Override
	public UserFromItemDto createStaffRegistrationFrom() {


		//フォームの設定値を詰めるDTO
		UserFromItemDto userFromItem = new UserFromItemDto();
		// 拠点のリスト
		//List<WorkBase> workBaseList = new ArrayList<WorkBase>();



		// 工程のリスト
//		List<WorkProcess> workProcessList = new ArrayList<WorkProcess>();/
//		workProcessList.add(new WorkProcess("NRT1", "F00001", "入荷検品", new Date(), new Date()));
//		userFromItem.setWorkProcessList(workProcessList);
//		userFromItem.setWorkProcessList(WorkProcessMapper.selectWorkProcessAll());

		// シフトパターンのリスト
		List<StaffShiftPattern> staffShiftPattern = new ArrayList<StaffShiftPattern>();
		staffShiftPattern.add(new StaffShiftPattern("1234","A","09:00","18:00","8"));
		userFromItem.setShiftPatternList(staffShiftPattern);

		return userFromItem;
	}

	@Override
	public UserFromItemDto createOwnerRegistrationFrom() {
		//フォームの設定値を詰めるDTO
		UserFromItemDto userFromItem = new UserFromItemDto();

		return userFromItem;
	}

	@Override
	public UserFromItemDto createStaffRegistrationFrom(String staffCode) throws Exception {
		//フォームの設定値を詰めるDTO
		UserFromItemDto userFromItem = new UserFromItemDto();

		// 工程のリスト
		List<SubWorkProcess> workProcessList = new ArrayList<SubWorkProcess>();
		workProcessList.add(new SubWorkProcess("1234", "WB001","PR001", "入荷検品"));
		userFromItem.setWorkProcessList(workProcessList);

		// シフトパターンのリスト
		List<StaffShiftPattern> staffShiftPattern = new ArrayList<StaffShiftPattern>();
		staffShiftPattern.add(new StaffShiftPattern("1234","A","09:00","18:00","8"));
		userFromItem.setShiftPatternList(staffShiftPattern);

		return userFromItem;
	}

}
