package com.sk.factory;

import com.sk.fruit.Fruit;
import com.sk.fruit.MangoFruit;
import com.sk.fruit.OrangeFruit;

public class FruitFactory {
	public FruitFactory() {
		System.out.println("FruitFactory.FruitFactory()");
	}
	public static Fruit getInstance(String fruit) {
		Fruit ft=null;
		if(fruit.equalsIgnoreCase("mango")) {
			ft=new MangoFruit();
		}
		else if(fruit.equalsIgnoreCase("orange")) {
			ft = new OrangeFruit();
		}
		return ft;
	}
	
}
