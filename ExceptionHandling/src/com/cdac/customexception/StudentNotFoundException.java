package com.cdac.customexception;

public class StudentNotFoundException extends Exception{
	public StudentNotFoundException(String message){
		super(message);
	}
}