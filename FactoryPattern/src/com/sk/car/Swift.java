package com.sk.car;

import com.sk.tyre.CarTyre;

public class Swift implements SuzukiCar{
	private CarTyre tyre;
	public Swift(CarTyre tyre) {
		this.tyre=tyre;
		System.out.println("Swift.Swift()");
	}

	@Override
	public void specification() {
		System.out.println("Swift is Good specification");
	}

	@Override
	public void drive() {
		System.out.println("Drive is Good drive");
	}
}
