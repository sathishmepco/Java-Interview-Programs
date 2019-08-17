package com.java.numbers;

import java.util.Scanner;

//This program will calculate the sum of digits of a given number
/*
 * say N = 153
 * output is = 9 (1 + 5 + 3)
 * 
 * say N = 1986
 * output is = 24 (1 + 9 + 8 + 6)
 */
public class SumOfDigits {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter any number :: ");
		int N = Integer.parseInt(scanner.nextLine().trim());
		int tempN = N;
		int sum = 0;
		while( N > 0){
			int lastDigit = N %10;
			sum += lastDigit;
			N = N /10;
		}
		System.out.println("Sum of digits of "+tempN+" is :: "+sum);
		scanner.close();
	}
}

/*
		OUTPUT
	
	Please enter any number :: 
	1986
	Sum of digits of :: 1986 is :: 24

*/