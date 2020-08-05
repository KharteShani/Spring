package com.sk.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import com.sk.beans.Bike;

public class BeanInheritanceTest {
	public static void main(String args[]) {
		Bike bike=null;
		Bike bike1=null;
		BeanFactory factory=null;
		
		//create bean factory container
		factory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/sk/cfgs/applicationContext.xml"));
		
		bike=factory.getBean("basebike",Bike.class);
		System.out.println(bike);
		
		System.out.println("--------------------------");
		
		bike1=factory.getBean("raviPulsor",Bike.class);
		System.out.println(bike1);	
	}
}
