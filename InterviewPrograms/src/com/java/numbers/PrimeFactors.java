package com.java.numbers;

import java.util.Scanner;

/*
 * 	Prime Factors of a Given Number
 *	
 *	The prime factors of a number are all the 
 *	prime numbers that, when multiplied together, 
 *	equal the original number. 
 *
 *	You can find the prime factorization of a number 
 *	by using a factor tree and dividing the number 
 *	into smaller parts.
 *	
 *	say  Given Number is 45, Prime factors are
 *	3, 3, 5 
 * 
 * 	say  Given Number is 32, Prime factors are
 *	2, 2, 2, 2, 2
 *
 */
public class PrimeFactors {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any positive integer :: ");
		int num = Integer.parseInt(scanner.nextLine().trim());
		
		System.out.println("The Prime Factors are :");
		printPrimeFactors(num);
		
		scanner.close();
	}
	
	private static void printPrimeFactors(int num){
		int limit = (int) Math.sqrt(num);
		
		for(int i=2;i<=limit;i++){
			while(num % i == 0){
				System.out.print(i+", ");
				num = num/i;
			}
		}
		if(num > 2)
			System.out.print(num);
	}
}
/*
	OUTPUT
	Enter any positive integer :: 72
	The Prime Factors are :
	2, 2, 2, 3, 3, 
	
	Enter any positive integer :: 22
	The Prime Factors are :
	2, 11
	
	Enter any positive integer :: 90
	The Prime Factors are :
	2, 3, 3, 5, 
*/