package com.sk.marks;

public class StudentMarks {
	private float m1;
	private float m2;
	private float m3;
	public StudentMarks(float m1, float m2, float m3) {
		System.out.println("StudentMarks:: 3-parameter Constructor");
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	@Override
	public String toString() {
		return "StudentMarks [m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + "]";
	}
	
}
