package com.sk.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.sk.beans.Cricketor;

public class DependencyLookupTest {
	BeanFactory factory=null;
	Cricketor ck=null;
	//create IOC container to Create Dependency
	factory=new XmlBeanFactory(new ClassPathResource("com/sk/cfgs/applicationContext.xml"));
	XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
	reader.loadBeanDefinitions()
	ck=factory.getBean("Crick",Cricktor.class);
	
	ck.Batting();
	ck.Bowling();
	ck.Fielding();

}
