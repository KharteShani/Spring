package com.sk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sk.beans.WebContainer;

public class LMIProblemTest {
	public static void main(String args[]) {
		ApplicationContext ctx=null;
		WebContainer container=null,container1=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/sk/cfgs/applicationContext.xml");
		//get Target Bean class Object
		container=ctx.getBean("container",WebContainer.class);
		//invoke methods
		container.processRequest("hello");
		System.out.println("-----------------");
		container1=ctx.getBean("container",WebContainer.class);
		container1.processRequest("hai");
		//close ApplicationContext
		((AbstractApplicationContext) ctx).close();
	}
}
