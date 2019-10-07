package com.java.patterns;

import java.util.Scanner;

/*
 * 	Write a Java Program to print the following Pattern
	1
	1 0
	1 0 1
	1 0 1 0
	1 0 1 0 1
	1 0 1 0 1 0  
 */
public class Pattern9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows to print the pattern :: ");
		int N = Integer.parseInt(scanner.nextLine().trim());
		
		for(int i=1;i<=N;i++){
			for(int j=1;j<=i;j++)
				System.out.print((j%2)+" ");
			System.out.println();
		}
		
		scanner.close();
	}
}
/*
	OUTPUT
	
	Enter the number of rows to print the pattern :: 10
	1 
	1 0 
	1 0 1 
	1 0 1 0 
	1 0 1 0 1 
	1 0 1 0 1 0 
	1 0 1 0 1 0 1 
	1 0 1 0 1 0 1 0 
	1 0 1 0 1 0 1 0 1 
	1 0 1 0 1 0 1 0 1 0 
*/