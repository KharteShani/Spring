package com.sk.bo;

public class PassBO {
	private int ticketno;
	private String passname;
	private String passaddress;
	private int passage;
	private String sourceplace;
	private  String destplace;
	private float ticketCharge;
//	private String PassValidation;

	public int getTiketno() {
		return ticketno;
	}
	public void setTicketno(int ticketno) {
		this.ticketno = ticketno;
	}
	public String getPassname() {
		return passname;
	}
	public void setPassname(String passname) {
		this.passname = passname;
	}
	public String getPassaddress() {
		return passaddress;
	}
	public void setPassaddress(String passaddress) {
		this.passaddress = passaddress;
	}
	public int getPassage() {
		return passage;
	}
	public void setPassage(int passage) {
		this.passage = passage;
	}
	public String getSourceplace() {
		return sourceplace;
	}
	public void setSourceplace(String sourceplace) {
		this.sourceplace = sourceplace;
	}
	public String getDestplace() {
		return destplace;
	}
	public void setDestplace(String destplace) {
		this.destplace = destplace;
	}
	public float getTicketCharge() {
		return ticketCharge;
	}
	public void setTicketCharge(float ticketCharge) {
		this.ticketCharge = ticketCharge;
	}
//	public String getPassValidation() {
//		return PassValidation;
//	}
//	public void setPassValidation(String passValidation) {
//		this.PassValidation = passValidation;
//	}
}
