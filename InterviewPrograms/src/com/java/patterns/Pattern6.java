package com.java.patterns;

import java.util.Scanner;

/*
 * 	Write a Java Program to print the following Pattern
	1 2 3 4 5 6
	1 2 3 4 5
	1 2 3 4
	1 2 3
	1 2 
	1 
	1 2
	1 2 3 
	1 2 3 4 
	1 2 3 4 5
	1 2 3 4 5 6
 */
public class Pattern6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows to print the pattern :: ");
		int N = Integer.parseInt(scanner.nextLine().trim());
		
		for(int i=N;i>=1;i--){
			for(int j=1;j<=i;j++)
				System.out.print(j+" ");
			System.out.println();
		}
		for(int i=2; i<=N; i++){
			for(int j=1;j<=i;j++)
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
	1 2 3 4 5 6 7 8 9 
	1 2 3 4 5 6 7 8 
	1 2 3 4 5 6 7 
	1 2 3 4 5 6 
	1 2 3 4 5 
	1 2 3 4 
	1 2 3 
	1 2 
	1 
	1 2 
	1 2 3 
	1 2 3 4 
	1 2 3 4 5 
	1 2 3 4 5 6 
	1 2 3 4 5 6 7 
	1 2 3 4 5 6 7 8 
	1 2 3 4 5 6 7 8 9 
	1 2 3 4 5 6 7 8 9 10 
*/