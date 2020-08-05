package com.nt.beans;

public class Bluedart implements Courier{
	public Bluedart() {
		System.out.println("Bluedart.Bluedart()::0-param constructor");
	}
	@Override
	public String deliver(int oid) {
		return "Delivery is Placed"+oid;
	}
}
