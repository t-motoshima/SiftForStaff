package com.procast.shift.dataaccess;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.procast.shift.entity.ShiftCalendar;
import com.procast.shift.entity.StaffShift;
@Repository
public class StaffShiftDaoImpl implements StaffShiftDao {

	@Override
	public List<ShiftCalendar> getShiftCalendarList() throws Exception {
		List<ShiftCalendar> staffCalendarList = new ArrayList<ShiftCalendar>();
		//TODO とりあえず固定値
		//TODO とりあえず固定値
		SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
		SimpleDateFormat monthFormat = new SimpleDateFormat("MM");
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd");
		SimpleDateFormat dayFormat = new SimpleDateFormat("E");

		Calendar cal = Calendar.getInstance();
		String  year = yearFormat.format(cal.getTime());
		String month = monthFormat.format(cal.getTime());

		//Calendarクラスは0~なので、1を引く
		cal.set(Integer.parseInt(year), Integer.parseInt(month), 1);
		int date = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

		String strDate;
		Date parseDate;
		for (int i = 0; i < date; i++) {
			strDate = year + "/"+ month +"/" + (i + 1);
			parseDate = DateFormat.getDateInstance().parse(strDate);

			staffCalendarList.add(new ShiftCalendar(parseDate, year, month, dateFormat.format(parseDate),dayFormat.format(parseDate)));
		}
		return staffCalendarList;
	}

	@Override
	public List<ShiftCalendar> getMonthlyShiftCalendarList(int month) throws Exception {
		List<ShiftCalendar> staffCalendarList = new ArrayList<ShiftCalendar>();
		//TODO とりあえず固定値
		SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd");
		SimpleDateFormat dayFormat = new SimpleDateFormat("E");

		Calendar cal = Calendar.getInstance();
		String  year = yearFormat.format(cal.getTime());
		//Calendarクラスは0~なので、1を引く
		cal.set(Integer.parseInt(year), month -1, 1);
		int date = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

		String strDate;
		Date parseDate;
		for (int i = 0; i < date; i++) {
			strDate = year + "/"+ month +"/" + (i + 1);
			parseDate = DateFormat.getDateInstance().parse(strDate);

			staffCalendarList.add(new ShiftCalendar(parseDate,
					year, Integer.toString(month),
					dateFormat.format(parseDate), dayFormat.format(parseDate)));
		}
		return staffCalendarList;
	}

	@Override
	public List<StaffShift> getAllStaffShiftList() throws Exception {
		List<StaffShift> staffShiftList = new ArrayList<StaffShift>();
		//TODO とりあえず固定値
		staffShiftList.add(new StaffShift("S11111", DateFormat.getDateInstance().parse("2021/2/1"), "Z", "8:00", "17:00", "8", DateFormat.getDateInstance().parse("2020/12/10")));
		staffShiftList.add(new StaffShift("S11111", DateFormat.getDateInstance().parse("2021/2/5"), "Z", "8:00", "17:00", "8", DateFormat.getDateInstance().parse("2020/12/10")));
		staffShiftList.add(new StaffShift("S11111", DateFormat.getDateInstance().parse("2021/2/7"), "Z", "8:00", "17:00", "8", DateFormat.getDateInstance().parse("2020/12/10")));
		staffShiftList.add(new StaffShift("S11111", DateFormat.getDateInstance().parse("2021/2/8"), "Z", "8:00", "17:00", "8", DateFormat.getDateInstance().parse("2020/12/10")));
		staffShiftList.add(new StaffShift("S11111", DateFormat.getDateInstance().parse("2021/2/16"), "Z", "8:00", "17:00", "8", DateFormat.getDateInstance().parse("2020/12/10")));
		staffShiftList.add(new StaffShift("S11111", DateFormat.getDateInstance().parse("2021/2/18"), "Z", "8:00", "17:00", "8", DateFormat.getDateInstance().parse("2020/12/10")));
		staffShiftList.add(new StaffShift("S11111", DateFormat.getDateInstance().parse("2021/2/21"), "Z", "8:00", "17:00", "8", DateFormat.getDateInstance().parse("2020/12/10")));

		staffShiftList.add(new StaffShift("S22222", DateFormat.getDateInstance().parse("2021/2/1"), "A-1", "9:00", "17:00", "8", DateFormat.getDateInstance().parse("2020/12/10")));
		staffShiftList.add(new StaffShift("S22222", DateFormat.getDateInstance().parse("2021/2/2"), "A", "9:00", "18:00", "8", DateFormat.getDateInstance().parse("2020/12/10")));
		staffShiftList.add(new StaffShift("S22222", DateFormat.getDateInstance().parse("2021/2/6"), "A-2", "9:00", "16:00", "8", DateFormat.getDateInstance().parse("2020/12/10")));
		staffShiftList.add(new StaffShift("S22222", DateFormat.getDateInstance().parse("2021/2/8"), "A-1", "9:00", "17:00", "8", DateFormat.getDateInstance().parse("2020/12/10")));
		staffShiftList.add(new StaffShift("S22222", DateFormat.getDateInstance().parse("2021/2/13"), "A-1", "9:00", "17:00", "8", DateFormat.getDateInstance().parse("2020/12/10")));
		staffShiftList.add(new StaffShift("S22222", DateFormat.getDateInstance().parse("2021/2/15"), "A", "9:00", "18:00", "8", DateFormat.getDateInstance().parse("2020/12/10")));
		staffShiftList.add(new StaffShift("S22222", DateFormat.getDateInstance().parse("2021/2/28"), "A", "9:00", "18:00", "8", DateFormat.getDateInstance().parse("2020/12/10")));

		return staffShiftList;
	}

	@Override
	public List<StaffShift> getMonthlyShiftList(int month) throws Exception {
		List<StaffShift> staffShiftList = new ArrayList<StaffShift>();
		//TODO とりあえず固定値
		staffShiftList.add(new StaffShift("S11111", DateFormat.getDateInstance().parse("2021/2/1"), "Z", "8:00", "17:00", "8", DateFormat.getDateInstance().parse("2020/12/10")));
		staffShiftList.add(new StaffShift("S11111", DateFormat.getDateInstance().parse("2021/2/5"), "Z", "8:00", "17:00", "8", DateFormat.getDateInstance().parse("2020/12/10")));
		staffShiftList.add(new StaffShift("S11111", DateFormat.getDateInstance().parse("2021/2/7"), "Z", "8:00", "17:00", "8", DateFormat.getDateInstance().parse("2020/12/10")));
		staffShiftList.add(new StaffShift("S11111", DateFormat.getDateInstance().parse("2021/2/8"), "Z", "8:00", "17:00", "8", DateFormat.getDateInstance().parse("2020/12/10")));
		staffShiftList.add(new StaffShift("S11111", DateFormat.getDateInstance().parse("2021/2/16"), "Z", "8:00", "17:00", "8", DateFormat.getDateInstance().parse("2020/12/10")));
		staffShiftList.add(new StaffShift("S11111", DateFormat.getDateInstance().parse("2021/2/18"), "Z", "8:00", "17:00", "8", DateFormat.getDateInstance().parse("2020/12/10")));
		staffShiftList.add(new StaffShift("S11111", DateFormat.getDateInstance().parse("2021/2/21"), "Z", "8:00", "17:00", "8", DateFormat.getDateInstance().parse("2020/12/10")));

		return staffShiftList;
	}

	@Override
	public List<StaffShift> getMonthlyStaffShiftList(String staffCode, int month) throws Exception {
		List<StaffShift> staffShiftList = new ArrayList<StaffShift>();
		//TODO とりあえず固定値
		staffShiftList.add(new StaffShift(staffCode, DateFormat.getDateInstance().parse("2021/2/1"), "Z", "8:00", "17:00", "8", DateFormat.getDateInstance().parse("2020/12/10")));
		staffShiftList.add(new StaffShift(staffCode, DateFormat.getDateInstance().parse("2021/2/5"), "Z", "8:00", "17:00", "8", DateFormat.getDateInstance().parse("2020/12/10")));
		staffShiftList.add(new StaffShift(staffCode, DateFormat.getDateInstance().parse("2021/2/7"), "Z", "8:00", "17:00", "8", DateFormat.getDateInstance().parse("2020/12/10")));
		staffShiftList.add(new StaffShift(staffCode, DateFormat.getDateInstance().parse("2021/2/8"), "Z", "8:00", "17:00", "8", DateFormat.getDateInstance().parse("2020/12/10")));
		staffShiftList.add(new StaffShift(staffCode, DateFormat.getDateInstance().parse("2021/2/16"), "Z", "8:00", "17:00", "8", DateFormat.getDateInstance().parse("2020/12/10")));
		staffShiftList.add(new StaffShift(staffCode, DateFormat.getDateInstance().parse("2021/2/18"), "Z", "8:00", "17:00", "8", DateFormat.getDateInstance().parse("2020/12/10")));
		staffShiftList.add(new StaffShift(staffCode, DateFormat.getDateInstance().parse("2021/2/21"), "Z", "8:00", "17:00", "8", DateFormat.getDateInstance().parse("2020/12/10")));

		return staffShiftList;
	}
}
