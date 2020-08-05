package com.sk.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.sk.Beans.Triangle;

public class ClientApp {
	public static void main(String args[]) {
		Triangle tria=null;
		
		//BeanFactory factory=null;
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/sk/cfgs/applicationContext.xml");
		//	factory=new XmlBeanFactory(new ClassPathResource("com/sk/cfgs/applicationContext.xml"));
		
		tria=factory.getBean("tria-alias",Triangle.class);
		tria.draw();
	}
}
