package com.java.array;

/*
 * Calculate the Average of Given Array
 * -------------------------------------
 * 
 * This is one basic program using array.
 * Steps
 * 1. Declare a variable sum with 0
 * 2. Iterate the array and add with sum variable
 * 3. Divide the sum with array length
 *
 * array = {10, 10, 10, 10, 10};
 * sum is 50
 * array length is 5
 * average is 10
 * 
 * array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
 * sum is 550
 * array length is 10
 * average is 55
 */
public class Average {
	public static void main(String[] args) {
		//int array[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int array[] = {10, 10, 10, 10, 10};
		int n = array.length;
		int sum = 0;
		for(int v : array)
			sum += v;
		float average = sum/n;
		
		System.out.println("The Given Array is : ");
		for(int v : array)
			System.out.print(v+" ");
		System.out.println("\nThe Average of Given Array is : "+average);
	}
}
/*
	OUTPUT
	The Given Array is : 
	10 20 30 40 50 60 70 80 90 100 
 	The Average of Given Array is : 55.0

	OUTPUT
	The Given Array is : 
	10 10 10 10 10 
	The Average of Given Array is : 10.0
*/