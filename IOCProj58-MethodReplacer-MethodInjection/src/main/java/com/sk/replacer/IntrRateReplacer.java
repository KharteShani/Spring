package com.sk.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class IntrRateReplacer implements MethodReplacer {
	private float rate;
	
	public void setRate(float rate) {
		this.rate = rate;
	}

	public IntrRateReplacer() {
		System.out.println("IntrRateReplacer:: 0-param Constructor");
	}
		
	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		
		return null;
	}

}
