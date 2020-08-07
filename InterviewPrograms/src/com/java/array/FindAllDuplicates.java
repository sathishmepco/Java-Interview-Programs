package com.java.array;

import java.util.HashSet;

/*
 * Find All duplicate elements
 * ---------------------------
 * Write java program to find all the duplicates
 * elements from the given array.
 *
 * This solution will work only when array contains elements
 * value lesser than array size.
 * 
 * Suppose the array size is 5, and array contains value 10
 * For this case below code will not work.
 * 
 */
public class FindAllDuplicates {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
//		int array[] = {4 , 2, 4, 5, 2, 3, 1, 2, 3};
//		int array[] = {2, 1, 2, 2, 1, 3};
		int arr[] = {3, 8, 1, 3, 6, 3, 8, 1, 6};
		for(int i =0;i<arr.length;i++){
			if(arr[Math.abs(arr[i])] > 0)
				arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
			else{
				set.add(Math.abs(arr[i]));
			}
		}
		System.out.println("All duplicates are :: "+set);
	}
}

/*
	INPUT
	{4,2,4,5,2,3,1,2,3}
	OUTPUT
	All duplicates are :: [2, 3, 4]

	INPUT
	{2, 1, 2, 2, 1, 3}
	OUTPUT
	All duplicates are :: [1, 2]

	INPUT
	{3, 8, 1, 3, 6, 3, 8, 1, 6};
	OUTPUT
	All duplicates are :: [1, 3, 6, 8]
*/