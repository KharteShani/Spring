package com.sk.comp;

public final class Veichle {
	private Engine engg;
	
	public Veichle() {
		System.out.println("Veichle.Veichle():: 0-param Constructor");
	}
	public void setVeichle(Engine engg) {
		this.engg=engg;
	}
	
	public void Journey(String start,String end) {
		 engg.start();
		 System.out.println("Journey is Started");
		 System.out.println("Journey is Started from "+start+"and going forward to "+end);
		 engg.stop();
		 System.out.println("Journey is stopped");
		 System.out.println("Journey is completed from "+end);	 
	}
}
