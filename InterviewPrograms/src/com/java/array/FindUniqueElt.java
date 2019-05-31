package com.java.array;

/*
 In the given array, only one element is not repeated 
 all other elements are repeated exactly 2 times. 
 Find the element which occured only one time. 
 */
public class FindUniqueElt {
	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5};
		int output = array[0];
		for(int i=1;i<array.length;i++)
			output ^= array[i];
		System.out.println(output);
	}
}