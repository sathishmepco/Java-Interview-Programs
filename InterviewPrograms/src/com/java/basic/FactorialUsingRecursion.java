package com.java.basic;

import java.util.Scanner;

/*
 * Factorial Using Recursion
 * --------------------------
 * In mathematics, the factorial of a positive integer n, 
 * denoted by n!, is the product of all positive integers 
 * less than or equal to n:
 * 
 *  n! can be written as 
 *  n! = 1 * 2 * 3 * .... * (n-1) * n;
 *  
 *  n! can also be written as
 *  n! = n * (n-1)!
 *  This approach helps to calculate using Recursion
 *  
 *  5! = 5 * 4!
 *  4! = 4 * 3!
 *  3! = 3 * 2!
 *  2! = 2 * 1!
 *  1! = 1
 *  
 */
public class FactorialUsingRecursion {
	
	//using recursion calculate factorial
	public static int factorial(int n){
		if(n == 1)
			return 1;
		//n * (n-1)!
		return n * factorial(n-1);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the any number : ");
		int N = scanner.nextInt();
		
		int result = factorial(N);
		
		System.out.println("Factorial of "+N+" is ");
		System.out.println(result);
		
		scanner.close();
	}
}
/*
	OUTPUT
	Enter the any number : 5
	Factorial of 5 is 120
	
	OUTPUT
	Enter the any number : 10
	Factorial of 10 is 3628800
*/