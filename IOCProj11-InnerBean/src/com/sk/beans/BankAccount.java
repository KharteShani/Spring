package com.sk.beans;

public class BankAccount {
	private String bankname;
	private String holdername;
	private float balance;
	private boolean nriAccount;
	
		
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}


	public void setHoldername(String holdername) {
		this.holdername = holdername;
	}


	public void setBalance(float balance) {
		this.balance = balance;
	}

	public void setNriAccount(boolean nriAccount) {
		this.nriAccount = nriAccount;
	}

	public float showBalance(float balance) {
		return balance;
	}
	@Override
	public String toString() {
		return "BankAccount [bankname=" + bankname + ", holdername=" + holdername + ", balance=" + balance
				+ ", nriAccount=" + nriAccount + "]";
	}

}
