package com.gmail.safordog;

public class Main {

	public static void main(String[] args) {
		
	Point a = new Point(2.4, -1.0);
        Point b = new Point(1.4, 2.0);
        Point c = new Point(0.2, 2.5);
        Point d = new Point(3.0, -2.3);
        Triangle tr = new Triangle(a, b, c);
        Circle circ = new Circle(a, b);
        Rhombus rh = new Rhombus(a, b, c, d);
        Doska doska = new Doska();
        doska.setShape(tr);
        doska.setShape(circ);
        doska.setShape(rh);
        doska.getInfo();
	}

}
