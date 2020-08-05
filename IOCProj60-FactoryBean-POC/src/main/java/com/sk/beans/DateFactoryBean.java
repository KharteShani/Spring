package com.sk.beans;

import java.util.Date;

import org.springframework.beans.factory.FactoryBean;

public class DateFactoryBean implements FactoryBean<Date> {
	
	private int year,month,day; 
	
	public DateFactoryBean(int year, int month, int day) {
		System.out.println("DateFactoryBean:: 3-param constructor");
		this.year = year;
		this.month = month;
		this.day = day;
	}
	//creates and returns resultant object
	@Override
	public Date getObject() throws Exception {
		System.out.println("DateFactoryBean.getObject()");
		return new Date(year,month,day);
	}
	//returns java.lang.class object holding resultant object class name
	@Override
	public Class<?> getObjectType() {
		System.out.println("DateFactoryBean.getObjectType()");
		return Date.class; //it will return resultant object having date class
	}
	//speicifies whether resultant objects should be taken as singleton scope or prototype scope object(false)
	@Override
	public boolean isSingleton() {
		System.out.println("DateFactoryBean.isSingleton()");
		return false; //enable true or false
	}
	
}
