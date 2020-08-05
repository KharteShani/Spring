package com.sk.test;

import java.util.Arrays;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sk.beans.A;

public class ClientApp {
	public static void main(String args[]) {
		A a=null;
		//create container
		@SuppressWarnings("deprecation")
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com/sk/cfgs/applicationContext.xml"));
		//
		a=factory.getBean("a",A.class);
		System.out.println(a);
	}//Error creating bean with name 'a': Requested bean is currently in creation: Is there an unresolvable circular reference?
}
