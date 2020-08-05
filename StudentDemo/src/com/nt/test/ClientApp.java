package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.controller.StudentController;

public class ClientApp {
	public static void main(String args[]) {
		try {
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		
		StudentController controller=factory.getBean("stController",StudentController.class);
		
		System.out.println(controller.process("1024", "hari", "59", "78", "89"));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
