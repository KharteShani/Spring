package com.sk.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Cricketor {
	public String beanid;
	public Cricketor(String beanid) {
		System.out.println("Cricketor:: 1-param constructor");
		this.beanid=beanid;
	}
	
	public void batting() {
		BeanFactory factory=null;
		Bat bat=null;
		int runs=0;
		//create IOCContainer for Dependency lookup
		factory=new XmlBeanFactory(new ClassPathResource("com/sk/cfgs/applicationContext.xml"));
		//get Dependent Bean Class Object using Dependency Lookup
		bat=factory.getBean("bat ",Bat.class);
		runs=bat.scoreRuns();
		System.out.println("Run is as"+runs);
	}
	public void bowling() {
		System.out.println("Bowling is Nice");
	}
	public void fielding() {
		System.out.println("Fielding is Nice");
	}	
}
