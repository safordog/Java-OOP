package com.gmail.safordog;

public class Human {
	
	private String surname;
	private String name;
	private String gender;
	private int age;
	
	public Human(String surname, String name, String gender, int age) {
		this.surname = surname;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	public Human() {
		
	}
	
	@Override
	public String toString() {
		return surname + " " + name + ": " + gender + "; " + age;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
