/*
 * 1. �������� ����������� ����� Shape, � ������� ���� 
 * ��� ����������� ������ double getPerimetr() � double getArea().
 * 2. �������� ����� Point, � ������� ���� ��� �������� double x double y.
 * 3. �������� ������, ������� ���������, ��� �������, ��� �������������� 
 * ������ (��� ������ ���� ����������� Shape). ��� ���� ��� � �������� 
 * ������� ������ ��������� ������ Point.
 * 4. �������� ����� �����. ����� �������� �� 4 ����� � ������ 
 * ����� ����� ����� �������� ���� �� �����. � ����� ������ ���� ������ 
 * ������� �������� � ������� ������ � �����. ����� ������ ���� ����� 
 * ������� ������� ���������� � ���� ������� ������� �� ����� � �� 
 * ��������� �������. 
 * 5. * ��������� UML ��������� �������.
 */

package com.gmail.safordog;

import static com.gmail.safordog.Doska.delShape;
import static com.gmail.safordog.Doska.setShape;
import static com.gmail.safordog.Point.length;

public class Main {

	public static void main(String[] args) {
		
		Point a = new Point(2.4, -1.0);
        Point b = new Point(1.4, 2.0);
        Point c = new Point(0.2, 2.5);
        Point d = new Point(3.0, -2.3);
        Triangle tr = new Triangle(a, b, c);
        Circle circ = new Circle(a, b);
        Rhombus rh = new Rhombus(a, b, c, d);
        Shape sp = tr;
        System.out.println(sp.getArea());
        System.out.println(sp.getPerimetr());
        System.out.println(circ.getArea());
        System.out.println(circ.getPerimetr());
        System.out.println(rh.getArea());
        System.out.println(rh.getPerimetr());
        setShape("tr", tr.getArea());
        setShape("circ", circ.getArea());
        setShape("rh", rh.getArea());
        delShape(5);
        Doska doska = new Doska();
        doska.getInfo();
	}

}
