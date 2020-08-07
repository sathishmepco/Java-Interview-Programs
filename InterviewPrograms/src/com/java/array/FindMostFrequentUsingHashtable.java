package com.java.array;

import java.util.Hashtable;

/*
 * Find the Most Frequent Element in an Array
 * ------------------------------------------
 * Using Hash Table
 * 
 * We can create a hash table and store elements and 
 * their frequency counts as key value pair.
 *  
 * Create a Hash Table to store frequency of each 
 * element in the given array. Consider elements 
 * in the array as key and their frequency as value 
 *
 * First scan the array one by one and check 
 * if value associated with any key (as that 
 * particular element) exist in the Hash Table or not
 *
 * If exist, increment the value of that key by 1
 * If not, store the value as 1
 * 
 * During the iteration, we are also storing the most 
 * frequent element and its frequency in the parameter 
 * output and max_freq respectively.
 * 
 * 
 * Say array is {8, 9, 3, 3, 6, 3, 8, 1, 6};
 * Create a Hash Table 
 * H = key --> value
 * 
 * Iterate the array using for loop
 * at i = 0
 * 8 --> 1
 * at i = 1
 * 8 --> 1
 * 9 --> 1
 * at i = 2
 * 8 --> 1
 * 9 --> 1
 * 3 --> 1
 * at i = 3
 * 8 --> 1
 * 9 --> 1
 * 3 --> 2
 * ...
 * 
 * at i = n-1
 * 8 --> 2
 * 9 --> 1
 * 3 --> 3 
 * 6 --> 2
 * 1 --> 1
 * 
 * So 3 is the output
 * Because 3 repeated 3 times (max frequency).
 * 
 */
public class FindMostFrequentUsingHashtable {
	
	public static void main(String[] args) {
//		int arr[] = {3, 9, 1, 3, 6, 3, 8, 1, 6};
//		int arr[] = {1, 9, 1, 3, 2, 3, 10};
		int arr[] = {2, 1, 2, 2, 1, 3};
		int N = arr.length;
		int output = 0;
		int max_freq = 0;
		Hashtable<Integer, Integer> table = new Hashtable<>();
	
		for(int i=0;i<N;i++){
			if(table.containsKey(arr[i]))
				table.put(arr[i], table.get(arr[i])+1);
			else
				table.put(arr[i], 1);
			int val = table.get(arr[i]);
			if(max_freq < val){
				output = arr[i];
				max_freq = val;
			}
		}
		System.out.println("Most Frequent element is :: "+output);
		System.out.println("Frequency of the element is :: "+max_freq);
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