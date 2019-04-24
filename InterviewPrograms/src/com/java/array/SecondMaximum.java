package com.java.array;

import java.util.Arrays;

//This code will return second maximum in an array
public class SecondMaximum {
	
	public static void main(String[] args) {
		
		int array[] = {10,32,34,54,19,29,38,45};
		
		int max = array[0];
		int secondMax = array[1];
		
		if(max < secondMax){
			max = array[1];
			secondMax = array[0];
		}
		
		for(int i=2;i<array.length;i++){
			if(array[i] > max){
				secondMax = max;
				max = array[i];
			}else if(array[i] > secondMax){
				secondMax = array[i];
			}
		}
		
		System.out.println("Given array is : "+Arrays.toString(array));
		System.out.println("Max value in the array is : "+max);
		System.out.println("Second max value in the array is : "+secondMax);
	}
}