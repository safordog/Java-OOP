package com.gmail.safordog;

import java.util.Comparator;

public class CompareGroup implements Comparator<Student> {
	

	public CompareGroup() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.getGroup() == null && o2.getGroup() == null) {
			return 0;
		}
		if (o1.getGroup() == null && o2.getGroup() != null) {
			return -1;
		}
		if (o2.getGroup() == null && o1.getGroup() != null) {
			return 1;
		}
		return o1.getGroup().compareTo(o2.getGroup());
	}

	

}
