package com.java.array;

import java.util.Arrays;

/*
 * Find the Pair (X,Y) whose sum is Z
 * -----------------------------------
 * 
 * say the given array is {2,45,7,3,5,1,8,9} 
 * and Z = 10
 * Find the pairs (x,y) whose sum is 10
 * (2,8), (1,9), (3,7) are the pairs
 * 
 * Solution
 * ---------
 * 1. Sort the given array (ascending order)
 * 2. Declare left pointer (l) which points to
 * left most element of the array (min of array)
 * 3. Declare right pointer (r) which points to
 * right most element of the array (max of array)
 * 4. Now find array[l] + array[r]
 * 5. If the sum is equal to Z, then print the x,y
 * 6. If the sum is greater than Z, then decrement 
 * right pointer r
 * 7. if the sum is lesser than Z, then increment
 * left pointer l
 * 8. Continue step 4, until l < r condition satified.
 * 
 */

public class FindPairForZ {
	public static void main(String[] args) {
//		int arr[]= {2,45,7,3,5,1,8,9};
//		int Z = 10;
		
        int arr[] = {1, 4, 45, 6, 10, 8};
        int Z = 16;


		Arrays.sort(arr);
		int left = 0;
		int right = arr.length-1;
				
		while(left < right){
			int sum = arr[left] + arr[right];
			if(sum == Z){
				System.out.println("Pair is "+
						arr[left]+", "+arr[right]);
				left++;
			}else if(sum > Z)
				right--;
			else
				left++;
		}
	}
}
/*
	INPUT
	arr[]= {2,45,7,3,5,1,8,9}
	Z = 10
	OUTPUT
	Pair is 1, 9
	Pair is 2, 8
	Pair is 3, 7
	
	INPUT
	arr[]= {1, 4, 45, 6, 10, 8}
	Z = 16
	OUTPUT
	Pair is 6, 10
*/