package com.java.array;

import java.util.Arrays;
import java.util.HashSet;

/*
 * Union Of Two Arrays using HashSet
 * ---------------------------------
 * The Union of Two Arrays Array1, Array2 is the 
 * new array which contains all the elements which are
 * either in array1 or in array2, or in both arrays.
 * 
 * array1 = {17, 23, 31, 14, 25, 26};
 * array2 = {23, 44, 14, 8, 17};
 *
 * Using HashSet
 * 
 * HashSet will allow to store only unique elements
 * duplicate elements will not be stored.
 * 
 * Steps
 * 1. Create new HashSet 
 * 2. Add the 1st array to HashSet
 * 3. Add 2nd array to HashSet
 * 4. Duplicate elements will not be stored
 * 5. HashSet contains union both Array1 & Array2
 * 
 * Collections will allow only reference type
 * That's why array also created as reference type
 */
public class UnionArrayUsingHashSet {
	public static void main(String[] args) {
		Integer array1[] = {17, 23, 31, 14, 25, 26};
		Integer array2[] = {23, 44, 14, 8, 17};
		
		HashSet<Integer> set = new HashSet<>();
		//add all the elements of array1
		set.addAll(Arrays.asList(array1));
		//add all the elements of array2
		//duplicate elements will not be added
		set.addAll(Arrays.asList(array2));
		
		//convert HashSet to array[]
		Integer unionArray[] = set.toArray(new Integer[set.size()]);
		
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
	17 23 31 14 25 26 
	Given Array 2 is : 
	23 44 14 8 17 
	Union Of Two Arrays is :
	17 23 8 25 26 44 14 31 
*/