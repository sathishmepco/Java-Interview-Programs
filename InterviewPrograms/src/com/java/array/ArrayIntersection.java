package com.java.array;

/*
 * 	Find Intersection of Two Arrays
 * 
 * Write a Java Program to find the intersection of 
 * Two Arrays
 * 
 * say array1 = {1, 2, 3, 4, 5, 6}
 * say array2 = {2, 4, 6, 8,10}
 * 
 * intersection of two array is
 * intersection = {2, 4, 6}
 */

public class ArrayIntersection {
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
	Given array 1 is : 1 2 3 4 5 6 
	Given array 2 is : 2 4 6 8 10 
	Intersection of the array 1 & 2 is : 2 4 6 	
*/

