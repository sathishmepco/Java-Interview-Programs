package com.java.patterns;

import java.util.Scanner;

/*
 * 	Write a Java Program to print the following Pattern
	1 2 3 4 5 6 
	  2 3 4 5 6 
	    3 4 5 6 
	      4 5 6 
	        5 6 
	          6 
	        5 6 
	      4 5 6 
	    3 4 5 6 
	  2 3 4 5 6 
	1 2 3 4 5 6 
 */
public class Pattern7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows to print the pattern :: ");
		int N = Integer.parseInt(scanner.nextLine().trim());
		
		for(int i=1;i<=N;i++){
			for(int k=1;k<i;k++)
				System.out.print("  ");
			for(int j=i;j<=N;j++)
				System.out.print(j+" ");
			System.out.println();
		}
		for(int i=N-1; i>=1; i--){
			for(int k=1;k<i;k++)
				System.out.print("  ");
			for(int j=i;j<=N;j++)
				System.out.print(j+" ");
			System.out.println();
		}
		
		scanner.close();
	}
}
/*
	OUTPUT
	
	Enter the number of rows to print the pattern :: 10
	1 2 3 4 5 6 7 8 9 10 
	  2 3 4 5 6 7 8 9 10 
	    3 4 5 6 7 8 9 10 
	      4 5 6 7 8 9 10 
	        5 6 7 8 9 10 
	          6 7 8 9 10 
	            7 8 9 10 
	              8 9 10 
	                9 10 
	                  10 
	                9 10 
	              8 9 10 
	            7 8 9 10 
	          6 7 8 9 10 
	        5 6 7 8 9 10 
	      4 5 6 7 8 9 10 
	    3 4 5 6 7 8 9 10 
	  2 3 4 5 6 7 8 9 10 
	1 2 3 4 5 6 7 8 9 10  
*/