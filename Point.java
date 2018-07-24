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
    
    /**
     * The method calculate length between two coordinates point;
     * @param pOne - first point (Point`s class object);
     * @param pTwo - second point (Point`s class object;
     * @return the length as double variable;
     */
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
