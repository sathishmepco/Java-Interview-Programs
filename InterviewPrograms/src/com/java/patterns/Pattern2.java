package com.java.patterns;

import java.util.Scanner;

/*
 * 	Write a Java Program to print the following Pattern

	1
	2 2
	3 3 3
	4 4 4 4
	5 5 5 5 5
	6 6 6 6 6 6
*/

public class Pattern2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows to print the pattern :: ");
		int N = Integer.parseInt(scanner.nextLine().trim());

		//logic to print the pattern
		for(int i=1;i<=N;i++){
			for(int j=1;j<=i;j++)
				System.out.print(i+" ");
			System.out.println();
		}
		
		scanner.close();
	}
}
/*
	OUTPUT
	Enter the number of rows to print the pattern :: 10
	1 
	2 2 
	3 3 3 
	4 4 4 4 
	5 5 5 5 5 
	6 6 6 6 6 6 
	7 7 7 7 7 7 7 
	8 8 8 8 8 8 8 8 
	9 9 9 9 9 9 9 9 9 
	10 10 10 10 10 10 10 10 10 10 
*/