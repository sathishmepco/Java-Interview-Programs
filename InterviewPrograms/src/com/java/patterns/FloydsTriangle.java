package com.java.patterns;

import java.util.Scanner;
/*
 * Floyd's Triangle
 * 
 * Floyd's triangle is a right-angled triangular array of natural numbers, 
 * used in computer science education. It is named after Robert Floyd. 
 * It is defined by filling the rows of the triangle with consecutive numbers, 
 * starting with a 1 in the top left corner:
	1 
	2 3 
	4 5 6 
	7 8 9 10 
	11 12 13 14 15 
	16 17 18 19 20 21 
	22 23 24 25 26 27 28 
	29 30 31 32 33 34 35 36 
	37 38 39 40 41 42 43 44 45 
	46 47 48 49 50 51 52 53 54 55
 */
public class FloydsTriangle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows of Floyd's Triangle to print :: ");
		int rows = Integer.parseInt(scanner.nextLine().trim());

		//logic to print the Floyd's triangle
		int value = 1;
		for(int i=0;i<rows;i++){
			for(int j=0;j<(i+1);j++,value++)
				System.out.print(value+" ");
			System.out.println();
		}
			
		scanner.close();
	}
}
/*
	Enter the number of rows of Floyd's Triangle to print :: 5
	1 
	2 3 
	4 5 6 
	7 8 9 10 
	11 12 13 14 15
	
	Enter the number of rows of Floyd's Triangle to print ::  10
	1 
	2 3 
	4 5 6 
	7 8 9 10 
	11 12 13 14 15 
	16 17 18 19 20 21 
	22 23 24 25 26 27 28 
	29 30 31 32 33 34 35 36 
	37 38 39 40 41 42 43 44 45 
	46 47 48 49 50 51 52 53 54 55 
 
*/