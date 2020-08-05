package com.sk.beans;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	private Bluedart dart=null;
	public Flipkart(Bluedart dart) {
		this.dart=dart;
		System.out.println("1-param constructor");
	}
	
	public void shopping(String Item[],double Price[]) {
		int oid=0;
		double Allamount=0;
		oid=new Random().nextInt(10000);
		dart.deliver(oid);
		for(double price:Price) {
			Allamount=Allamount+price;
		}	
		System.out.println("Allamount value is as"+Allamount+"the item are as"+Arrays.deepToString(Item)+"price that are purchased items"+Arrays.toString(Price));
	}
}
