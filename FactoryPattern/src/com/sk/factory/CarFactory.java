package com.sk.factory;

import com.sk.car.Maruti;
import com.sk.car.SuzukiCar;
import com.sk.car.Swift;
import com.sk.tyre.CarTyre;
import com.sk.tyre.Jk;
import com.sk.tyre.Mrf;

public class CarFactory {
	//String is passed at the runtime 
	public static SuzukiCar getInstance(String car,String tyretype) {
		
		SuzukiCar suzucar=null;
		CarTyre tyre=null;
		if(tyretype.equalsIgnoreCase("Jk")) {
			tyre=new Jk();
		}
		else if(tyretype.equalsIgnoreCase("Mrf")) {
			tyre=new Mrf();
		}
		else {
			throw new IllegalArgumentException();
		}
		if(car.equalsIgnoreCase("Swift")) {
			suzucar=new Swift(tyre);
		}
		
		else if(car.equalsIgnoreCase("Maruti")){
			suzucar=new Maruti(tyre);
		}
		else {
			throw new IllegalArgumentException();
		}
		return suzucar;
	}
}
