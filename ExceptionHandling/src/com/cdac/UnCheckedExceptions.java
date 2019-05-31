package com.cdac;

public class UnCheckedExceptions {
	
	public static void main(String[] args) {
		numberFormatException();
		divideByZero();
		nullPointerException();
		stringIndexOutOfBoundException();
		classCastException();
	}
	
	public static void numberFormatException(){
		String str = "ten";
		
		//this code will throw NumberFormatException
		//this is runtime exception
		//this exception checked at runtime only
		//use try catch to handle this exception
		int i = Integer.parseInt(str);
	}
	
	public static void divideByZero(){
		//the below code will throw ArithmeticException
		//divide by 0 error
		//use try catch to handle this exception
		int a = 10/0;
	}
	
	public static void nullPointerException(){
		String firstName = null;
		int length = firstName.length();
		System.out.println("Length of the first name is : "+length);
	}
	
	public static void stringIndexOutOfBoundException(){
		String name = "Core Java";
		char charAtIndex100 = name.charAt(100);
		System.out.println("Char at index 100 is : "+charAtIndex100);
	}

	public static void classCastException(){
		Object o = new Integer(10);
		String sObj = (String) o;
		System.out.println(sObj);
	}

}
