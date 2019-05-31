package com.cdac.errors;

public class OutOfMemoryError {
	public static void main(String[] args) {
		//this code will throw OutOfMemoryError
		//VM does not have enough space to create the objects
		Integer intArray[] = new Integer[Integer.MAX_VALUE];
	}
}