package com.java.array;

/*
 * Find the Most Frequent Element in an Array
 * -------------------------------------------
 * Using Brute Force Approach
 * 
 * For the each element, scan the entire array 
 * to find its duplicates. Maintain two variables 
 * max_freq and output to store the maximum frequent
 * and output with that frequency respectively.
 *
 * Say array is {8, 9, 3, 3, 6, 3, 8, 1, 6};
 * start with 8 and scan all the element for 8 (i=0)
 * max_freq = 2 and output = 8
 * 
 * then next scan all the 9 (i=1)
 * 9 is repeated only one time so its count is = 1 
 * So don't update max_frequent
 * 
 * then next scan all the 3(i=2)
 * 3 is occurred 3 times in the array
 * now max_freq = 3 and output = 3
 * 
 * Continue the same procedure for all the 
 * elements in the array
 * 
 * Finally output variable will return the most 
 * frequent element in the array.
 * 
 * When two elements have the same frequent values
 * then minimum of both will the output.
 *  
 */
public class FindMostFrequent {
	public static void main(String[] args) {
		int arr[] = {3, 9, 1, 3, 6, 3, 8, 1, 6};
//		int arr[] = {1, 9, 1, 3, 2, 3, 10};
//		int arr[] = {2, 1, 2, 2, 1, 3};

		int max_freq = 0;
		int output = 0;
		int N = arr.length;
		
		for(int i=0;i<N;i++){
			int cur_freq = 1;
			for(int j=i+1;j<N;j++){
				if(arr[i] == arr[j])
					cur_freq++;
			}
			if(cur_freq > max_freq){
				max_freq = cur_freq;
				output = arr[i];
			}else if(cur_freq == max_freq && output > arr[i]){
				max_freq = cur_freq;
				output = arr[i];
			}
		}
		
		System.out.println("Most Frequent element is :: "+output);
		System.out.println("Occurred "+max_freq+" times.");
	}
}
/*
	INPUT
	{3, 9, 1, 3, 6, 3, 8, 1, 6}
	OUTPUT
	Most Frequent element is :: 3
	Occurred 3 times.
	
	INPUT
	{1, 9, 1, 3, 2, 3, 10}
	OUTPUT
	Most Frequent element is :: 1
	Occurred 2 times.

	INPUT
	{2, 1, 2, 2, 1, 3}
	OUTPUT
	Most Frequent element is :: 2
	Occurred 3 times.
*/