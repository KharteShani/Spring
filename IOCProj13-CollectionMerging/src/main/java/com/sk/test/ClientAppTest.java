package com.sk.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.sk.beans.CollectionMerging;

public class ClientAppTest {
	public static void main (String args[]) {
			CollectionMerging coll=null;
			BeanFactory factory=null;
			
			factory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/sk/cfgs/applicationContext.xml"));
			
			coll=factory.getBean("comermerge",CollectionMerging.class);
			
			System.out.println(coll);		
	}
}
