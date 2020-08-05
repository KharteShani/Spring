package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Flipkart;

public class LCTestApp {
	public static void main(String[] args) {
		
		Flipkart ft=null;
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		
		ft= factory.getBean("flip",Flipkart.class);
		
		ft.shopping(new String[] {"dress","book","Bag","Mobile"},new double[] {2000.0,4000.0,5000.0,6000.0});
	}
}
