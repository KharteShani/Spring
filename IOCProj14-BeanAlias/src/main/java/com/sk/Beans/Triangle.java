package com.sk.Beans;
//Target Class
public class Triangle {
	private Point a;
	private Point b;
	private Point c; //Dependent CLass object
	
	public Point getA() {
		return a;
	}
	public void setA(Point a) {
		this.a = a;
	}
	public Point getB() {
		return b;
	}
	public void setB(Point b) {
		this.b = b;
	}
	public Point getC() {
		return c;
	}
	public void setC(Point c) {
		this.c = c;
	}
		//Method Draw() display injected Values
	public void draw() {
		System.out.println("Point A("+getA().getX()+","+getA().getY()+")");	
		System.out.println("Point B("+getB().getX()+","+getB().getY()+")");	
		System.out.println("point C("+getC().getX()+","+getC().getY()+")");	
	}
}
