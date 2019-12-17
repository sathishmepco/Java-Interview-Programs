package com.java.basic;

import java.util.Scanner;

/*
 * 	Swap Two Numbers
 * 
 * 	It is possible to swap two numbers without
 * 	using third variable.
 * 
 * 	Approach 1::
 *  using +, - operators
 *  a = 15, b = 20
 *  
 *  a = a + b // after a = 35, b = 20
 *  b = a - b // after a = 35, b = 15
 *  a = a - b // after a = 20, b = 15 
 *  
 */
public class SwapApproach1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value for a : ");
		int a = Integer.parseInt(scanner.nextLine().trim());
		System.out.println("Enter the value for b : ");
		int b = Integer.parseInt(scanner.nextLine().trim());
		
		String str = String.format("Before swapping a & b is %d & %d", a,b);
		System.out.println(str);
		
		//using +, - operators
		a = a + b;
		b = a - b;
		a = a - b;
		
		str = String.format("After swapping a & b is %d & %d", a,b);
		System.out.println(str);
		
		scanner.close();
	}
}
/*
	OUTPUT
	
	Enter the value for a : 15
	Enter the value for b : 20
	Before swapping a & b is 15 & 20
	After swapping a & b is 20 & 15
	
	Enter the value for a : 2
	Enter the value for b : 7
	Before swapping a & b is 2 & 7 
	After swapping a & b is 7 & 2

*/