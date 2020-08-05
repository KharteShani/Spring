package com.sk.test;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sk.controller.PassController;
import com.sk.vo.PassVO;

public class RuntimeDITest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		PassController controller=null;
		Scanner sc=null;
		String ticketno;
		String passname,passaddress;
		String passage;
		String sourceplace,destplace;
		PassVO vo=null;
		try {
		
		//create a container
		factory=new XmlBeanFactory(new ClassPathResource("com/sk/cfgs/applicationContext.xml"));
		
		//get controller class object
		controller=factory.getBean("controller",PassController.class);
		
		//create the object of Scanner class
		sc=new Scanner(System.in);
		
		System.out.println("Enter the ticketno");
		ticketno=sc.next();
		System.out.println("Enter the Username");
		passname=sc.next();
		System.out.println("Enter the passaddress");
		passaddress=sc.next();
		System.out.println("Enter the passage");
		passage=sc.next();
		System.out.println("Enter the sourcePlace");
		sourceplace=sc.next();
		System.out.println("Enter the Destination Place");
		destplace=sc.next();
	
		//create the vo class object
		vo=new PassVO();
				
		vo.setTicketno(ticketno);
		vo.setPassname(passname);
		vo.setPassaddress(passaddress);
		vo.setPassage(passage);
		vo.setSourceplace(sourceplace);
		vo.setDestplace(destplace);		
		controller.processTicket(vo);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}