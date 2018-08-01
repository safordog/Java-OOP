package com.gmail.safordog;

import java.util.Comparator;

public class CompareAverageMark implements Comparator<Student> {
	
	public CompareAverageMark() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.getAverageMark() == 0 && o2.getAverageMark() == 0) {
			return 0;
		}
		if (o1.getAverageMark() == 0 && o2.getAverageMark() != 0) {
			return -1;
		}
		if (o2.getAverageMark() == 0 && o1.getAverageMark() != 0) {
			return 1;
		}
		if (o1.getAverageMark() > o2.getAverageMark()) {
			return -1;
		}
		if (o1.getAverageMark() < o2.getAverageMark()) {
			return 1;
		}
		return 0;
	}
		
}
