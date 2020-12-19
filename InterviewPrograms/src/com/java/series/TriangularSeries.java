package com.java.series;

/*
 * Triangular Number Series
 * ------------------------
 * 
 * A triangular number or triangle number counts 
 * objects arranged in an Equilateral triangle 
 * (thus triangular numbers are a type of figurate numbers, 
 * other examples being square numbers and cube numbers). 
 * 
 * The nth triangular number is the number of dots in 
 * the triangular arrangement with n dots on a side, 
 * and is equal to the sum of the n natural numbers 
 * from 1 to n. 
 * 
 * The sequence of triangular numbers, starting at the 
 * 1st triangular number, is
 * 
 * 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, 66, 78, 91, 105, 120, 136, 153
 * 
 * term 1: Triangular Series is 1
 * 			
 * 			*
 * 
 * term 2: Triangular Series is 1+2
 * 			*
 * 		*		*
 * 
 * term 3: Triangular Series is 1+2+3
 * 				*
 * 			*		*
 * 		*		*		*
 * 
 * term 4: Triangular Series is 1+2+3+4
 * 					*
 * 				*		*
 * 			*		*		*
 * 		*		*		*		*
 * 
 * term 5: Triangular Series is 1+2+3+4+5
 * 						*
 * 					*		*
 * 				*		*		*
 * 			*		*		*		*
 * 		*		*		*		*		*
 * 
 * General Formula is 
 * ith term = (i*(i+1)) / 2
 * 
 */

public class TriangularSeries {
	public static void main(String[] args) {
		int terms = 15;
		System.out.println("The Triangular Number Series is : ");
		int val = 0;
		for(int i=1; i<=terms; i++){
			val = val+i;
			System.out.print(val+", ");
		}
	}
}
/*
	OUTPUT
	n = 10
	The Triangular Number Series is : 
	1, 3, 6, 10, 15, 21, 28, 36, 45, 55
	
	OUTPUT
	n = 15
	The Triangular Number Series is : 
	1, 3, 6, 10, 15, 21, 28, 36, 45, 55, 66, 78, 91, 105, 120 
*/