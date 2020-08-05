package com.sk.test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import com.sk.beans.Student;

public class StudentFactory {

	public static void main(String[] args) {
		Student std=null;
		
		//create container 
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com/sk/cfgs/applicationContext.xml"));
		//getBean
		std=factory.getBean("std",Student.class);
		//
		System.out.println(std);	
	}
}
