package com.java.array;

/*
 * Find the Most Frequent Element in an Array
 * Using Brute Force Approach
 * 
 * For the each element, scan the entire array 
 * to find its duplicates. Maintain two variables 
 * max_freq and ans to store the maximum frequent
 * and ans with that frequency respectively.
 *
 * Say array is {8, 9, 3, 3, 6, 3, 8, 1, 6};
 * start with 8 and scan all the element for 8 (i=0)
 * max_freq = 2 and ans = 8
 * 
 * then next scan all the 9 (i=1)
 * 9 is repeated only one time so its count is = 1 
 * So don't update max_frequent
 * 
 * then next scan all the 3(i=2)
 * 3 is occurred 3 times in the array
 * now max_freq = 3 and ans = 3
 * 
 * Continue the same procedure for all the 
 * elements in the array
 * 
 * Finally ans variable will return the most 
 * frequent element in the array.
 * 
 * When two elements have the same frequent values
 * then minimum of both will the output.
 *  
 */
public class FindMostFrequent {
	public static void main(String[] args) {
		int array[] = {3, 9, 1, 3, 6, 3, 8, 1, 6};
//		int array[] = {1, 9, 1, 3, 2, 3, 10};
//		int array[] = {2, 1, 2, 2, 1, 3};

		int max_freq = 0;
		int ans = 0;
		
		for(int i=0;i<array.length;i++){
			int cur_freq = 1;
			for(int j=i+1;j<array.length;j++){
				if(array[i] == array[j])
					cur_freq++;
			}
			if(cur_freq > max_freq){
				max_freq = cur_freq;
				ans = array[i];
			}else if(cur_freq == max_freq && ans > array[i]){
				max_freq = cur_freq;
				ans = array[i];
			}
		}
		
		System.out.println("Most Frequent element is :: "+ans);
		System.out.println("Occurred "+max_freq+" times.");
	}
}
/*
	Input
	{3, 9, 1, 3, 6, 3, 8, 1, 6}
	Output
	Most Frequent element is :: 3
	Occurred 3 times.
	
	Input
	{1, 9, 1, 3, 2, 3, 10}
	Output
	Most Frequent element is :: 1
	Occurred 2 times.

	Input
	{2, 1, 2, 2, 1, 3}
	Output
	Most Frequent element is :: 2
	Occurred 3 times.
*/