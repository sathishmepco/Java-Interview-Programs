package com.java.series;

/*
 * Fibonacci Series
 * ----------------
 * In mathematics, the Fibonacci numbers, 
 * commonly denoted Fn, form a sequence, 
 * called the Fibonacci sequence, such that 
 * each number is the sum of the 
 * two preceding ones, starting from 0 and 1.
 * 
 * In other words, the previous two numbers
 * are added to get the next number, starting from 0 & 1.
 * 
 * The Fibonacci Sequence is the series 
 * of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
 * 
 */

public class FibonacciSeries {
	public static void main(String[] args) {
		int N = 10;
		int num1 = 0;
		int num2 = 1;
		
		System.out.println("Fibonacci series N="+N);
		System.out.print(num1+" "+num2);
		int i = 2;
		while(i <= N){
			i++;
			int temp = num1+num2;
			num1 = num2;
			num2 = temp;
			System.out.print(" "+num2);
		}
	}
}
/*
	OUTPUT
	Fibonacci series N=15
	0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610
	
	Fibonacci series N=10
	0 1 1 2 3 5 8 13 21 34 55
*/