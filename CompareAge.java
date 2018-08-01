package com.gmail.safordog;

import java.util.Comparator;

public class CompareAge implements Comparator<Student> {
	
	public CompareAge() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int compare(Student o1, Student o2) {
		if (o1.getAge() == 0 && o2.getAge() == 0) {
			return 0;
		}
		if (o1.getAge() == 0 && o2.getAge() != 0) {
			return -1;
		}
		if (o2.getAge() == 0 && o1.getAge() != 0) {
			return 1;
		}
		return o1.getAge() - o2.getAge();
	}

}
