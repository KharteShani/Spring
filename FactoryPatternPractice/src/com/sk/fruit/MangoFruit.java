package com.sk.fruit;

public class MangoFruit implements Fruit {
	
	public MangoFruit() {
		System.out.println("This is mango fruit Constructor");
	}
	@Override
	public void color() {
		System.out.println("This mango color is Good as Requirement");		
	}

	@Override
	public void fruitTest() {
		System.out.println("This MangoFruit test also nice Because this is from kokan");	
	}

}
