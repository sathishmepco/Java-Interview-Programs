package com.java.basic;

import java.util.Scanner;

/*
 * 		EVEN OR ODD
 * 
 * 	Divide the given number by 2 
 *  If the reminder is 0 then its EVEN
 *  If the reminder is 1 then its ODD
 *  
 *  22 EVEN number
 *  23 ODD number
 *  
 */
public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the any number : ");
		int num = Integer.parseInt(scanner.nextLine().trim());
		if( num % 2 == 0)
			System.out.println("Given number is EVEN");
		else
			System.out.println("Given number is ODD");
		scanner.close();
	}
}
/*
	OUTPUT
	
	Enter the any number : 22
	Given number is EVEN
	
	Enter the any number : 25
	Given number is ODD
*/