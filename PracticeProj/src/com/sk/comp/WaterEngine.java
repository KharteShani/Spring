package com.sk.comp;

public final class WaterEngine implements Engine{
	@Override
	public void start() {
		System.out.println("WaterEngine is Started");
		
	}
	@Override
	public void stop() {
		System.out.println("WaterEngine is stopped");
	}
}
