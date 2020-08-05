package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	
	private Courier courier=null;
	
	public void setCourier(Courier courier) {
		this.courier=courier;
	}
	/*
	public Flipkart(DTDC dtdc) {
		this.dtdc=dtdc;
		System.out.println("Flipkart::1-param constructor");
	}
	*/
	public void shopping(String Item[],double Price[]) {
		int oid=0;
		double TotalAmt=0;
		String status=null;
		oid=new Random().nextInt(1000);
		for(double price:Price) 
		{
			TotalAmt=TotalAmt+price;
		}		
		
		status=courier.deliver(oid);		
		
		System.out.println("the total Amt is"+TotalAmt+"the item is as purchased"+Arrays.toString(Item)+"price are as follow"+Arrays.toString(Price));
	}
}
