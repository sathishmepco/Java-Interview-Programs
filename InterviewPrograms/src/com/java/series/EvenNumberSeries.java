package com.java.series;

import java.util.Scanner;

/*
 * EVEN Number Series
 * ------------------
 * 0 2 4 6 8 10 12 14 ....
 * 
 * In the for loop, either use i++, check i is even and print
 * Else in the for loop use i+=2 then print i value
 * i starts with value 0
 */
public class EvenNumberSeries {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the N value : ");
		int N = scanner.nextInt();
		
		System.out.println("Even numbers up to "+N);
		for(int i=0;i<=N;i+=2)
			System.out.print(i+" ");
		
		scanner.close();
	}
}

/*
	OUTPUT
	Enter the N value : 25
	Even numbers up to 25
	0 2 4 6 8 10 12 14 16 18 20 22 24
	
	Enter the N value : 14
	Even numbers up to 14
	0 2 4 6 8 10 12 14 
*/