package com.sk.beans;

public class CustomerDetails {
	private BankAccount account;
	private  String bankName;
	
	public CustomerDetails(BankAccount account, String bankName) {
		this.account = account;
		this.bankName = bankName;
		System.out.println("CustomerDetails:: 2-param Constructor");
	}
	
	@Override
	public String toString() {
		return "CustomerDetails [account=" + account + ", BankName=" + bankName + "]";
	}
	
	public float getBalance(float balance) {
		return account.showBalance(balance);
	}
	
}
