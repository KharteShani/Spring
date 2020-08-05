package com.sk.test;

import com.sk.comp.Veichle;
import com.sk.factory.VeichleFactory;

public class StartegyDPTest {

	public static void main(String[] args)throws Exception {
		Veichle veichle=VeichleFactory.getInstance();
		veichle.Journey("hyd", "goa");
	}

}
