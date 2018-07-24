/*
 * 1. —оздайте абстрактный класс Shape, в котором есть 
 * два абстрактных метода double getPerimetr() и double getArea().
 * 2. —оздайте класс Point, в котором есть два свойства double x double y.
 * 3. —оздайте классы, которые описывают, как минимум, три геометрические 
 * фигуры (они должны быть подклассами Shape). ѕри этом они в качестве 
 * свойств должны содержать классы Point.
 * 4. —оздайте класс доска. ƒоска поделена на 4 части в каждую 
 * часть доски можно положить одну из фигур. ” доски должны быть методы 
 * которые помещают и удал€ют фигуру с доски. “акже должен быть метод 
 * который выводит информацию о всех фигурах лежащих на доске и их 
 * суммарную площадь. 
 * 5. * Ќарисуйте UML диаграмму проекта.
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
