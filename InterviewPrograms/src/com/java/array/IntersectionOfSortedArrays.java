package com.java.array;

/*
 * Intersection of two Sorted Arrays
 * ----------------------------------
 * 
 * Assume that both the given arrays are 
 * sorted arrays.
 * 
 * INTERSECTION of Two arrays means.
 * Common element in both arrays.
 * Intersection array elements are should be
 * present in both array1 and array2
 * 
 *  say array1 = {1, 2, 3, 4, 5, 6}
 * 	say array2 = {2, 4, 6, 8,10}
 * 
 * intersection of two array is 
 * {2, 4, 6}
 * these elements are present in both
 * array1 and array2.
 * 
 */
public class IntersectionOfSortedArrays {
	public static void main(String[] args) {
		int array1[] = {1, 2, 3, 4, 5, 6};
		int array2[] = {2, 4, 6, 8, 10};
		
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
		int i=0, j=0, k = 0;
		
		while(i<array1.length && j<array2.length){
			if(array1[i] == array2[j]){
				intersectionArray[k++] = array1[i];
				i++;
				j++;
			}else if(array1[i] > array2[j])
				j++;
			else 
				i++;
		}
		
		intersectionLength = k;
		System.out.println("\nIntersection of the array 1 & 2 is :");
		for(k=0;k<intersectionLength;k++)
			System.out.print(intersectionArray[k]+" ");
	}
}
/*
	OUTPUT
	Given array 1 is : 
	1 2 3 4 5 6 
	Given array 2 is : 
	2 4 6 8 10 
	Intersection of the array 1 & 2 is :
	2 4 6 
*/