
package com.java.array;

import java.util.ArrayList;

/*
 * Union Of Two Sorted Arrays
 * --------------------------
 * The Union of Two Arrays Array1, Array2 is the 
 * new array which contains all the elements which are
 * either in array1 or in array2, or in both arrays.
 * 
 * array1 = {1, 2, 3, 4, 5, 6};
 * array2 = {2, 4, 6, 8};
 * unionArray = {1, 2, 3, 4, 5, 6, 8, 10}
 *
 * Steps
 * 1. Create two index variables i & j
 * i denotes index of array1 and 
 * j denotes index of array2
 * 
 * 2. If array1[i] is smaller than array2[j] 
 * then add array1[i] to unionArray
 * and increment i index (i++)
 * 
 * 3. If array1[i] is greater than array2[j]
 * then add array2[j] to unionArray
 * and increment j index (j++)
 * 
 * 4. If both array has the same value
 * then add array1[i] to unionArray
 * and increment both i & j

 * 5. Add the remaining elements of array1 
 * to unionArray 
 * 
 * 6. Add the remaining elements of array2 
 * to unionArray
 * 
 * 7. Print the unionArray.
 */

public class UnionOfSortedArrays {
	public static void main(String[] args) {
		int array1[] = {1, 2, 3, 4, 5, 6};
		int array2[] = {2, 4, 6, 8, 10};
		
		ArrayList<Integer> list = new ArrayList<>();
		
		int i=0,j=0;
		while(i < array1.length && j < array2.length){
			if(array1[i] < array2[j]){
				list.add(array1[i]);
				i++;
			}else if(array1[i] > array2[j]){
				list.add(array1[j]);
				j++;
			}else{
				list.add(array1[i]);
				i++;
				j++;
			}
		}
		while(i<array1.length){
			list.add(array1[i]);
			i++;
		}
		while(j<array2.length){
			list.add(array2[j]);
			j++;
		}			
		Integer unionArray[] = list.toArray(new Integer[list.size()]);
		
		System.out.println("Given Array 1 is : ");
		for(int v : array1)
			System.out.print(v+" ");
		
		System.out.println("\nGiven Array 2 is : ");
		for(int v : array2)
			System.out.print(v+" ");
		
		System.out.println("\nUnion Of Two Arrays is :");
		for(int v : unionArray)
			System.out.print(v+" ");
	}
}
/*
	OUTPUT
	Given Array 1 is : 
	1 2 3 4 5 6 
	Given Array 2 is : 
	2 4 6 8 10 
	Union Of Two Arrays is :
	1 2 3 4 5 6 8 10 
*/