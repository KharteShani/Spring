package com.sk.service;

public class BankService {
	public BankService() {
		System.out.println("BankService:: 0-param constructor");
	}
	public float calcSimpleIntrAmt(float baAmt,float time){
		return baAmt*2.0f*time*110f;
	} 
}
