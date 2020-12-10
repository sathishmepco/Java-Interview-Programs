package com.algorithm.sorting;

import java.util.Arrays;
/*
 * Insertion Sort
 * --------------
 * Insertion sort is the sorting mechanism where 
 * the sorted array is built having one item at a time. 
 * The array elements are compared with each 
 * other sequentially and then arranged simultaneously 
 * in some particular order.
 * 
 * It is much less efficient on large lists than 
 * more advanced algorithms such as quicksort, heapsort, 
 * or merge sort.
 * 
 * Time Complexity
 * ---------------
 * Worst Case : O(n^2)
 * Best Case : O(n)
 */

public class InsertionSort {
	public static void main(String[] args) {
		int array[] ={3,60,35,2,45,320,5};
		System.out.println("Before Sorting :: ");
        System.out.println(Arrays.toString(array));
        insertionSort(array);
        System.out.println("After Sorting :: ");
        System.out.println(Arrays.toString(array));
	}
	
	public static void insertionSort(int array[]){
		int n = array.length;
		for(int i=1;i<n;i++){
			int key = array[i];
			int j = i-1;
			while(j >= 0 && array[j] > key){
				array[j+1] = array[j];
				j = j-1;
			}
			array[j+1] = key;
		}
	}
}
/*
	OUTPUT
	Before Sorting :: 
	[3, 60, 35, 2, 45, 320, 5]
	After Sorting :: 
	[2, 3, 5, 35, 45, 60, 320]
*/