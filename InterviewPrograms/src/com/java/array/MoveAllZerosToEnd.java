package com.java.array;

/*
 * Move All the Zeros to end of the Array
 * ---------------------------------------
 * Assume the given array contains some zero
 * in some index positions.
 * 
 * Move all the zero to end of the Array
 * 
 * array[] = {1, 0, 4, 3, 0, 0, 2, 0, 1, 0}
 * 
 * after moving to end of the array
 * 
 * array[] = {1, 4, 3, 2, 1, 0, 0, 0, 0, 0}
 */
public class MoveAllZerosToEnd {
	public static void main(String[] args) {
		int array[] = {1, 0, 4, 3, 0, 0, 2, 0, 1, 0};
		System.out.println("The Given Array is :: ");
		for(int v : array)
			System.out.print(v+" ");
		
		int count = 0;
		for(int i=0;i<array.length;i++)
			if(array[i] != 0)
				array[count++] = array[i];
		
		while(count < array.length)
			array[count++] = 0;
		
		System.out.println("\nAfter moving all zeros to end of array :: ");
		for(int v : array)
			System.out.print(v+" ");
		
	}
}
/*
	OUTPUT
	The Given Array is :: 
	1 0 4 3 0 0 2 0 1 0 
	After moving all zeros to end of array :: 
	1 4 3 2 1 0 0 0 0 0 
*/