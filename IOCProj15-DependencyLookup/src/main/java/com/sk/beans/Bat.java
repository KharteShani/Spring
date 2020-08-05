package com.sk.beans;

public class Bat {
	private int run;
	public Bat() {
		System.out.println("Bat:: 0-param constructor");
	}

	public void setRun(int run) {
		this.run = run;
	}
	public int scoreRuns() {
		return run;
	}

	@Override
	public String toString() {
		return "Bat [run=" + run + "]";
	}

}
