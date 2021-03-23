package com.procast.shift.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.procast.shift.dto.StaffShiftListDto;
import com.procast.shift.entity.Calendar;
import com.procast.shift.entity.MonthlyStaffShift;
import com.procast.shift.service.StaffShiftListService;
@Controller
public class ShiftListController {

	//シフトリストのService
	@Autowired
	StaffShiftListService staffShiftListService;

	@ModelAttribute
	StaffShiftListDto setUpForm() {
		return new StaffShiftListDto();
	}

	@RequestMapping(value = "/shiftlist", method = RequestMethod.GET)
	public String welcom(Model model) throws Exception{


		//System.out.println(new Calendar());

		Calendar cd = new Calendar();

		MonthlyStaffShift[][] cm = new MonthlyStaffShift[6][7];
/*
		cm[1][1].setStaffCode("1234");
		cm[1][1].setShiftYear(cd.getYear().getValue());
		cm[1][1].setShiftMonth(cd.getLd().getMonthValue());
		cm[1][1].setShiftDay(1);
		cm[1][1].setShiftWeekDay(null);
		cm[1][1].setProcess("入荷");
		cm[1][1].setShiftPatternCode("A");
*/

		List<MonthlyStaffShift> dataList = new ArrayList<MonthlyStaffShift>();
		//dataList.add(new MonthlyStaffShift("1234",2021, 3, 11, "木", "入荷", "A","承認済"));
		//dataList.add(new MonthlyStaffShift("1234",2021, 3, 12, "金", "出荷", "A","申請中"));
		model.addAttribute("dataList", dataList);
		//管理者一覧
		return "shiftlist";
	}
}
