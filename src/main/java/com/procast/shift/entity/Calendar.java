package com.procast.shift.entity;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

public class Calendar {


    /*************************
     * フィールド
     *************************/

    //カレンダーマトリックス用の配列
    public MonthlyStaffShift[][] calendarMatrix;
    //public int[][] calendarMatrix;

    //カレンダー月の年月
    private Year year;

    //月初用LocalDate
    LocalDate ld;

    /***********************
     * コンストラクタ
     ***********************/

    //今年をセット
    public Calendar() {
        this.setYear();
    }


    /***********************
     * メソッド
     ***********************/

    //year setter
    public void setYear() {
        this.year = Year.now();
    }

    //今年のyearを返す
    public Year getYear() {
        return this.year;
    }

    //指定月の月初setter
    public void setLd(int month) {
        this.ld = LocalDate.of(this.getYear().getValue(), month, 1);
    }

    //指定月の月初getter
    public LocalDate getLd() {
        return this.ld;
    }


    //指定月の長さを取り出す
    private int getMonthLength() {
        Month thisMonth = Month.from(getLd());
        return thisMonth.length(this.ld.isLeapYear());
    }

    //月初の曜日を取得
    private int getFirstDay() {
        return getLd().getDayOfWeek().getValue() - 1;       //月:0 火:1 水:2 ・・・
    }
}