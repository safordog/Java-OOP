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
	    double getPerimetr() {
	        return 2 * Math.PI * length(a, b);
	    }

	    @Override
	    double getArea() {
	        return Math.PI * Math.pow(length(a, b), 2);
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
