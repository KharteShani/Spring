package com.sk.test;

import com.sk.comp.Engine;
import com.sk.comp.Viechle;
import com.sk.factory.ViechleFactory;

public class StrategyDpTest {
	public static void main(String[] args) throws Exception{
		Viechle veichle=null;		
		veichle=ViechleFactory.getInstance();
		veichle.Journey("Goa", "Kanyakumari");
	}

}
