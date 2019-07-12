package com.algorithm.sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int array[] = {90,23,101,45,65,23,67,89,34,23};
		System.out.println("Before Sorting :: "+Arrays.toString(array));
        sort(array,0,array.length-1);
        System.out.println("After Sorting :: "+Arrays.toString(array));
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