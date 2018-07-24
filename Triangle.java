package com.gmail.safordog;

import static com.gmail.safordog.Point.length;

public class Triangle extends Shape {

	private Point a;
	private Point b;
	private Point c;

	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Triangle() {

	}

	@Override
	public double getPerimetr() {
		return length(a, b) + length(b, c) + length(a, c);
	}

	@Override
	public double getArea() {
		double halfPer = (length(a, b) + length(b, c) + length(a, c)) / 2;
		return Math.sqrt(halfPer * (halfPer - length(a, b)) * (halfPer - length(b, c)) * (halfPer - length(a, c)));
	}

	@Override
	public String getType() {
		return "Triangle";
	}

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

}
