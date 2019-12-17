package com.java.basic;

import java.util.Scanner;

/*
 * 	Swap Two Numbers
 * 
 * 	It is possible to swap two numbers without
 * 	using third variable.
 * 
 * 	Approach 2::
 *  using *, / operators (Multiplication , Division)
 *  a = 15, b = 10
 *  
 *  a = a * b // after a = 150, b = 10
 *  b = a / b // after a = 150, b = 15
 *  a = a / b // after a = 10, b = 15 
 *  
 */
public class SwapApproach2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value for a : ");
		int a = Integer.parseInt(scanner.nextLine().trim());
		System.out.println("Enter the value for b : ");
		int b = Integer.parseInt(scanner.nextLine().trim());
		
		String str = String.format("Before swapping a & b is %d & %d", a,b);
		System.out.println(str);
		
		//using *, / operators
		a = a * b;
		b = a / b;
		a = a / b;
		
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
	
	Enter the value for a : 15
	Enter the value for b : 10
	Before swapping a & b is 15 & 10 
	After swapping a & b is 10 & 15

*/