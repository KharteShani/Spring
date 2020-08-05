package com.sk.test;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringI18nTest {
	public static void main(String args[]) {
		ApplicationContext  ctx=null;
		Locale locale=null;
		String msg1=null,msg2=null,msg3=null,msg4=null,msg5=null;
		JFrame frame=null;
		JButton but1=null,but2=null,but3=null,but4=null,but5=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/sk/cfgs/applicationContext.xml");
		//create locale object 
		locale=new Locale(args[0],args[1]);
		//get Message
		msg1=ctx.getMessage("btn.cap1",new Object[] {},"msg1",locale );
		msg2=ctx.getMessage("btn.cap2",new Object[] {},"msg2",locale);
		msg3=ctx.getMessage("btn.cap3",new Object[] {},"msg3",locale);
		msg4=ctx.getMessage("btn.cap4",new Object[] {},"msg4",locale);
		msg5=ctx.getMessage("btn.cap1",new Object[] {},"msg5",locale);
		System.out.println("msg5");
		//create JFrame
		frame=new JFrame();
		//set layout
		frame.setLayout(new FlowLayout());
		//create Buttons
		but1=new JButton(msg1);
		but2=new JButton(msg2);
		but3=new JButton(msg3);
		but4=new JButton(msg4);
		
		frame.add(but1);frame.add(but2);
		frame.add(but3);frame.add(but4);
		
		//set size
		frame.pack();
		//set visibility
		frame.setVisible(true);
		//close container
		((AbstractApplicationContext) ctx).close();
	}
}
