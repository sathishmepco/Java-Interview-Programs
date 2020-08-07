package com.java.array;

/*
 * Find Intersection of Two Arrays
 * --------------------------------
 * 
 * INTERSECTION
 * Common element in both arrays.
 * Intersection array elements are should be
 * present in both array1 and array2 
 * 
 * say array1 = {44, 49, 30, 25, 67, 69};
 * say array2 = {88, 44, 69, 93, 30};
 * 
 * intersection of two array is
 * intersection = {44, 30, 69}
 */

public class IntersectionOfTwoArrays {
	public static void main(String[] args) {
		int array1[] = {44, 49, 30, 25, 67, 69};
		int array2[] = {88, 44, 69, 93, 30};
		
		System.out.println("Given array 1 is : ");
		for(int v : array1)
			System.out.print(v+" ");
		
		System.out.println("\nGiven array 2 is : ");
		for(int v : array2)
			System.out.print(v+" ");
		
		int intersectionLength = array1.length;
		if(array2.length < array1.length)
			intersectionLength = array2.length;
		
		int intersectionArray[] = new int[intersectionLength];
		int k = 0;
		for(int a : array1){
			for(int b : array2){
				if(a == b){
					intersectionArray[k++] = a; 
					break;
				}
			}
		}
		
		System.out.println("\nIntersection of the array 1 & 2 is :");
		for(int i=0;i<k;i++)
			System.out.print(intersectionArray[i]+" ");
		
	}
}
/*
	OUTPUT
	Given array 1 is : 44 49 30 25 67 69 
	Given array 2 is : 88 44 69 93 30 
	Intersection of the array 1 & 2 is : 44 30 69  	
*/