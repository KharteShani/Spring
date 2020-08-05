package com.sk.beans;

public class Student {
	private String sname;
	private int sno;
	private String saddress;
	//get 
	public Student(String sname, int sno, String saddress) {
		this.sname = sname;
		this.sno = sno;
		this.saddress = saddress;
	}

	@Override
	public String toString() {
		return "Student [sname=" + sname + ", sno=" + sno + ", saddress=" + saddress + "]";
	}
}
