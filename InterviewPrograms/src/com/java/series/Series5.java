package com.java.series;

import java.util.Scanner;

/*
 * 	Write Java program to generate the following Series
 * 
 * 	1 2 4 7 11 16 22 29
 * 
 * 	Solution is 
 *  i-th value = ( (i * (i-1) ) / 2) + 1
 *  
 *  for values i = 1 to n
 *  1 = ( (1 * (1-1) ) / 2) + 1 = 1 
 *  2 = ( (2 * (2-1) ) / 2) + 1 = 2
 *  3 = ( (3 * (3-1) ) / 2) + 1 = 4
 *  4 = ( (4 * (4-1) ) / 2) + 1 = 7
 *  5 = ( (5 * (5-1) ) / 2) + 1 = 11
 *  6 = ( (6 * (6-1) ) / 2) + 1 = 16
 */
public class Series5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value (N) for the series : ");
		int N = scanner.nextInt();
	
		if(N <= 0){
			System.out.println("Cannot generate the Series!");
			System.exit(1);
		}
		
		for(int i=1;i<=N;i++){
			int result = ((i*(i-1))/2)+1;
			System.out.print(result+" ");
		}
		
		scanner.close();
	}
}
/*
	TEST CASE 1
	Enter the value (N) for the series : 10
	1 2 4 7 11 16 22 29 37 46

	TEST CASE 2
	Enter the value (N) for the series : 15
	1 2 4 7 11 16 22 29 37 46 56 67 79 92 106 
*/