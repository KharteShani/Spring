package com.sk.beans;

import java.util.Date;

public class PersonlInfo {
	private int eid;
	private String name;
	private Date dob;
	private Date doj;
	
	public PersonlInfo(int eid, String name, Date dob, Date doj) {
		this.eid = eid;
		this.name = name;
		this.dob = dob;
		this.doj = doj;
	}
	
	@Override
	public String toString() {
		return "PersonlInfo [eid=" + eid + ", name=" + name + ", dob=" + dob + ", doj=" + doj + "]";
	}
	

}
