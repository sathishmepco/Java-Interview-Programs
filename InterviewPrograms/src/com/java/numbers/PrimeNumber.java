package com.java.numbers;

import java.util.Scanner;

/*

	Prime number is a number that is greater than 1 and divided by 1 or itself only. 
	In other words, prime numbers can't be divided by other numbers than itself or 1. 
	For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.

 */
public class PrimeNumber {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number::");
		int number = Integer.parseInt(scanner.nextLine().trim());
		boolean status = checkPrimeNumber(number);
		if(status == true)
			System.out.println("The entered number is Prime Number");
		else
			System.out.println("The entered number is NOT a Prime Number");
		scanner.close();
	}
	
	private static boolean checkPrimeNumber(int number){
		if(number <= 1)
			return false;
		int length = number / 2;

		for(int i=2;i<length;i++)
			if(number % i ==0)
				return false;
		return true;
	}
}
/*

OUTPUT

Enter any number::
15
The entered number is NOT a Prime Number

Enter any number::
29
The entered number is Prime Number

*/