package com.sk.tyre;

public class Mrf implements CarTyre{
	
	public Mrf() {
		System.out.println("Mrf.Mrf()");
	}
	@Override
	public void tyreSpeci() {
		System.out.println("Nice Cartyre length and breadth and height also good");
	}
	@Override
	public void tyreType() {
		System.out.println("Car tyre is tubeless and also withtyre");
	}
	
}
