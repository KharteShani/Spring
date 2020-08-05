package com.sk.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sk.beans.CustomerDetails;

public class BankAccounttest {
	public static void main(String args[]) {
		CustomerDetails cust=null;
		BeanFactory factory=null;
		//create the IOC container
		factory=new XmlBeanFactory(new ClassPathResource("com/sk/cfgs/applicationContext.xml"));
		cust=factory.getBean("custdetail",CustomerDetails.class);
		System.out.println(cust);
		//System.out.println(cust.getBalance(balance));
	}
}
