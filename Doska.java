package com.gmail.safordog;

public class Doska {

	private Shape[] array = new Shape[4];

	public Doska() {

	}

	public void setShape(Shape shape) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == null) {
				array[i] = shape;
				break;
			} else if (i == array.length - 1) {
				System.out.println("No empty cases!");
			}
		}
	}

	public void delShape(int index, Shape[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i == index) {
				array[i] = null;
			}
		}
	}

	public void getInfo() {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != null) {
				System.out.println("[" + i + "]" + " " + array[i].getType() 
						+ ": perimetr = " + array[i].getPerimetr()
						+ "; area: " + array[i].getArea() + ".");
				sum = sum + array[i].getArea();
			}
		}
		System.out.println("Total area: " + sum);
	}

}
