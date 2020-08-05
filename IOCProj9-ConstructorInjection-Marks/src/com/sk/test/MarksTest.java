package com.sk.test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sk.marks.StudentMarks;

public class MarksTest {

	public static void main(String[] args) {
		StudentMarks mrks=null;
		//create IOC container
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com/sk/cfgs/applicationContext.xml"));
		//get the bean
		mrks=factory.getBean("mrks",StudentMarks.class);
		
		//display the output
		System.out.println(mrks);
	}

}
