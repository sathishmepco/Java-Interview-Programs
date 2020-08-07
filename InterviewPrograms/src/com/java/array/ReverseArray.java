package com.java.array;

/*
 * Reverse the Array without using additional Array
 * ------------------------------------------------
 * 
 * given array[]= {1,2,3,4,5,6,7,8,9,10};
 * reversed array[]= {10,9,8,7,6,5,4,3,2,1};
 * 
 * Steps to reverse
 * swap 0th index with (N-1) index (swap 1 & 10)
 * swap 1st index with (N-2) index (swap 2 & 9)
 * swap 2nd index with (N-3) index (swap 3 & 8)
 * swap 3rd index with (N-4) index (swap 4 & 7)
 * swap 4th index with (N-5) index (swap 5 & 6)
 * 
 * In General
 * 
 * swap i th index with (N - 1 - i) index
 * No of iterations will by (N/2)
 * 
 */

public class ReverseArray {
	public static void main(String[] args) {
		int array[]= {1,2,3,4,5,6,7,8,9,10};
		int N = array.length;
		int temp;
		
		System.out.println("The Given Array is : ");
		for(int x : array) {
			System.out.print(x+" ");
		}
		
		// N/2 iterations
		for(int i=0;i<N/2;i++) {
			//swap ith index with N-i-1 index
			temp = array[i];
			array[i] = array[N - 1 - i];	
			array[N - 1 - i] = temp;
		}
		
		System.out.println("\nThe Reversed Array is : ");
		for(int x : array) {
			System.out.print(x+" ");
		}
	}
}
/*
	OUTPUT
	The Given Array is : 
	1 2 3 4 5 6 7 8 9 10 
	The Reversed Array is : 
	10 9 8 7 6 5 4 3 2 1 
*/