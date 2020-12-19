package com.java.series;

/*
 * Quadratic Sequence
 * ------------------
 * A quadratic sequence is a sequence of numbers 
 * in which the second difference between 
 * any two consecutive terms is constant.
 * 
 * Say the series
 * 1 2 4 7 11 16 22 29 .....
 * 
 * It is simple to calculate the next term
 * ith term = (i-1)th term + (i-1)
 * where i starts from 1
 * 
 * term 1 : 1
 * term 2 = 1 + 1 = 2
 * term 3 = 2 + 2 = 4
 * term 4 = 4 + 3 = 7
 * term 5 = 7 + 4 = 11
 * term 6 = 11 + 5 = 16
 * term 7 = 16 + 6 = 22
 * 
 * The Series is 
 * 1, 2, 4, 7, 11, 16, 22
 * 
 *  for values i = 1 to n
 *  1 = ( (1 * (1-1) ) / 2) + 1 = 1 
 *  2 = ( (2 * (2-1) ) / 2) + 1 = 2
 *  3 = ( (3 * (3-1) ) / 2) + 1 = 4
 *  4 = ( (4 * (4-1) ) / 2) + 1 = 7
 *  5 = ( (5 * (5-1) ) / 2) + 1 = 11
 *  6 = ( (6 * (6-1) ) / 2) + 1 = 16
 *  
 */
public class QuadraticSequence {
	public static void main(String[] args) {
		int n = 15;
		System.out.println("The Series is : ");
		int prevTerm = 1;
		System.out.print(prevTerm+", ");
		for(int i=2; i<=n; i++){
			prevTerm = prevTerm + i-1;
			System.out.print(prevTerm+", ");	
		}
	}
}
/*
	OUTPUT
	n = 10
	The Series is : 
	1, 2, 4, 7, 11, 16, 22, 29, 37, 46
	
	OUTPUT
	n = 15
 	The Series is : 
	1, 2, 4, 7, 11, 16, 22, 29, 37, 46, 56, 67, 79, 92, 106 	
*/