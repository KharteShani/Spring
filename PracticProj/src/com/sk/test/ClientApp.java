package com.sk.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.sk.beans.Flipkart;

public class ClientApp {

	public static void main(String[] args) {
	
		Flipkart ft=null;
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/com/sk/cfgs/applicationContext.xml"));
		
		ft=factory.getBean("flip",Flipkart.class);
		
		ft.shopping(new String[] {"dress","watch","gogle","mobile"},new double[] {1000.0,2000.0,3000.0,4000.0});
		
	}

}
