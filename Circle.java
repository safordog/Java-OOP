package com.gmail.safordog;

import static com.gmail.safordog.Point.length;

public class Circle extends Shape {
	
    private Point a; 
    private Point b;
    
    public Circle(Point a, Point b) {
        this.a = a;
        this.b = b;
    }
    
    public Circle() {
        
    }

    @Override
    public double getPerimetr() {
        return 2 * Math.PI * length(a, b);
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(length(a, b), 2);
    }
    
    @Override
    public String getType() {
        return "Circle";
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

}
