package com.gmail.safordog;

public class MyException extends Exception {
	
	@Override
	public String getMessage() {
		return "This group is full!";
	}

}
