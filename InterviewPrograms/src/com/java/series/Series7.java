package com.java.series;

import java.util.Scanner;

/*
 * 	Write Java program to generate the following Series
 * 
 * 	2 9 28 65 126 217 344
 * 
 * 	Solution is 
 *  result = i^3 + 1
 *  
 *  for values i = 1 to n
 *  1 = 1^3 + 1 = 2  
 *  2 = 2^3 + 1 = 9
 *  3 = 3^3 + 1 = 28
 *  4 = 4^3 + 1 = 65
 *  5 = 5^3 + 1 = 126
 *  6 = 6^3 + 1 = 217
 *  7 = 6^3 + 1 = 344
 */

public class Series7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the N value for the series : ");
		int N = Integer.parseInt(scanner.nextLine().trim());
	
		if(N <= 0){
			System.out.println("Cannot generate the Series!");
			System.exit(1);
		}
		
		for(int i=1;i<=N;i++){
			int result = (i*i*i) + 1;
			System.out.print(result+" ");
		}
		
		scanner.close();
	}
}
/*
	TEST CASE 1
	Enter the N value for the series : 10
	2 9 28 65 126 217 344 513 730 1001 
	
	TEST CASE 2
	Enter the N value for the series : 15
	2 9 28 65 126 217 344 513 730 1001 1332 1729 2198 2745 3376  
*/