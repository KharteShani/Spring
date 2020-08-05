package com.sk.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.sk.beans.PersonlInfo;

public class PersonalInfoTest {
	public static  void main(String args[]) {
		PersonlInfo info=null;
		BeanFactory factory=null;
		//create IOCContainer 
		factory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/sk/cfgs/appliciationContext.xml"));
		
		info=factory.getBean("per",PersonlInfo.class);
		
		System.out.println(info);
	}
}
