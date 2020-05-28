package com.java.numbers;

import java.util.Scanner;

/*
 * 	Largest Divisor
 * 
 * Write a program to find the Largest Divisor of a number
 * Largest divisor except the given number.
 * 
 * Say the number is 100
 * Divisors are : 1, 2, 4, 5, 10, 20, 25, 50
 * Largest Divisor is 50
 * 
 * Say the number is 25
 * Divisors are : 1, 5
 * Largest Divisor is 5
 * 
 */
public class LargestDivisor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number :: ");
		int n = scanner.nextInt();
		int output = largestDivisor(n);
		System.out.println("Largest Divisor is : "+output);
		scanner.close();
	}
	
	public static int largestDivisor(int n){
		for(int i=2;i<=Math.sqrt(n);i++)
			if(n%i == 0)
				return n/i;
		return 1;
	}
}

/*
Enter a number :: 100
Largest Divisor is : 50

Enter a number :: 23
Largest Divisor is : 1

Enter a number :: 25
Largest Divisor is : 5
*/