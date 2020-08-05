package com.sk.test;

import com.sk.comp.Veichle;
import com.sk.factory.VeichleFactory;

public class StartegyDPTest {

	public static void main(String[] args) {
		Veichle veichle;
		
		veichle=VeichleFactory.getInstance("petrol");
		veichle.Journey("panjab", "Maharashtra");
	}

}
