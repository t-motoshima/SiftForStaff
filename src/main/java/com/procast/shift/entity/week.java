package com.procast.shift.entity;

public class week {

	  private String[] weekday = new String[7];

	  public week() {
		  super();
	  }

	  public String getWeekday(int index) {
	    return weekday[index];
	  }

	  public void setWeekday(int index, String weekday) {
	    this.weekday[index] = weekday;
	  }
}