package com.java.patterns;

import java.util.Scanner;

/*
 * 	Write a Java Program to print the following Pattern
	1
	2 1
	3 2 1
	4 3 2 1
	5 4 3 2 1 
	6 5 4 3 2 1 
 */
public class Pattern8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows to print the pattern :: ");
		int N = Integer.parseInt(scanner.nextLine().trim());
		
		for(int i=1;i<=N;i++){
			for(int j=i;j>=1;j--)
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
	2 1 
	3 2 1 
	4 3 2 1 
	5 4 3 2 1 
	6 5 4 3 2 1 
	7 6 5 4 3 2 1 
	8 7 6 5 4 3 2 1 
	9 8 7 6 5 4 3 2 1 
	10 9 8 7 6 5 4 3 2 1 
*/