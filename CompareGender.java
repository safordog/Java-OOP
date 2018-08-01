package com.gmail.safordog;

import java.util.Comparator;

public class CompareGender implements Comparator<Student> {

	public CompareGender() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.getGender() == null && o2.getGender() == null) {
			return 0;
		}
		if (o1.getGender() == null && o2.getGender() != null) {
			return -1;
		}
		if (o2.getGender() == null && o1.getGender() != null) {
			return 1;
		}
		return o1.getGender().compareTo(o2.getGender());
	}

}
