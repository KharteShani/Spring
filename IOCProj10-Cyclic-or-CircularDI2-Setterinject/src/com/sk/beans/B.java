package com.sk.beans;

public class B {
	private A a;
	
	public B(A a){
		System.out.println("B.B()::1-param constructor");
		this.a=a;
	}
}
