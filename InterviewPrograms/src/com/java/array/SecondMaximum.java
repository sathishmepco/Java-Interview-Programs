package com.java.array;

import java.util.Arrays;

/*
 * Find the Second Maximum in the Given Array
 * ------------------------------------------
 * array {10,32,34,54,19,29,38,45}
 * max is 54, second max is 45
 * 
 * array {10,20,30,40,50,60,70,80}
 * max is 80, second max is 70
 * 
 * The solution is, declare two variables
 * one variable to store maximum in the array
 * another variable to store second maximum 
 * 
 * assume 0th index value is max value
 * and 1st index value is 2nd max value
 * then iterate the array from index 2 to n
 * compare every index value with max
 * if it is greater than max value
 * then update both max and second max
 * 
 * else check the ith value is greater 
 * than 2nd max, if it so,
 * then update only 2nd max value with ith value
 */
public class SecondMaximum {
	public static void main(String[] args) {
		int array[] = {10,32,34,54,19,29,38,45};
		
		//assume 0th index value is maximum
		int max = array[0];
		// assume 1st index value is 2nd maximum
		int secondMax = array[1];
		
		//if 1st index value is greater than 0th index value
		//then swap the max and secondMax variable
		if(max < secondMax){
			max = array[1];
			secondMax = array[0];
		}
		//iterate from 2nd index
		for(int i=2;i<array.length;i++){
			if(array[i] > max){
				//if ith index is greater than maximum 
				//then update max and secondMax
				secondMax = max;
				max = array[i];
			}else if(array[i] > secondMax){
				//if ith index is not greater than max
				//still need to check with secondMax
				//if ith index greater than second max
				//then update only second max
				secondMax = array[i];
			}
		}
		
		System.out.println("Given array is : "+Arrays.toString(array));
		System.out.println("Max value in the array is : "+max);
		System.out.println("Second max value in the array is : "+secondMax);
	}
}

/*
	OUTPUT
	Given array is : 
	[10, 32, 34, 54, 19, 29, 38, 45]
	Max value in the array is : 54
	Second max value in the array is : 45
*/