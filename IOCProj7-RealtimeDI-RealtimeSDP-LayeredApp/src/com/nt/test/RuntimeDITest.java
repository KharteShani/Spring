package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.controller.LaptopControllerImpl;
import com.nt.vo.LaptopVO;

public class RuntimeDITest {
	@SuppressWarnings("deprecation")
	public static void main(String args[]) {
		String lapname=null;
		String lapprice=null;
		String laplength=null;
		String lapweight=null;
		try {
		LaptopControllerImpl lcont=null;
		//create container
		
		BeanFactory factory=null;
		
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		
		lcont=factory.getBean("controller",LaptopControllerImpl.class);
		LaptopVO vo=null;
		vo=new LaptopVO();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Laptopname");
		lapname=sc.next();
		System.out.println("Enter the Laptopprice");
		lapprice=sc.next();
		System.out.println("Enter the Laptoplength");
		laplength=sc.next();
		System.out.println("Enter the Laptopweight");
		lapweight=sc.next();
	
		vo.setLapname(lapname);		
		vo.setLaprice(lapprice);
		vo.setLaplength(laplength);
		vo.setLapweight(lapweight);
		
		lcont.control(vo);
		sc.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
