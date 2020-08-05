package com.sk.test;

import com.sk.factory.FruitFactory;
import com.sk.fruit.Fruit;

public class FruitTest {

	public static void main(String[] args) {
		Fruit ft=FruitFactory.getInstance("orange");
		ft.color();
		ft.fruitTest();
	}

}
