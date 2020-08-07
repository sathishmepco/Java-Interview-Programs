package com.java.array;

/*
 * Move All the Zeros to Start of the Array
 * -----------------------------------------
 * Assume the given array contains some zero
 * in some index positions.
 * 
 * Move all the zero to start of the Array
 * 
 * array[] = {1, 0, 4, 3, 0, 0, 2, 0, 1, 0}
 * 
 * after moving to start of the array
 * 
 * array[] = {0, 0, 0, 0, 0, 1, 4, 3, 2, 1}
 */
public class MoveAllZerosToFront {
	public static void main(String[] args) {
		int array[] = {1, 0, 4, 3, 0, 0, 2, 0, 1, 0};
		System.out.println("The Given Array is :: ");
		for(int v : array)
			System.out.print(v+" ");
		
		int count = array.length-1;
		for(int i=array.length-1 ;i >= 0; i--)
			if(array[i] != 0)
				array[count--] = array[i];
		
		while(count >= 0)
			array[count--] = 0;
		
		System.out.println("\nAfter moving all zeros to start of array :: ");
		for(int v : array)
			System.out.print(v+" ");
	}
}
/*
	OUTPUT
	The Given Array is :: 
	1 0 4 3 0 0 2 0 1 0 
	After moving all zeros to start of array :: 
	0 0 0 0 0 1 4 3 2 1  
*/