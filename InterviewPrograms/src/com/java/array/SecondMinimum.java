package com.java.array;

import java.util.Arrays;

/*
* Find the Second Minimum in the Given Array
* -------------------------------------------
* 
* array {10,32,34,54,19,29,38,45}
* minimum is 10, second minimum is 19
* 
* array is {10,20,30,40,50,60,70,80}
* minimum is 10, second minimum is 20
* 
* The solution is, declare two variables
* one variable to store minimum in the array
* another variable to store second minimum
*
* assume 0th index value is minimum value
* and 1st index value is 2nd min value
* then iterate the array from index 2 to n
* compare every index value with min variable
* if it is less than min variable
* then update both min and second min
* 
* else check the ith value is less 
* than 2nd min, if it so,
* then update only 2nd min variable with ith value
*/
public class SecondMinimum {
	public static void main(String[] args) {
		int array[] = {10,32,34,54,19,29,38,45};
	
		// assume 0th index value is minimum
		int min = array[0];
		// assume 1st index value is 2nd minimum
		int secondMin = array[1];
		
		//if 1st index value is minimum than 0th index value
		//then swap the min and secondMin variable
		if(min > secondMin){
			min = array[1];
			secondMin = array[0];
		}
		
		//iterate from 2nd index
		for(int i=2;i<array.length;i++){
			if(array[i] < min){
				//if ith index is less than minimum 
				//then update min and secondMin
				secondMin = min;
				min = array[i];
			}else if(array[i] < secondMin){
				//if ith index is not less than min
				//still need to check with secondmin
				//if ith index less than second min
				//then update only second min
				secondMin = array[i];
			}
		}
		
		System.out.println("Given array is : "+Arrays.toString(array));
		System.out.println("Minimum value in the array is : "+min);
		System.out.println("Second minimum value in the array is : "+secondMin);
	}
}
/*
	OUTPUT
	Given array is : 
	[10, 32, 34, 54, 19, 29, 38, 45]
	Minimum value in the array is : 10
	Second minimum value in the array is : 19
*/