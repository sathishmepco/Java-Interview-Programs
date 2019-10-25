package com.java.series;

import java.util.Scanner;

/*
 * Print the ODD number series
 * 
 * 1 3 5 7 9 11 13 15 17 19 .....
 * 
 * In the for loop, either use i++, check i is odd and print
 * Else in the for loop use i+=2 then print i value
 * i starts with value 1
 */
public class OddNumberSeries {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the N(end value) value for even number series : ");
		int N = Integer.parseInt(scanner.nextLine().trim());
		
		for(int i=1;i<=N;i+=2)
			System.out.print(i+" ");
		
		scanner.close();
	}
}
/*
OUTPUT

Enter the N(end value) value for even number series : 20
1 3 5 7 9 11 13 15 17 19

Enter the N(end value) value for even number series : 13
1 3 5 7 9 11 13
 
*/