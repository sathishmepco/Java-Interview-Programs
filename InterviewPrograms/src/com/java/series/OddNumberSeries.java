package com.java.series;

import java.util.Scanner;

/*
 * ODD Number Series
 * ------------------
 * 1 3 5 7 9 11 13 15 17 19 .....
 * 
 * In the for loop, either use i++, check i is odd and print
 * Else in the for loop use i+=2 then print i value
 * i starts with value 1
 */

public class OddNumberSeries {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the N value :");
		int N = scanner.nextInt();
		
		System.out.println("ODD numbers up to "+N);
		for(int i=1;i<=N;i+=2)
			System.out.print(i+" ");
		
		scanner.close();
	}
}
/*
	OUTPUT

	Enter the N value : 20
	ODD numbers up to 20
	1 3 5 7 9 11 13 15 17 19

	Enter the N value : 13
	ODD numbers up to 13
	1 3 5 7 9 11 13
*/