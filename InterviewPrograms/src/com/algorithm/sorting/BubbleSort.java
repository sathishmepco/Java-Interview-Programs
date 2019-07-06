package com.algorithm.sorting;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
        int array[] ={3,60,35,2,45,320,5};
        System.out.println("Before Sorting :: "+Arrays.toString(array));
        bubbleSort(array);
        System.out.println("After Sorting :: "+Arrays.toString(array));
	}
	
	public static void bubbleSort(int array[]){
		int n = array.length;
		for(int i=0;i<n-1;i++)
			for(int j=0;j<n-i-1;j++)
				if(array[j] > array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
	}

}
