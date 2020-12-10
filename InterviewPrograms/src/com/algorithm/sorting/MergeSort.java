package com.algorithm.sorting;

import java.util.Arrays;

/*
 * Merge Sort
 * ----------
 * In computer science, merge sort is an efficient, general-purpose, 
 * comparison-based sorting algorithm.
 * Merge sort is a divide and conquer algorithm. 
 * 
 * It divides input array in two halves, calls itself for 
 * the two halves and then merges the two sorted halves. 
 * 
 * 
 * Time Complexity
 * ---------------
 * Worst Case : O(n*log(n))
 * Best Case : O(n*log(n))
 */

public class MergeSort {
	public static void main(String[] args) {
		int array[] = {90,23,101,45,65,23,67,89,34,23};
		System.out.println("Before Sorting :: ");
        System.out.println(Arrays.toString(array));
        sort(array,0,array.length-1);
        System.out.println("After Sorting :: ");
        System.out.println(Arrays.toString(array));
	}

	public static void mergeSort(int array[], int leftIndex, int midIndex, int rightIndex) {
		int n1 = midIndex - leftIndex + 1;
		int n2 = rightIndex - midIndex;

		int leftArray[] = new int[n1];
		int rightArray[] = new int[n2];

		for (int i = 0; i < n1; ++i)
			leftArray[i] = array[leftIndex + i];
		for (int j = 0; j < n2; ++j)
			rightArray[j] = array[midIndex + 1 + j];

		int i = 0, j = 0;
		int k = leftIndex;
		while (i < n1 && j < n2) {
			if (leftArray[i] <= rightArray[j]) {
				array[k] = leftArray[i];
				i++;
			} else {
				array[k] = rightArray[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			array[k] = leftArray[i];
			i++;
			k++;
		}
		while (j < n2) {
			array[k] = rightArray[j];
			j++;
			k++;
		}
	}

	public static void sort(int array[], int leftIndex, int rightIndex) {
		if (leftIndex < rightIndex) {
			int midIndex = (leftIndex + rightIndex) / 2;
			sort(array, leftIndex, midIndex);
			sort(array, midIndex + 1, rightIndex);
			mergeSort(array, leftIndex, midIndex, rightIndex);
		}
	}
}

/*
	OUTPUT
	Before Sorting :: 
	[90, 23, 101, 45, 65, 23, 67, 89, 34, 23]
	After Sorting :: 
	[23, 23, 23, 34, 45, 65, 67, 89, 90, 101]
*/