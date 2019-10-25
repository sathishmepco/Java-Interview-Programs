package com.java.series;

import java.util.Scanner;

/*
 * Print the EVEN number series
 * 
 * 0 2 4 6 8 10 12 14 ....
 * 
 * In the for loop, either use i++, check i is even and print
 * Else in the for loop use i+=2 then print i value
 * i starts with value 0
 */
public class EvenNumberSeries {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the N(end value) value for even number series : ");
		int N = Integer.parseInt(scanner.nextLine().trim());
		
		for(int i=0;i<=N;i+=2)
			System.out.print(i+" ");
		
		scanner.close();
	}
}

/*
	OUTPUT
	
	Enter the N(end value) value for even number series : 25
	0 2 4 6 8 10 12 14 16 18 20 22 24
	
	Enter the N(end value) value for even number series : 14
	0 2 4 6 8 10 12 14
	 
*/