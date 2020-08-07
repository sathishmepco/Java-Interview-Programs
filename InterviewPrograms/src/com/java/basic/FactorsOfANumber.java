package com.java.basic;

import java.util.Scanner;

/*
 * Factors of a Given Number
 * --------------------------
 * 
 * A number which divides the given number and gives
 * reminder as zero, then that number is called as Factor.
 * 
 * say Given number is 36, factors are
 * 1, 2, 3, 4, 6, 9, 12, 18, 36
 * 
 * say Given number is 40, factors are
 * 1, 2, 4, 5, 8, 10, 20, 40
 * 
 */
public class FactorsOfANumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any positive integer :: ");
		int num = scanner.nextInt();
		
		System.out.println("The factors of the given number are :");
		printFactors(num);
		scanner.close();
	}
	
	private static void printFactors(int num){
		for(int i=1;i<=num/2;i++){
			if(num % i == 0)
				System.out.print(i+", ");
		}
		System.out.print(num);
	}
}
/*
	OUTPUT
	Enter any positive integer :: 40
	The factors of the given number are :
	1, 2, 4, 5, 8, 10, 20, 40
	
	OUTPUT
	Enter any positive integer :: 75
	The factors of the given number are :
	1, 3, 5, 15, 25, 75
*/