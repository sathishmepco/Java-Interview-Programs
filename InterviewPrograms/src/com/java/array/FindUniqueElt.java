package com.java.array;

/*
 * Find the only one unique Element in the Array
 * ---------------------------------------------
 * 
 * In the given array only one element is 
 * occurred one time, all the other elements are
 * repeated exactly two times.
 * Find the element which occurred only one time
 * 
 * array is { 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5};
 * 
 * 6 is repeated only one time
 * 1, 2, 3, 4, 5 all repeated two times
 * 
 *  Write the program to calculate 6
 * 
 * Solution
 * --------
 * use ^ (XOR) operator
 * apply ^ (XOR) operator to all the values 
 * in the array.
 * when XOR apply between same value result is 0
 * 
 * Finally we will the output as the value
 * which occurred only one time
 */
public class FindUniqueElt {
	public static void main(String[] args) {
		//int array[] = { 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5};
		int array[] = {5, 10, 33, 42, 5, 42, 10};
		int output = array[0];
		for(int i=1;i<array.length;i++)
			output ^= array[i];
		
		System.out.println("Given array is :");
		for(int i : array){
			System.out.print(i+" ");
		}
		System.out.println("\nUnique element in the array is :"+output);
	}
}
/*
	OUTPUT
	Given array is :
	1 2 3 4 5 6 1 2 3 4 5 
 	Unique element in the array is : 6
 	
 	OUTPUT
 	Given array is :
	{5, 10, 33, 42, 5, 42, 10};
 	Unique element in the array is : 33
*/