package com.java.basic;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Digits of a Given Number
 * -------------------------
 * For any positive number print the digits
 * of the number.
 * 
 * Without using String functions.
 * 
 * say Given number is 2019
 * digits are 2, 0, 1, 9
 * 
 * say Given number is 3245879
 * digits are 3, 2, 4, 5, 8, 7, 9
 * 
 */
public class DigitsOfNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any positive integer :: ");
		int num = scanner.nextInt();
		
		ArrayList<Integer> digitsList = new ArrayList<>();
		while(num > 0){
			int unitDigit = num % 10;
			digitsList.add(0, unitDigit);
			num = num/10;
		}
		
		System.out.println("The digits of the Giver Number : ");
		for(int digit : digitsList)
			System.out.print(digit+" ");
		scanner.close();
	}
}
/*
	OUTPUT
	Enter any positive integer :: 2019
	The digits of the Giver Number : 
	2 0 1 9 
	
	Enter any positive integer :: 3245879
	The digits of the Giver Number : 
	3 2 4 5 8 7 9
*/