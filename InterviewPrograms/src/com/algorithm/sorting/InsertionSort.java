package com.algorithm.sorting;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int array[] ={3,60,35,2,45,320,5};
		System.out.println("Before Sorting :: "+Arrays.toString(array));
		insertionSort(array);
		System.out.println("After Sorting :: "+Arrays.toString(array));
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