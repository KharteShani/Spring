package com.sk.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sk.bean.Cricketor;

public class DependencycheckTest {
	public static void main(String args[]) {
		Cricketor ck=null;
		BeanFactory factory=null;
		//create container
		factory=new XmlBeanFactory(new ClassPathResource("com/sk/cfgs/applicationContext.xml"));
		
		ck=factory.getBean("cktt",Cricketor.class);
		System.out.println("Ck is as"+ck);
	}
}
