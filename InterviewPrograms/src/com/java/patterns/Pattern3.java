package com.java.patterns;

import java.util.Scanner;

/*
 * 	Write a Java Program to print the following Pattern

	6 5 4 3 2 1
	6 5 4 3 2 
	6 5 4 3 
	6 5 4
	6 5
	6
 */
public class Pattern3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows to print the pattern :: ");
		int N = Integer.parseInt(scanner.nextLine().trim());
		
		//logic to print the pattern
		for(int i=1; i<=N; i++){
			for(int j=N; j>=i; j--)
				System.out.print(j+" ");
			System.out.println();
		}
		
		scanner.close();
	}
}

/*
	OUTPUT
	
	Enter the number of rows to print the pattern :: 10
	10 9 8 7 6 5 4 3 2 1 
	10 9 8 7 6 5 4 3 2 
	10 9 8 7 6 5 4 3 
	10 9 8 7 6 5 4 
	10 9 8 7 6 5 
	10 9 8 7 6 
	10 9 8 7 
	10 9 8 
	10 9 
	10 

*/