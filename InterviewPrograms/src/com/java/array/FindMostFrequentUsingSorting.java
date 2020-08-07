package com.java.array;

import java.util.Arrays;

/*
 * Find the Most Frequent Element in an Array
 * ------------------------------------------
 * Using Sorting
 * 
 * Lets sort the given array. 
 * After sorting the array, all the duplicate
 * elements will get lined up next to each other.
 * We can now linearly find the frequency of 
 * all the elements of the given array.
 * This approach ensures that frequency is calculated
 * only once for each unique element. 
 *
 * Say array is {8, 9, 3, 3, 6, 3, 8, 1, 6};
 * Sort the array {1, 3, 3, 3, 6, 6, 8, 8, 9};
 * 
 * take the ith element and compare with (i+1) element
 * if both are same, increment local counter and
 * compare with (i+2)
 * continue the same until both are not same.
 * 
 * When both are not same, stop at that place
 * compare local_counter with ans_counter
 * if it is greater then update the output_counter and 
 * output variable.
 * 
 * Then continue with (i+k) until reach 
 * the end of array
 * 
 * For the above example
 * array[i] = 1, local_counter = 1
 * update output and output_counter
 * output = 1, output_counter = 1
 * 
 * array[i] = 3, local_counter = 3
 * compare with output_counter and update
 * output = 3, output_counter = 3
 * 
 * array[i] = 6, local_counter = 2
 * compare with output_counter and update
 * here local_counter = 2 and output_counter = 3
 * so no need update
 * output = 3, output_counter = 3
 * 
 * continue to end of the array
 * Finally the output is
 * output = 3
 * output_counter = 3
 *
 * When two elements have the same frequent values
 * then minimum of both will the output.
 *  
 */

public class FindMostFrequentUsingSorting {
	public static void main(String[] args) {
//		int arr[] = {3, 9, 1, 3, 6, 3, 8, 1, 6};
//		int arr[] = {1, 9, 1, 3, 2, 3, 10};
		int arr[] = {2, 1, 2, 2, 1, 3};
		int N = arr.length;
		int output = 0;
		int output_counter = 0;
		
		Arrays.sort(arr);
		
		for(int i=0;i<N;i++){
			int local_counter = 1;
			while( i+1 < N && arr[i+1] == arr[i]){
				local_counter++;
				i++;
			}
			if(output_counter < local_counter){
				output = arr[i];
				output_counter = local_counter;
			}
		}
		System.out.println("Most Frequent element is :: "+output);
		System.out.println("Frequency of the element is :: "+output_counter);
	}
}
/*
	INPUT
	{3, 9, 1, 3, 6, 3, 8, 1, 6}
	OUTPUT
	Most Frequent element is :: 3
	Frequency of the element is :: 3
	
	INPUT
	{1, 9, 1, 3, 2, 3, 10}
	OUTPUT
	Most Frequent element is :: 1
	Frequency of the element is :: 2
	
	INPUT
	{2, 1, 2, 2, 1, 3}
	OUTPUT
	Most Frequent element is :: 2
	Frequency of the element is :: 3
*/