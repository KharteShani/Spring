package com.sk.factory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import com.sk.comp.DieselEngine;
import com.sk.comp.Engine;
import com.sk.comp.PetrolEngine;
import com.sk.comp.Veichle;
import com.sk.comp.WaterEngine;

public final class VeichleFactory {
	
	public static Veichle getInstance() throws Exception {
		//dependent class
		Engine engg=null;
		//target class
		Veichle veichle=null;
		InputStream is=new FileInputStream("src/com/sk/commons/app.properties");
		Properties pros=new Properties();
		pros.load(is);
		
		Class c1=Class.forName(pros.getProperty("target"));
		veichle=(Veichle)c1.newInstance();
		Class c2=Class.forName(pros.getProperty("dependent"));
		engg=(Engine)c2.newInstance();
		
//		if(engineType.equalsIgnoreCase("diesel")) {
//			engg=new DieselEngine();
//		}
//		else if(engineType.equalsIgnoreCase("petrol")) {
//			engg=new PetrolEngine();
//		}
//		else if(engineType.equalsIgnoreCase("water")) {
//			engg=new WaterEngine();
//		}
		
		veichle=new Veichle();
		veichle.setVeichle(engg);
		return veichle;	
	}
}
