package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishGenerator;

public class ClientApp {

	public static void main(String[] args) {
		BeanFactory factory = null;
		// System.out.println("ClientApp:main(-)");

		// Locate Spring Bean configuration file
		FileSystemResource res = new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");

		// Activate BeanFactory container
		factory = new XmlBeanFactory(res);

		// get Bean class object
		// WishGenerator bean=(WishGenerator)factory.getBean("wish");
		WishGenerator bean = factory.getBean("wish", WishGenerator.class);// this not a class
		// call B.method
		String r = bean.msgGenerator();
		System.out.println(r);

	}// main

}// class
