package com.gmail.safordog;

public class Student extends Human {

	private double averageMark;
	private String group;

	public Student(String surname, String name, String gender, int age, double averageMark, String group) {
		super(surname, name, gender, age);
		this.group = group;
		this.averageMark = averageMark;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "; " + averageMark + "; " + group + ".";
	}


	public double getAverageMark() {
		return averageMark;
	}

	public void setAverageMark(double averageMark) {
		this.averageMark = averageMark;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}
	
	
	

}
