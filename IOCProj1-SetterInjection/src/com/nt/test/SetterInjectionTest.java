package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {
	public static void main(String args[]) {
		Resource res=null;
		BeanFactory factory=null;
		Object obj=null;
		WishMessageGenerator generator=null;
		//locate spring bean cfg file
		res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		//create IOC container (BeanFactory)
		factory=new XmlBeanFactory(res);
		//get Bean(Main Bean)
		obj=factory.getBean("wish");
		//type casting
		generator=(WishMessageGenerator)obj;
		//Invoke bean method
		System.out.println("Message:::"+generator.msgGen("raja"));
		
	}
}
