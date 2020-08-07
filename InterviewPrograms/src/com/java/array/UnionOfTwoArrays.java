package com.java.array;

/*
 * Union Of Two Arrays
 * -------------------
 * The Union of Two Arrays Array1, Array2 is the 
 * new array which contains all the elements which are
 * either in array1 or in array2, or in both arrays.
 * 
 * array1 = {17, 23, 31, 14, 25, 26};
 * array2 = {23, 44, 14, 8, 17};
 * 
 * 17, 14 and 23 are present in both arrays
 * UnionArray should contain only one time
 * 
 * 31, 25 & 26 are present only in array1
 * all these elements should present in UnionArray
 * 
 * 44 & 8 are present only in array2
 * all these elements should present in UnionArray
 * 
 * UnionArray = {17, 23, 31, 14, 25, 26, 44, 8};
 * 
 */
public class UnionOfTwoArrays {
	public static void main(String[] args) {
		int array1[] = {17, 23, 31, 14, 25, 26};
		int array2[] = {23, 44, 14, 8, 17};
		
		//if both arrays don't have any common element
		//then the max len will be array1 len + array2 len
		int unionArrayMaxLen = array1.length + array2.length;
		int unionArray[] = new int[unionArrayMaxLen];
	
		int k = 0;
		//copy all the elements from the 1st array
		for(int i=0;i<array1.length;i++,k++)
			unionArray[k] = array1[i];
	
		//iterate array2 and check the element is present in
		//unionArray or not
		//if the element is already present then continue
		//check with next element
		//if the element is not present then add it to
		//unionArray
		for(int i=0;i<array2.length;i++){
			int j = 0;
			for(j=0;j<k;j++)
				if(unionArray[j] == array2[i])
					break;
			if(j == k)
				unionArray[k++] = array2[i];
		}
		
		System.out.println("Given Array 1 is : ");
		for(int i=0;i<array1.length;i++)
			System.out.print(array1[i]+" ");
		
		System.out.println("\nGiven Array 2 is : ");
		for(int i=0;i<array2.length;i++)
			System.out.print(array2[i]+" ");
		
		System.out.println("\nUnion of Two Array is : ");
		for(int i=0;i<k;i++)
			System.out.print(unionArray[i]+" ");
	}
}
/*
	OUTPUT
	
	Given Array 1 is : 
	17 23 31 14 25 26 
	Given Array 2 is : 
	23 44 14 8 17 
	Union of Two Array is : 
	17 23 31 14 25 26 44 8  
*/