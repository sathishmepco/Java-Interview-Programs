package com.algorithm.sorting;

import java.util.Arrays;

/*
 * Bubble Sort
 * ------------ 
 * Bubble sort, sometimes referred to as sinking sort, 
 * is a simple sorting algorithm that repeatedly steps 
 * through the list, compares adjacent elements and 
 * swaps them if they are in the wrong order. 
 * 
 * The pass through the list is repeated until the 
 * list is sorted. The algorithm, which is a comparison 
 * sort, is named for the way smaller or larger 
 * elements "bubble" to the top of the list.
 * 
 * Time Complexity 
 * ----------------
 * Worst Case : O(n^2)
 * Best Case : O(n)
 */

public class BubbleSort {
	public static void main(String[] args) {
        int array[] ={3,60,35,2,45,320,5};
        System.out.println("Before Sorting :: ");
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println("After Sorting :: ");
        System.out.println(Arrays.toString(array));
	}
	
	public static void bubbleSort(int array[]){
		int n = array.length;
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++){
				if(array[j] > array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
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