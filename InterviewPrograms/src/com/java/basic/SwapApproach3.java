package com.java.basic;

import java.util.Scanner;

/*
 * Swap Two Numbers
 * ----------------
 * It is possible to swap two numbers without
 * using third variable.
 * 
 * Approach 3::
 * using ^ (XOR) operator
 * a = 3, b = 10
 * (0011) (1010)  
 *  
 * a = a ^ b // a = 0011 ^ 1010 = 1001
 * b = a ^ b // b = 1001 ^ 1010 = 0011
 * a = a ^ b // a = 1001 ^ 0011 = 1010
 *  
 */
public class SwapApproach3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value for a : ");
		int a = scanner.nextInt();
		System.out.println("Enter the value for b : ");
		int b = scanner.nextInt();
		
		System.out.println("Before swapping a & b : ");
		System.out.println("a = "+a+", b = "+b);
		
		//using ^ (XOR) operators
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		
		System.out.println("After swapping a & b : ");
		System.out.println("a = "+a+", b = "+b);
		scanner.close();
	}
}
/*
	OUTPUT
	Enter the value for a : 15
	Enter the value for b : 20
	Before swapping a & b : 
	a = 15, b = 20
	After swapping a & b : 
	a = 20, b = 15
	
	OUTPUT
	Enter the value for a : 15
	Enter the value for b : 10
	Before swapping a & b : 
	a = 15, b = 10
	After swapping a & b : 
	a = 10, b = 15
*/