package com.nt.beans;
import java.util.Date;

public class WishMessageGenerator {
	private Date date;
	public WishMessageGenerator() {
		System.out.println("0-param constructor");
	}
	public void setDate(Date date) {
		this.date=date;
	}
	//write a business logic
	public String msgGen(String name){
		int hour=0;
		//get the date
		hour=date.getHours();
		if(hour<=12) 
			return "GM:"+name;
		else if(hour<=16)
			return "GA"+name;
		else if(hour<=20)
			return "GE"+name;
		else
			return "GN"+name;
	}
}
