package com.sk.beans;

public class Bike {
	private String regno;
	private String owner;
	private String model;
	private String company;
	private String color;
	private int enginecc;
	private int fueltankcapacity;
	private long engineno;
	public void setRegno(String regno) {
		this.regno = regno;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setEnginecc(int enginecc) {
		this.enginecc = enginecc;
	}
	public void setFueltankcapacity(int fueltankcapacity) {
		this.fueltankcapacity = fueltankcapacity;
	}
	public void setEngineno(long engineno) {
		this.engineno = engineno;
	}
	
	@Override
	public String toString() {
		return "Bike [regno=" + regno + ", owner=" + owner + ", model=" + model + ", company=" + company + ", color="
				+ color + ", enginecc=" + enginecc + ", fueltankcapacity=" + fueltankcapacity + ", engineno=" + engineno
				+ "]";
	}
	
	
	
}
