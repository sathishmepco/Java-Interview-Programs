package com.algorithm.sorting;

import java.util.Arrays;
/*
 * Quick Sort
 * ----------
 * Quicksort (partition-exchange sort) is an efficient 
 * sorting algorithm.
 * 
 * Quicksort is a divide-and-conquer algorithm. 
 * It works by selecting a 'pivot' element from the 
 * array and partitioning the other elements into 
 * two sub-arrays, according to whether they are 
 * less than or greater than the pivot. 
 * The sub-arrays are then sorted recursively. 
 * This can be done in-place, requiring small additional 
 * amounts of memory to perform the sorting.
 *  
 * Time Complexity
 * ---------------
 * Worst Case 	: O(n^2)
 * Best Case 	: O(n*log(n))
 * 
 */

public class QuickSort {
	public static void main(String[] args) {
		int array[] = {90,23,101,45,65,23,67,89,34,23};
		System.out.println("Before Sorting :: ");
        System.out.println(Arrays.toString(array));
        sort(array,0,array.length-1);
        System.out.println("After Sorting :: ");
        System.out.println(Arrays.toString(array));
	}

	public static void sort(int array[], int low, int high) {
		if (low < high) {
			int pi = partition(array, low, high);
			sort(array, low, pi - 1);
			sort(array, pi + 1, high);
		}
	}

	public static int partition(int array[], int low, int high) {
		int pivot = array[high];
		int i = (low - 1);
		for (int j = low; j < high; j++) {
			if (array[j] <= pivot) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		int temp = array[i + 1];
		array[i + 1] = array[high];
		array[high] = temp;
		return i + 1;
	}
}
/*
	OUTPUT
	Before Sorting :: 
	[90, 23, 101, 45, 65, 23, 67, 89, 34, 23]
	After Sorting :: 
	[23, 23, 23, 34, 45, 65, 67, 89, 90, 101]
*/