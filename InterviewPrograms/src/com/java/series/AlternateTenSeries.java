package com.java.series;

/*
 * Write the program to print the following series
 * 
 * 10 1 9 2 8 3 7 4 6 5 5 6 4 7 3 8 2 9 1 10
 * 
 * Idea is very simple
 * Have only one for loop
 * 
 * variable starts with 1
 * one variable increment by 1 in every iteration
 * 
 * variable starts with 10
 * another variable decrement by 1 in every iteration
 */
public class AlternateTenSeries {
	public static void main(String[] args) {
		int a = 10;
		int b = 1;
		System.out.print("The Series is : ");
		for(int i=0;i<10;i++,a--,b++)
			System.out.print(a+" "+b+" ");
		
		System.out.print("\nAlternate approach : ");
		a = 10;
		for(int i=0;i<10;i++)
			System.out.print((a-i)+" "+(i+1)+" ");
	}
}
/*
	OUTPUT
	
	The Series is : 
	10 1 9 2 8 3 7 4 6 5 5 6 4 7 3 8 2 9 1 10 
	
	Alternate approach : 
	10 1 9 2 8 3 7 4 6 5 5 6 4 7 3 8 2 9 1 10 
*/