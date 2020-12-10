package com.algorithm.search;

/*
 * Linear Search
 * --------------
 * In computer science, a linear search or 
 * sequential search is a method for finding 
 * an element within a list.
 *  
 * It sequentially checks each element of the 
 * list until a match is found or the 
 * whole list has been searched.
 * 
 * Time Complexity
 * ----------------
 * Worst Case 	O(n)
 * Best Case 	O(1)
 */

public class LinearSearch {
	public static void main(String[] args) {
		int array[] ={3,60,35,2,45,320,5};
		int X = 320;
		
		for(int i=0;i<array.length;i++)
			if(X == array[i]){
				System.out.println("Element found at index : "+i);
				return;
			}
			
		System.out.println("Element NOT found");
	}
}
/*
	OUTPUT
	array[] ={3,60,35,2,45,320,5}
	X = 320
	Element found at index : 5

	OUTPUT
	array[] ={3,60,35,2,45,320,5}
	X = 12
	Element NOT found
*/