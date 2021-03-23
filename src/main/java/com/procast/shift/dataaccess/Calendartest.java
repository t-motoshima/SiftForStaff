package com.procast.shift.dataaccess;


import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
public class Calendartest {


    /*************************
     * フィールド
     *************************/

    //カレンダーマトリックス用の配列
    public int[][] calendarMatrix;

    //カレンダー月の年月
    private Year year;

    //月初用LocalDate
    LocalDate ld;

    /***********************
     * コンストラクタ
     ***********************/

    //今年をセット
    public Calendartest() {
        this.setYear();
    }


    /***********************
     * メソッド
     ***********************/

    //year setter
    private void setYear() {
        this.year = Year.now();
    }

    //今年のyearを返す
    private Year getYear() {
        return this.year;
    }

    //指定月の月初setter
    private void setLd(int month) {
        this.ld = LocalDate.of(this.getYear().getValue(), month, 1);
    }

    //指定月の月初getter
    private LocalDate getLd() {
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

    //それぞれの月の配列に日数を入れ込む
    public void calcFields() {

        int row = 0;
        int column = getFirstDay();

        for(int date = 1; date <= getMonthLength(); date++) {
            this.calendarMatrix[row][column] = date;
            if(column == 6) {
                row++;
                column = 0;
            } else {
                column++;
            }
        }
    }


    @Override
    public String toString() {

        //入れ込み用builder
        StringBuilder sb = new StringBuilder();

        //3桁表示のためのフォーマット指定
        final String FORMAT = "%3d";

        for (int n = 1; n <= 12; n++) {

            this.calendarMatrix = new int[6][7];
            this.setLd(n);

            calcFields();
            sb.append(getYear() + "年" + n + "月");
            sb.append("\r\n");

            //入れ込むために回す/縦6回
            for (int i = 0; i < calendarMatrix.length; i++) {

                //横7回
                for (int j = 0; j < calendarMatrix[i].length; j++) {
                    int date = calendarMatrix[i][j];

                    //初期値のままのものは空文字埋め
                    if (date == 0) {
                        sb.append("   ");

                    //数字はフォーマット指定して入れ込み
                    } else {
                        sb.append(String.format(FORMAT,date));
                    }
                }

                //一週間で改行
                sb.append("\r\n");
            }

            //一月で改行
            sb.append("\r\n");

        }

            return sb.toString();
    }
}
