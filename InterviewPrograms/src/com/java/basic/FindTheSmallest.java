package com.java.basic;
/*
 * Find the Smallest of 3 (a,b,c) without using < or > symbol
 * ----------------------------------------------------------
 * Mostly to find max or min we use < or > symbol
 * But here without using < or > symbol how to find smallest
 * 
 * Use division operator to compare two compare
 * a = 10 b = 20
 * a/b == 0 -> this means a is smaller than b
 * a = 20 b = 5
 * b/a == 0 -> this means b is smaller than a
 * 
 * This is the technique which we have to use to find the 
 * smallest of 3 (a,b,c)
 *  
*/
public class FindTheSmallest {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int c = 20;
		
		if(a/b == 0 && a/c == 0)
			System.out.println("a is the smallest");
		else if(b/a == 0 && b/c == 0)
			System.out.println("b is the smallest");
		else
			System.out.println("c is the smallest");
	}
}
/*
	INPUT
	a = 10
	b = 20
	c = 5
	OUTPUT
	c is the smallest

	INPUT
	a = 10
	b = 5
	c = 20
	OUTPUT
	b is the smallest
*/