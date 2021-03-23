package com.procast.shift.entity;

import java.time.LocalDate;
import java.util.List;

import lombok.Data;

@Data
public class CalendarOutput {

    private List<List<MonthlyStaffShift>> calendar;

    private LocalDate firstDayOfMonth;

    private int yearOfNextMonth;

    private int monthOfNextMonth;

    private int yearOfPrevMonth;

    private int monthOfPrevMonth;

    // omitted getter/setter
}