package com.java.numbers;

import java.util.Scanner;

/*
 * 	Automorphic Number
 * 
 * An automorphic number is a number 
 * whose square ends with the number itself.
 * 
 *  examples are
 *  
 *  5^2 = 25 = here 25 ends with 5
 *  6^2 = 36 = here 36 ends with 6
 *  76^2 = 5776 = here 5776 ends with 76
 *  
 *  Solution steps:
 *  1. find the square root  of the number n
 *  2. get the unit digit of n
 *  3. get the unit digit of sqrt of n
 *  4. check both are same or not
 *  5. if both are same continue from step 2.
 *  6. if both are not same return false
 *  means this number is not a automorphic
 *  
 */
public class AutomorphicNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any positive integer :: ");
		int num = Integer.parseInt(scanner.nextLine().trim());
		
		if(isAutomorphicNumber(num))
			System.out.println("Given number : "+num+" is a Automorphic Number");
		else
			System.out.println("Given number : "+num+" is NOT a Automorphic Number");
		scanner.close();
	}
	
	private static boolean isAutomorphicNumber(int n){
		int sqrt = n * n;
		System.out.println("Square root of "+n+" is : "+sqrt);
		while (n > 0){
			int reminder1 = n % 10;
			int reminder2 = sqrt % 10;
			if(reminder1 != reminder2)
				return false;
			n = n/10;
			sqrt = sqrt/10;
		}
		return true;
	}
}
/*
	OUTPUT
	Enter any positive integer :: 76
	Square root of 76 is : 5776
	Given number : 76 is a Automorphic Number

	Enter any positive integer :: 80
	Square root of 80 is : 6400
	Given number : 80 is NOT a Automorphic Number

	Enter any positive integer :: 100
	Square root of 100 is : 10000
	Given number : 100 is NOT a Automorphic Number
*/