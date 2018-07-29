package com.gmail.safordog;

public class Group {
	
	private String groupName;
	Student[] group = new Student[10];
	
	public Group(String groupName) {
		super();
		this.groupName = groupName;
	}
	
	public Group() {
		
	}

	public void addSt(Student student) throws MyException {
		for (int i = 0; i < group.length; i++) {
			if (group[i] == null) {
				student.setGroup(this.groupName);
				group[i] = student;
				System.out.println("Student " + group[i].getSurname() + " added.");
				break;
			} else if (i == group.length - 1) throw new MyException();
		}
	}
	
	public void delSt(Student student) {
		for (int i = 0; i < group.length; i++) {
			if (group[i].getSurname().equals(student.getSurname())) {
				group[i] = null;
				System.out.println("Student " + student.getSurname() + " deleted!");
				break;
			}
		}
	}
	
	private void sort() {
		for (int i = 0; i < group.length - 1; i++) {
			for (int j = i + 1; j < group.length; j++) {
				if (compSt(group[i], group[j]) > 0) {
					Student temp = group[i];
					group[i] = group[j];
					group[j] = temp;
				}
			}
		}
	}
	
	public int compSt(Student one, Student two) {
		if (one != null && two == null) {
			return 1;
		}
		if (one == null && two != null) {
			return -1;
		}
		if (one == null && two == null) {
			return 0;
		}
		return one.getSurname().compareTo(two.getSurname());
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sort();
		for (int i = 0; i < group.length; i++) {
			if (group[i] != null) {
				sb.append((i + 1) + ") ").append(group[i].toString());
				sb.append(System.lineSeparator());
			}
		}
		return sb.toString();
	}
	
	public void findSt(String surname) {
		for (int i = 0; i < group.length; i++) {
			if (group[i].getSurname().equals(surname)) {
				System.out.println((i + 1) + ") " + group[i].getSurname() + " " 
			+ group[i].getName() + ": " + group[i].getGender() + "; " + group[i].getAge() 
			+ "; " + group[i].getAverageMark() + ".");
			}
		}
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	
}
