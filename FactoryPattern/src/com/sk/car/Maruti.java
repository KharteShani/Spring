package com.sk.car;

import com.sk.tyre.CarTyre;

public class Maruti implements SuzukiCar{
	private CarTyre tyre;
	
	public Maruti(CarTyre tyre){
		this.tyre=tyre;
		System.out.println("Maruti.Maruti()");
	}
	
	@Override
	public void specification() {
		System.out.println("Maruti Car specification At the First Time this is the Best Car");
	}
	@Override
	public void drive() {
		System.out.println("Drive  purpose also good car");
	}
}
