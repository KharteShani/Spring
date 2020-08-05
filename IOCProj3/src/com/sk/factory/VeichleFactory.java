package com.sk.factory;

import com.sk.comp.DieselEngine;
import com.sk.comp.Engine;
import com.sk.comp.PetrolEngine;
import com.sk.comp.Veichle;
import com.sk.comp.WaterEngine;

public final class VeichleFactory {
	
	public static Veichle getInstance(String engineType) {
		//dependent class
		Engine engg=null;
		//target class
		Veichle veichle=null;
		
		if(engineType.equalsIgnoreCase("diesel")) {
			engg=new DieselEngine();
		}
		else if(engineType.equalsIgnoreCase("petrol")) {
			engg=new PetrolEngine();
		}
		else if(engineType.equalsIgnoreCase("water")) {
			engg=new WaterEngine();
		}
		
		veichle=new Veichle();
		veichle.setVeichle(engg);
		return veichle;	
	}
}
