package com.algorithm.search;

public class LinearSearch {
	
	public static void main(String[] args) {
		int array[] ={3,60,35,2,45,320,5};
		int X = 12;
		
		for(int i=0;i<array.length;i++)
			if(X == array[i]){
				System.out.println("Element found!");
				return;
			}
			
		System.out.println("Element not found");
	}

}