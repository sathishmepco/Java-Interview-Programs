package com.cdac.generics;

import java.util.HashMap;

public class NumberDatabaseMain {
	public static void main(String[] args) {
		
		NumberDatabase<Integer> integerDB = new NumberDatabase<>();
		integerDB.set(100);
		System.out.println("Integer from database : "+integerDB.get());
		
		NumberDatabase<Double> doubleInteger = new NumberDatabase<>();
		doubleInteger.set(153.456);
		System.out.println("Double from database : "+doubleInteger.get());
		
		NumberDatabase<Long> longDatabase = new NumberDatabase<>();
		longDatabase.set(1200000000L);
		System.out.println("Long from database : "+longDatabase.get());
		
//		NumberDatabase<String> stringDatabase = new NumberDatabase<>();
		//the above code will throw error
		//String class is not derived from Number class
		
	}
}