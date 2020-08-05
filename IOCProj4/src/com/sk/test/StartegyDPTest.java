package com.sk.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.sk.comp.Veichle;

public class StartegyDPTest {

	public static void main(String[] args)throws Exception{
		
		Resource res=null;
		BeanFactory factory=null;
		Veichle v=null;
		res=new ClassPathResource("com/sk/cfgs/applicationContext.xml");
		
		factory=new XmlBeanFactory(res);
		v=factory.getBean("v",Veichle.class);
		v.Journey("Hyd", "Goa");
	}

}
