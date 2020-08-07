package com.java.array;

import java.util.Arrays;

/*
 * Rotate the Given array d times
 * -------------------------------
 * Write java program to rotate (clockwise) the given array
 * d number of times.
 * 
 * Steps:
 * 1. Create new array of same size
 * 2. Create a new index variable new_index = 0
 * 3. Copy the array from index d to n 
 * to the new array of index 0, and increment new_index
 * 4. Copy the array from index 0 to d
 * to the new array and increment new_index.
 * 
 * Given array is {1, 2, 3, 4, 5, 6}
 * d = 2
 * 
 * New array = {0, 0, 0, 0, 0, 0}
 * 
 * copy index from d to n to new array
 * New array = {5, 6, 0, 0, 0, 0}
 * 
 * copy index from 0 to d to new array
 * New array = {5, 6, 1, 2, 3, 4}
 * 
 * Finally after rotation
 * {5, 6, 1, 2, 3, 4}
 * 
 */
public class ArrayRotation {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6};
		int d = 6;
		int n = arr.length;
		
		if(d > n)
			d = d-n;
		int new_arr[] = new int[n];
		int new_index = 0;
		for(int i=(n-d);i<n;i++,new_index++)
			new_arr[new_index] = arr[i];
		for(int i=0;i<(n-d);i++,new_index++)
			new_arr[new_index] = arr[i];
		
		System.out.println("Original Array ");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Array after rotation");
		System.out.println(Arrays.toString(new_arr));
	}
}
/*
	INPUT
	arr[] = {1, 2, 3, 4, 5, 6}
	d = 2
	OUTPUT
	{5, 6, 1, 2, 3, 4}
	
	INPUT
	arr[] = {1, 2, 3, 4, 5, 6}
	d = 4
	OUTPUT
	{3, 4, 5, 6, 1, 2}
	
	INPUT
	arr[] = {1, 2, 3, 4, 5, 6}
	d = 6
	OUTPUT
	{1, 2, 3, 4, 5, 6}
*/