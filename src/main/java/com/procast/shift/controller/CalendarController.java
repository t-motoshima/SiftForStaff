package com.procast.shift.controller;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.procast.shift.entity.CalendarOutput;
import com.procast.shift.entity.MonthlyStaffShift;
@Controller
@RequestMapping(value = "/calendar", method = RequestMethod.GET)
public class CalendarController {

    @RequestMapping
    public String today(Model model) {
        LocalDate today = LocalDate.now();
        int year = today.getYear();
        int month = today.getMonth().getValue();
        return month(year, month, model);
    }

    @RequestMapping(value = "month")
    public String month(@RequestParam("year") int year,
            @RequestParam("month") int month, Model model) {
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        LocalDate lastDayOfMonth = LocalDate.of(year, month,LocalDate.of(year, month, 1).lengthOfMonth());

        LocalDate firstDayOfCalendar = firstDayOfMonth.with(DayOfWeek.MONDAY);
        LocalDate lastDayOfCalendar = lastDayOfMonth;

//        List<List<LocalDate>> calendar = new ArrayList<List<LocalDate>>();
//        List<LocalDate> weekList = null;

        List<List<MonthlyStaffShift>> calendar = new ArrayList<List<MonthlyStaffShift>>();
        List<MonthlyStaffShift> weekList = null;

        for (int i = 0; i < 100; i++) {
            LocalDate d = firstDayOfCalendar.plusDays(i);
            if (d.isAfter(lastDayOfCalendar)) {
                break;
            }

            if (weekList == null) {
                weekList = new ArrayList<MonthlyStaffShift>();
                calendar.add(weekList);
            }

            if (d.isBefore(firstDayOfMonth) || d.isAfter(lastDayOfMonth)) {
                weekList.add(null);
            } else {
                weekList.add(new MonthlyStaffShift("1234",d,year,month,d.getDayOfMonth(),d.getDayOfWeek().getValue(),"棚入れ","A","承認済み"));
            }

            int week = d.getDayOfWeek().getValue();
            if (week == DayOfWeek.SUNDAY.getValue()) {
                weekList = null;
            }
        }

        LocalDate nextMonth = firstDayOfMonth.plusMonths(1);
        LocalDate prevMonth = firstDayOfMonth.minusMonths(1);
        CalendarOutput output = new CalendarOutput();
        output.setCalendar(calendar);
        output.setFirstDayOfMonth(firstDayOfMonth);
        output.setYearOfNextMonth(nextMonth.getYear());
        output.setMonthOfNextMonth(nextMonth.getMonth().getValue());
        output.setYearOfPrevMonth(prevMonth.getYear());
        output.setMonthOfPrevMonth(prevMonth.getMonth().getValue());

        model.addAttribute("output", output);

        return "calendar";
    }
}
