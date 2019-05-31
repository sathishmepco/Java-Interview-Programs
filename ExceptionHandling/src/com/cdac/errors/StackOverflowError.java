package com.cdac.errors;

public class StackOverflowError {
	
	public static void main(String[] args) {
		//this code will produce stackoverflow error
		//calling main method inside main method
		main(args);
		
		//calling any method without any base condition 
		//will lead to stack overflow error
	}

}