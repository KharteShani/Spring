package com.sk.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.sk.beans.TourAgent;


public class AutoWiringTest {
	public static void main(String args[]) {
	TourAgent ta=null;
	DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
	XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
	reader.loadBeanDefinitions("com/sk/cfgs/applicationContext.xml");
	
	ta=factory.getBean("ta",TourAgent.class);
	System.out.println(ta);
	}
}