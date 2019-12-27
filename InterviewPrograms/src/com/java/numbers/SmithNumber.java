package com.java.numbers;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 	Smith Number
 * 
 * A Smith number is a composite number 
 * the sum of whose digits is the sum of 
 * the digits of its prime factors (excluding 1)
 * 
 * Say given number is 22
 * prime factors of 22 are
 * 		2, 11
 * 
 *  sum of digits of 22 = 4
 *  sum of digits of prime factors 
 *  2 * 11 = 2 + 1 + 1 = 4
 *  
 *  given number is 27
 *  prime factors = 3, 3, 3
 *  sum of digits of 27 = 2+7 = 9
 *  sum of digits of prime factors
 *  					3+3+3 = 9
 *  
 *  Other examples are
 *  4, 22, 27, 58, 85, 94, 121, 166, 202, 265
 */
public class SmithNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any positive integer :: ");
		int num = Integer.parseInt(scanner.nextLine().trim());
		
		if(sumOfDigits(num) == getPrimeFactorsDigitSum(num))
			System.out.println("Given number : "+num+" is a Smith Number");
		else
			System.out.println("Given number : "+num+" is NOT a Smith Number");
		scanner.close();
	}
	
	private static int getPrimeFactorsDigitSum(int n){
		int sum =0;
		ArrayList<Integer> primeFactors = getPrimeFactors(n);
		for(int v : primeFactors)
			sum += sumOfDigits(v);
		return sum;
	}
	
	private static ArrayList<Integer> getPrimeFactors(int n){
		ArrayList<Integer> factors = new ArrayList<>();
		int len = (int) Math.sqrt(n);
		for(int i=2; i<= len;i++){
			while( n%i == 0 ){
				factors.add(i);
				n = n/i;
			}
		}
		if( n > 2 )
			factors.add(n);
		System.out.println("Prime Factors are : "+factors);
		
		//if the number is prime number
		//then only one factor will be there
		//so prime numbers are not smith number
		if(factors.size() == 1)
			return new ArrayList<>();
		return factors;
	}
	
	private static int sumOfDigits(int n){
		int sum = 0;
		while( n > 0 ){
			int digit = n % 10;
			sum += digit;
			n = n / 10;
		}
		return sum;
	}
}
/*
	OUTPUT
	
	Enter any positive integer :: 22
	Prime Factors are : [2, 11]
	Given number : 22 is a Smith Number
	
	Enter any positive integer :: 85
	Prime Factors are : [5, 17]
	Given number : 85 is a Smith Number

	Enter any positive integer :: 150
	Prime Factors are : [2, 3, 5, 5]
	Given number : 150 is NOT a Smith Number

*/