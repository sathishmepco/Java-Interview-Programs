package com.java.array;
/*
 * Find the Missing Number in 1 to N
 * ----------------------------------
 * An array contains 1 to N numbers 
 * but one number in the array is missing
 * Write the java program to find the missing no
 * 
 * Steps:
 * 1. Calculate the sum of the array
 * 2. Calculate the sum of 1 to N
 * 3. Subtract array from the expected sum
 * 4. The result value is the missing no
 * 
 *  Formula for Calculate sum of 1 to N
 *  1 + 2+ 3 + 4 + 5 + ...... + N
 *  sum = (N * (N+1)) / 2
 *  
 *  array = {2, 4, 1, 6, 7, 5, 3, 9};
 *  array Length = 8
 *  sum of array = 37
 *  N = array Length + 1 (missing no) = 9
 *  sum of 1 to N =  45
 *  missing no = sum of 1 to N - array sum
 *  missing no = 45 - 37
 * 
 * Note::
 * ------
 * This approach will work only for array contains
 * value from 1 to n (order does not matter)
 */
public class FindMissingNo {
	public static void main(String[] args) {
//		int array[] = {2, 4, 1, 6, 7, 5, 3, 9};
		int array[] = {2, 4, 1, 6, 3};
		int n = array.length;

		//calculate the sum of array
		int arraySum = 0;
		for(int v : array)
			arraySum += v;

		//array length is 8
		//one no is missing, then n should be n+1
		// here 8+1
		n = n+1;
		
		//this calculates the sum from 1 to (n).
		//1+2+3+....n
		int expectedSum = (n * (n+1)) / 2;
		
		System.out.println("The Given Array is : ");
		for(int v : array)
			System.out.print(v+" ");
		
		int missingNo = expectedSum - arraySum;
		System.out.println("\nMissing Number is : "+missingNo);
	}
}
/*
	OUTPUT
	The Given Array is : 
	2 4 1 6 7 5 3 9 
	Missing Number is : 8
	
	OUTPUT
	The Given Array is : 
	2 4 1 6 3 
	Missing Number is : 5
*/