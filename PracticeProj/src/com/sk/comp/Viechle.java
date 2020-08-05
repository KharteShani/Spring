package com.sk.comp;

public final class Viechle {
	private Engine engg;
	
	public Viechle() {	
		System.out.println("Viechle ::0-param constructor");
	}
	
	public void setViechle(Engine engg) {
		this.engg=engg;	
	}
	
	public void Journey(String start,String end) {
		engg.start();
		System.out.println("Journey is started from "+start);	
		engg.stop();
		System.out.println("Journey is stopped at "+end);
		System.out.println("Journey is completed from "+start+" "+end);
	}
}
