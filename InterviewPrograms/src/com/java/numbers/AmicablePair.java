package com.java.numbers;

import java.util.ArrayList;

/* Amicable Pair
 * 
 * Amicable numbers are two different numbers so related that the
 * sum of the proper divisors of each is equal to the other number.
 * 
 * A proper divisor of a number is a positive factor of that number
 * other than the number itself
 * 
 * Proper divisors of 20 is 1, 2, 4, 5, 10
 * 20 is the proper divisor
 * 
 * say a = 220, b = 284
 * 
 * Proper divisors of a = 220 are
 * 1, 2, 4, 5, 10, 11, 20, 22, 44, 55, 110
 * sum = 284
 * 
 * Proper divisors of b = 284 are
 * 1, 2, 4, 71, 142
 * sum = 220
 * 
 * So a & b are Amicable Pair
 * Other Amicable Pairs are
 * (1184, 1210) 
 * (2620, 2924) 
 * (5020, 5564) 
 * (6232, 6368) 
 * (10744, 10856) 
 * (12285, 14595)
 * (17296, 18416) 
 * (63020, 76084) 
 * (66928, 66992)
*/
public class AmicablePair {
	public static void main(String[] args) {
		int a = 5020;
		int b = 5564;
		
		ArrayList<Integer> aFactors = factors(a);
		ArrayList<Integer> bFactors = factors(b);

		int aSum = 0, bSum = 0;
		for(int i=0;i<aFactors.size();i++)
			aSum += aFactors.get(i);
		for(int i=0;i<bFactors.size();i++)
			bSum += bFactors.get(i);
		if(aSum == b && a == bSum)
			System.out.println(a+" & "+b+" are Amicable Pair");
		else
			System.out.println(a+" & "+b+" are NOT Amicable Pair");
	}
	
	private static ArrayList<Integer> factors(int num){
		ArrayList<Integer> factors = new ArrayList<>();
		factors.add(1);
		for(int i=2;i<num;i++){
			if(num % i == 0){
				factors.add(i);	
				factors.add(num/i);
			}
			if(num/i <= i)
				break;
		}
		return factors;
	}
}
/*
	OUTPUT
	220 & 284 are Amicable Pair
	
	OUTPUT
	200 & 300 are NOT Amicable Pair

	OUTPUT
	5020 & 5564 are Amicable Pair
*/