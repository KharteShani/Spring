package com.sk.beans;

public class TourAgent {
	private String name;
	private Tourplan tp;
	
	public TourAgent(String name, Tourplan tp) {
		this.name = name;
		this.tp = tp;
		System.out.println("Tourplan :: 2 param constructor");
	}
	
	public TourAgent(Tourplan tp) {
		this.tp = tp;
		System.out.println("Tourplan :: 1 param constructor");
	}
	
//	public void setName(String name) {
//		System.out.println("TourAgent.setName()");
//		this.name = name;
//	}
//
//	public void setTp(Tourplan tp) {
//		System.out.println("TourAgent.TourAgent():: 0-param ");
//		this.tp=tp;
//	}
	
	@Override
	public String toString() {
		return "TourAgent [name=" + name + ", tp=" + tp + "]";
	}
}
