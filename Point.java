package com.gmail.safordog;

public class Point {
	
	private double x;
    private double y;
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Point() {
        
    }
    
    public static double length(Point pOne, Point pTwo) {
        return Math.sqrt(Math.pow((pTwo.x - pOne.x), 2)
                + Math.pow((pTwo.y - pOne.y), 2));
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

}
