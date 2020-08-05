package com.nt.beans;

import java.util.Date;

public class WishGenerator {
	
	private String name=null;
	private Date date=null;
	private int age=0;
	
	public WishGenerator(Date date,String name,int age)
	{
		this.date = date;
		this.name = name;
		this.age = age;
		System.out.println("Name"+name);
	}
	
	public String msgGenerator() {	
		
		if(age<18) {
			return "you not"; 
		}
		else {
			return "you are eligile";
		}
	}
	
}
