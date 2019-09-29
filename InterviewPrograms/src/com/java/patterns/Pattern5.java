package com.java.patterns;

import java.util.Scanner;

/*
 * 	Write a Java Program to print the following Pattern
	1
	1 2 1
	1 2 3 2 1
	1 2 3 4 3 2 1
	1 2 3 4 5 4 3 2 1
	1 2 3 4 5 6 5 4 3 2 1 
 */
public class Pattern5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows to print the pattern :: ");
		int N = Integer.parseInt(scanner.nextLine().trim());
		
		for(int i=1;i<=N;i++){
			for(int j=1;j<=i;j++)
				System.out.print(j+" ");
			for(int j=i-1;j>=1;j--)
				System.out.print(j+" ");
			System.out.println();
		}
		
		scanner.close();
	}
}
/*
	OUTPUT
	
	Enter the number of rows to print the pattern :: 10
	1 
	1 2 1 
	1 2 3 2 1 
	1 2 3 4 3 2 1 
	1 2 3 4 5 4 3 2 1 
	1 2 3 4 5 6 5 4 3 2 1 
	1 2 3 4 5 6 7 6 5 4 3 2 1 
	1 2 3 4 5 6 7 8 7 6 5 4 3 2 1 
	1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1 
	1 2 3 4 5 6 7 8 9 10 9 8 7 6 5 4 3 2 1 
 
*/