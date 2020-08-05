package com.sk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.sk.service.EmployeeService;

public class JdbcTemplateTest {

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		EmployeeService service = null;
		// create IOC container
		ctx = new ClassPathXmlApplicationContext("com/sk/cfgs/application-context.xml");
		// get Service class Object
		service = ctx.getBean("empservice", EmployeeService.class);

		try {
			System.out.println("Emps count=> " + service.fetchEmployeeCount());
		} catch (DataAccessException dae) {
			dae.printStackTrace();
		}

		// close container
		((AbstractApplicationContext) ctx).close();
	}
}
