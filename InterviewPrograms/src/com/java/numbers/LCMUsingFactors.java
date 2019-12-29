package com.java.numbers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*
 * 	LCM - Least Common Multiple
 * 
 * The LCM of two integers is the smallest
 * positive integer that is perfectly divisible 
 * by both the numbers without a reminder.
 * (means reminder should be zero)
 * 
 * say n1 = 12 and n2 = 15
 * 12 & 15 can divide 60, 120, 180 ...
 * but the smallest number is 60
 * LCM of 12 & 15 is 60
 * 
 */

public class LCMUsingFactors {
	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		
		Map<Integer, Integer> factors1 = primeFactors(a);
		Map<Integer, Integer> factors2 = primeFactors(b);

		HashSet<Integer> factorsSet = new HashSet<>();
		factorsSet.addAll(factors1.keySet());
		factorsSet.addAll(factors2.keySet());
		int lcm = 1;
		for(int factor : factorsSet){
			int maxPow = factors1.get(factor);
			if( maxPow < factors2.get(factor))
				maxPow = factors2.get(factor);
			lcm *= Math.pow(factor, maxPow);
		}
		System.out.println("LCM of "+a+" & "+b+" is "+lcm);
	}
	
	public static Map<Integer, Integer> primeFactors(int num){
		Map<Integer, Integer> factors = new HashMap<>();
		int tempNum = num;
		for(int i=2;i<=tempNum;i++){
			while( num%i == 0){
				if(factors.containsKey(i))
					factors.put(i, factors.get(i)+1);
				else
					factors.put(i, 1);
				num = num/2;
			}
		}
		return factors;
	}
}
/*
	OUTPUT
	LCM of 12 & 15 is 60
	LCM of 10 & 6 is 30
	LCM of 10 & 5 is 10
	LCM of 5 & 7 is 35
*/