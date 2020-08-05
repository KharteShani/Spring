package com.sk.beans;

public class A {
	private B b;
	public A(B b) 
	{
		System.out.println("A.A(-) :: 1 param constructor");
		this.b=b;
	}
}
