package com.algorithm.sorting;

import java.util.Arrays;

/*
 * Selection Sort
 * --------------
 * The selection sort algorithm sorts an array 
 * by repeatedly finding the minimum element 
 * (considering ascending order) from unsorted 
 * part and putting it at the beginning. 
 * The algorithm maintains two subarrays in a given array.
 * - The subarray which is already sorted.
 * - Remaining subarray which is unsorted.
 * 
 * Time Complexity
 * ---------------
 * Worst Case 	: O(n^2)
 * Best Case 	: O(n*log(n))
 * 
 */

public class SelectionSort {
	public static void main(String[] args) {
        int array[] = {64,25,12,22,11};
        System.out.println("Before Sorting :: ");
        System.out.println(Arrays.toString(array));
        selectionSort(array);
        System.out.println("After Sorting :: ");
        System.out.println(Arrays.toString(array));
	}

	public static void selectionSort(int array[]) {
		int n = array.length;
		for (int i = 0; i < n - 1; i++) {
			// Find the minimum element in unsorted array
			int minIndex = i;
			for (int j = i + 1; j < n; j++)
				if (array[j] < array[minIndex])
					minIndex = j;
			//swap the minimum elt with the elt in index i.
			int temp = array[minIndex];
			array[minIndex] = array[i];
			array[i] = temp;
		}
	}
}
/*
	OUTPUT
	Before Sorting :: 
	[64, 25, 12, 22, 11]
	After Sorting :: 
	[11, 12, 22, 25, 64]
*/