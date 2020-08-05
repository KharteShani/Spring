package com.sk.bean;

public class Cricketor {
	Bat bat=null;
	private String cktname;
	
	public Cricketor(Bat bat) {
		System.out.println("Bat:: 1-param Constructor");
		this.bat=bat;
	}
	
	public void setCktname(String cktname) {
		this.cktname = cktname;
	}
	
	@Override
	public String toString() {
		return "Cricketor [cktname=" + cktname + "]";
	}
	
}
