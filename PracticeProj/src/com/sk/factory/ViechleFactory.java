package com.sk.factory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import com.sk.comp.Engine;
import com.sk.comp.PetrolEngine;
import com.sk.comp.Viechle;
import com.sk.comp.WaterEngine;

public final class ViechleFactory {
	public ViechleFactory() {
		System.out.println("ViechleFactory ::0-param constructor");
	}
	
	public static Viechle getInstance() throws Exception {
		
		InputStream is=new FileInputStream("com/sk/commons/app.properties");
		Properties pros=new Properties();
		pros.load(is);
		
		Class c2=Class.forName(pros.getProperty("target"));
		c2.newInstance();
		Class c3=Class.forName(pros.getProperty("dependent"));
		c3.newInstance();
		
		Engine engg = null;
		Viechle viechle;
		
//		if(type.equalsIgnoreCase("water")) {
//			engg=new WaterEngine();
//		}
//		else if(type.equalsIgnoreCase("petrol")) {
//			engg=new PetrolEngine();
//		}
		viechle=new Viechle();
		viechle.setViechle(engg);
		return viechle;	
	}
}