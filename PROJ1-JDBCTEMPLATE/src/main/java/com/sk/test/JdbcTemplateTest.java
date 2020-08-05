package com.sk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.sk.service.EmployeeDAOService;

public class JdbcTemplateTest {
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		EmployeeDAOService service;
		
		//create IOC Container
		ctx=new ClassPathXmlApplicationContext("com/sk/cfgs/applicationContext.xml");
		//get service class object
		service=ctx.getBean("empservice", EmployeeDAOService.class);
		
		try{
			System.out.println("Employee Count is:: "+service.fetchEmployeeCount());	
		}
		catch (DataAccessException dae) {
			dae.printStackTrace();
		}
		((AbstractApplicationContext) ctx).close();		
	}
}
