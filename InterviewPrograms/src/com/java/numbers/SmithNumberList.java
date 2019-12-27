package com.java.numbers;

import java.util.ArrayList;

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
public class SmithNumberList {
	public static void main(String[] args) {
		System.out.println("Smith Number from 2 to 1000 :: ");
		for(int i=2;i<=1000;i++)
			if(sumOfDigits(i) == getPrimeFactorsDigitSum(i))
				System.out.print(i+" ");
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
	
	Smith Number from 2 to 1000 :: 

	4 22 27 58 85 94 121 166 202 265 274 319 346 
	355 378 382 391 438 454 483 517 526 535 562 
	576 588 627 634 636 645 648 654 663 666 690 
	706 728 729 762 778 825 852 861 895 913 915 
	922 958 985  
*/