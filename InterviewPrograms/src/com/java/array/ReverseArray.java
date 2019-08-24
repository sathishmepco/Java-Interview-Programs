package com.java.array;

/*
 * Author - Suraj Subramanian
 * */

public class ReverseArray {

	public static void main(String[] args) {
		
		int array[]= {1,2,3,4,5,6,7,8,9,10};
		int temp;
		
		//run the loop n/2 times and swap positions one by one
		for(int i=0;i<array.length/2;i++) {
			temp=array[i];
			array[i]=array[array.length-1-i];	// array.length-1-i instead of another variable to point to end of array
			array[array.length-1-i]=temp;
		}
		
		//print the reversed array
		for(int x : array) {
			System.out.println(x);
		}
	}
	
}
