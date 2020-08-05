package com.sk.beans;

import java.util.Date;

public class ScheduleRemainder {
	public Date date;

	public ScheduleRemainder(Date date) {
		this.date = date;
	}
	
	public String showTodaysAppointments() {
		Date sysDate=new Date();
		if(date.getYear()==sysDate.getYear()&& date.getMonth()==sysDate.getMonth() && date.getDate()==sysDate.getDate())  
			return " Doctor Appointment";
		else 
			return "No Appointments today";
	}
  }

