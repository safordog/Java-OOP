﻿/*
 * Домашнее задание - урок 3. 
 * 1) Создайте класс, описывающий человека (создайте метод,
 * выводящий информацию о человеке).
 * 2) На его основе создайте класс студент (переопределите
 * метод вывода информации).
 * 3) Создайте класс Группа, который содержит массив из 10
 * объектов класса Студент. Реализуйте методы добавления,
 * удаления студента и метод поиска студента по фамилии. В
 * случае попытки добавления 11 студента, создайте
 * собственное исключение и обработайте его. Определите
 * метод toString() для группы так, что бы он выводил список
 * студентов в алфавитном порядке.
 * 4) * Нарисуйте UML диаграмму проекта.
 */

package com.gmail.safordog;

public class Main {

	public static void main(String[] args) throws MyException {
		
		Group gr = new Group();
		gr.setGroupName("25/05");
		Student stOne = new Student("Washington", "George", "male", 24, 4.5, "25/04");
		Student stTwo = new Student("Adams", "John", "male", 25, 4.2, "25/04");
		Student stThree = new Student("Jefferson", "Thomas", "male", 20, 4.7, "25/04");
		Student stFour = new Student("Madison", "James", "male", 19, 4.0, "25/04");
		Student stFive = new Student("Monroe", "James", "male", 24, 4.9, "25/04");
		Student stSix = new Student("Adams", "John Quincy", "male", 18, 3.5, "25/04");
		Student stSeven = new Student("Jackson", "Andrew", "male", 21, 5.0, "25/04");
		Student stEight = new Student("Van Buren", "Martin", "male", 20, 4.5, "25/04");
		Student stNine = new Student("Harrison", "William Henry", "male", 22, 4.7, "25/04");
		Student stTen = new Student("Tyler", "John", "male", 24, 4.4, "25/04");
		Student stEleven = new Student("Polk", "James K.", "male", 25, 4.6, "25/04");
		try {
		gr.addSt(stOne);
		gr.addSt(stTwo);
		gr.addSt(stThree);
		gr.addSt(stFour);
		gr.addSt(stFive);
		gr.addSt(stSix);
		gr.addSt(stSeven);
		gr.addSt(stEight);
		gr.addSt(stNine);
		gr.addSt(stTen);
		gr.addSt(stEleven);
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(gr.toString());
	}

}
