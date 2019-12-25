package com.java.numbers;

/*
 * 	Perfect Number from 1 to 1000
 * 
 * Perfect number is a positive integer that is 
 * equal to the sum of its proper positive divisors, 
 * that is, the sum of its positive divisors excluding 
 * the number itself. 
 * 
 * Following are the examples of perfect number.
 * 6 = 1+2+3
 * 28= 1+2+4+7+14 
 * 496= 1+2+4+8+16+31+62+124+248
 * 
 * All the Perfect Numbers
 * 1 6 28 496 8128
 */
public class PerfectNumberList {
	public static void main(String[] args) {
		System.out.println("Perfect Numbers from 1 to 1000 :: ");
		
		for(int i=1;i<=1000;i++)
			if(isPerfectNumber(i))
				System.out.print(i+" ");
	}
	
	private static boolean isPerfectNumber(int num) {
		int tempNum = num;
		int divisorSum = 1;
		for (int i = 2; i <= num / 2; i++)
			if (num % i == 0)
				divisorSum += i;

		if(tempNum == divisorSum)
			return true;
		return false;
	}
}
/*
	OUTPUT
	
	Perfect Numbers from 1 to 1000 :: 
	1 6 28 496
	 
*/