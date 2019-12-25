package com.java.numbers;

import java.util.Scanner;

/*
 * 	Armstrong Number
 * 
 * A positive number is called Armstrong number 
 * if it is equal to the 
 * sum of cubes of its digits 
 * for example 0, 1, 153, 370, 371, 407 etc.
 * 
 * 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
 * 370 = 3^3 + 7^3 + 0^3 = 27 + 343 + 0 = 370
 * 371 = 3^3 + 7^3 + 1^3 = 27 + 343 + 1 = 371
 */
public class ArmstrongNumber {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any positive number :: ");
		int num = Integer.parseInt(scanner.nextLine().trim());

		if( checkArmstrongNumber(num) == true )
			System.out.println("Given number "+num+" is a Armstrong Number.");
		else
			System.out.println("Given number "+num+" is NOT a Armstrong Number.");
		scanner.close();
	}
	
	private static boolean checkArmstrongNumber(int num){
		int digitsSum = 0;
		int tempNum = num;
		
		while( num > 0 ){
			//get the unit digits of the number
			int digit = num % 10;
			//sum the cubes of the unit digit
			digitsSum += digit * digit * digit;
			num = num / 10;
		}
				
		//check sum of the cubes of digits is equal to the number
		if(digitsSum == tempNum)
			return true;
		return false;
	}
}
/*
	OUTPUT

	Enter any positive number :: 153
	The given number 153 is a Armstrong Number.
	
	Enter any positive number :: 370
	The given number 153 is a Armstrong Number.

	Enter any positive number :: 500
	The given number 500 is NOT a Armstrong Number.
	
*/