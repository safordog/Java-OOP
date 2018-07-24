package com.gmail.safordog;

import static com.gmail.safordog.Point.length;

public class Rhombus extends Shape {
	
    private Point a;
    private Point b;
    private Point c;
    private Point d;
    
    public Rhombus(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public Rhombus() {
        
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

    public Point getD() {
        return d;
    }

    public void setD(Point d) {
        this.d = d;
    }
    
    @Override
    public double getPerimetr() {
        return length(a, b) * 4;
    }

    @Override
    public double getArea() {
        return (length(a, c) * length(b, d)) / 2; 
    }

    @Override
    public String getType() {
        return "Rhombus";
    }

}
