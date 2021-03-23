package com.procast.shift.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.procast.shift.dto.EditStaffDto;
import com.procast.shift.dto.StaffRegistrationFrom;
import com.procast.shift.entity.StaffInfo;
import com.procast.shift.service.RegistrationFromService;
import com.procast.shift.service.UserListService;

@Controller
public class MypageController {
	//スタッフリストのService
	@Autowired
	UserListService userListService;

	//フォーム情報用のService
	@Autowired
	RegistrationFromService registrationFromService;

	@ModelAttribute("staffRegistrationFrom")
	StaffRegistrationFrom setUpForm(Model model) {
		return new StaffRegistrationFrom();
	}

	@RequestMapping(value = "/mypage", method = RequestMethod.GET)
	public String welcom(Model model) throws Exception {
		//フォームの情報のDTO
		//編集スタッフ情報
		EditStaffDto editStaffInfo = userListService.getEditStaff("12345");

		//フォームを変換する
		model.addAttribute("editStaffFrom", convertEditForm(editStaffInfo.getEditStaffInfo()));
		//サブ工程のリスト
		model.addAttribute("editSubProcessList", editStaffInfo.getCheckedSubProcessList());
		//シフトパターンのリスト
		model.addAttribute("editShiftPatternList", editStaffInfo.getCheckedShiftPatternList());
		return "mypage";
	}

	/**
	 * ユーザーのデータをFormへ変換する
	 *
	 * @param editUser
	 * @return
	 */
	private StaffRegistrationFrom convertEditForm(StaffInfo editUser) {
		StaffRegistrationFrom editStaffFrom = new StaffRegistrationFrom();
		editStaffFrom.setStaffCode(editUser.getStaffCode());
		editStaffFrom.setStaffName(editUser.getStaffName());
		editStaffFrom.setStaffFurigana(editUser.getStaffFurigana());
		editStaffFrom.setEmploymentDate(editUser.getEmploymentDate().toString());
		editStaffFrom.setSalespersonCode(Integer.toString(editUser.getSalespersonCode()));
		editStaffFrom.setPassCode(editUser.getPassCode());
		editStaffFrom.setPaidLeaveRemaing(0);
		editStaffFrom.setStaffGrade(editUser.getStaffGrade());
		editStaffFrom.setAffiliation(editUser.getAffiliation());
		editStaffFrom.setWorkBaseCode(editUser.getWorkBaseCode());
		editStaffFrom.setMainProcess(editUser.getMainProcess());
		editStaffFrom.setNote(editUser.getNote());

		return editStaffFrom;
	}
}
