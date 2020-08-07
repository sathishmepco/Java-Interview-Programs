package com.java.basic;

import java.util.Scanner;

/*
 * LEAP YEAR
 * ---------
 * This program is to check the given number is leap year or not.
 *
 * Leap Year Conditions
 * 1. Year should be divisible by 4
 * 2. If it is divisible by 100 then should be divisible by 400
 * 3. If both conditions are not satisfied, then given input is not leap year.
 * 
 * Example
 * 2000	-	LEAP YEAR
 * 2100	-	NOT A LEAP YEAR
 * 2020	-	LEAP YEAR
 * 2019	-	NOT A LEAP YEAR
 * 1900	-	NOT A LEAP YEAR
 * 1996	-	LEAP YEAR
 */
public class LeapYear {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a year :: ");
		int year = scanner.nextInt();
		
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			System.out.println("YES LEAP YEAR!");
		else
			System.out.println("No its not leap year.");
		
		scanner.close();
	}
}
/*
	INPUT
	Enter a year :: 2020
	OUTPUT
	YES LEAP YEAR!
	
	INPUT
	Enter a year :: 2000
	OUTPUT
	YES LEAP YEAR!
	
	INPUT
	Enter a year :: 1996
	OUTPUT
	YES LEAP YEAR!

	INPUT
	Enter a year :: 2100
	OUTPUT
	No its not leap year. 

	INPUT
	Enter a year :: 2019
	OUTPUT
	No its not leap year.

*/