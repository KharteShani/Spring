package com.sk.test;

import com.sk.car.SuzukiCar;
import com.sk.factory.CarFactory;

public class ClientApp {
	public static void main(String[] args) {
		SuzukiCar xar=CarFactory.getInstance("Maruti","Mrf");
		xar.drive();
		xar.specification();
	}
}
