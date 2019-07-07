package com.algorithm.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
        int array[] = {64,25,12,22,11}; 
        System.out.println("Before Sorting :: "+Arrays.toString(array));
        selectionSort(array);
        System.out.println("After Sorting :: "+Arrays.toString(array));
	}

	public static void selectionSort(int array[]) {
		int n = array.length;
		for (int i = 0; i < n - 1; i++) {
			// Find the minimum element in unsorted array
			int minIndex = i;
			for (int j = i + 1; j < n; j++)
				if (array[j] < array[minIndex])
					minIndex = j;
			int temp = array[minIndex];
			array[minIndex] = array[i];
			array[i] = temp;
		}
	}

}