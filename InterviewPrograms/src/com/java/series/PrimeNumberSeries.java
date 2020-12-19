package com.java.series;

/*
 * Prime Number Series
 * --------------------
 * 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 ....
 * 
 * Prime Number
 * ------------
 * A prime number is a natural number greater than 1 
 * that is not a product of two smaller natural numbers. 
 * 
 * A natural number thats divisible only by itself and 1.
 *  
 */

public class PrimeNumberSeries {
	public static void main(String[] args) {
		int n = 100;
		System.out.println("Prime numbers up to : "+n);
		for(int i=2; i<=n; i++)
			if(isPrime(i))
				System.out.print(i+", ");
	}
	public static boolean isPrime(int num){
		for(int i=2;i<=Math.sqrt(num);i++)
			if(num % i == 0)
				return false;
		return true;
	}
}
/*
	OUTPUT
	n = 20
	Prime numbers up to : 20
	2, 3, 5, 7, 11, 13, 17, 19 
	
	OUTPUT
	n = 100
	Prime numbers up to : 100
	2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 
	43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97 
	
*/