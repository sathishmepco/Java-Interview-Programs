package com.java.basic;

import java.util.Scanner;

/*
 * Positive Or Negative
 * ---------------------
 * An integer is a whole number that can be either 
 * greater than 0, called positive, or less than 0, 
 * called negative. 
 * 	
 * Zero is neither positive nor negative. 
 * 
 * 100 is Positive Number
 * -22 is Negative Number
 *  
 */
public class PositiveOrNegative {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any integer : ");
		
		int n = scanner.nextInt();
		if(n > 0 )
			System.out.println(n+" is a Positive Number.");
		else if( n < 0 )
			System.out.println(n+" is a Negative Number.");
		else
			System.out.println("Zero is neither Positive nor Negative.");
		
		scanner.close();
	}
}
/*
	OUTPUT
	Enter any integer : 155
	155 is a Positive Number.

	OUTPUT
	Enter any integer : -77
	-77 is a Negative Number.

	OUTPUT
	Enter any integer : 0
	Zero is neither Positive nor Negative.
*/