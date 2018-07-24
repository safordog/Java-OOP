package com.gmail.safordog;

public class Doska {
	
	static Doska[] array = new Doska[4];
    private String type;
    private double area;
    
    public Doska(String type, double area) {
        this.type = type;
        this.area = area;
    }
    
    public Doska() {
        
    }
    
    /**
     * The method writes to the array Doska`s class object;
     * @param type - String which contains a type of shape;
     * @param area - double which contains area`s value;
     */
    public static void setShape(String type, double area) {
        Doska doska = new Doska (type, area);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = doska;
                break;
            } else if (i == array.length - 1) {
                System.out.println("No empty cases!");
            }
        }
    }
    
    /**
     * The method delete from the array Doska`s class object;
     * @param index - integer variable which contains index of the object; 
     */
    public static void delShape(int index) {
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                array[i] = null;
            }
        }
    }
    
    /**
     * The method shows in the console information about array`s elements 
     * and it`s total area;  
     */
    public void getInfo() {
    	double sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
            System.out.println("[" + i + "]" + " " + array[i].type 
			       + " - area: " + array[i].area);
            sum = sum + array[i].area;
            }
        }
        System.out.println("Total area: " + sum);
    }

    public static Doska[] getArray() {
        return array;
    }

    public static void setArray(Doska[] array) {
        Doska.array = array;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

}
