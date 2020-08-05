package com.sk.tyre;

public class Jk implements CarTyre {
	
	public Jk() {
		System.out.println("Jk.Jk()");
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
