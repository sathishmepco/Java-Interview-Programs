package com.java.array;

import java.util.Arrays;
import java.util.HashSet;

//MAXIMUM SCORE IS 100
public class FindDuplicates {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		int array[] = {4,2,4,5,2,3,1,2,3};
		for(int i =0;i<array.length;i++){
			if(array[Math.abs(array[i])] > 0)
				array[Math.abs(array[i])] = -array[Math.abs(array[i])];
			else{
				set.add(Math.abs(array[i]));
			}
		}
		System.out.println("No of duplicate elements are :: "+set.size());
	}
}