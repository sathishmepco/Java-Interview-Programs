package com.java.basic;

import java.util.Scanner;
import java.util.TreeSet;

/*
 * Divisors of N
 * -------------
 * 
 * This program finds all the divisors of the
 * Given number N
 *	
 * say  Given Number is 45, Divisors are
 * [1, 3, 5, 9, 15, 45] 
 * 
 * say  Given Number is 60, Divisors are
 * [1, 2, 3, 4, 5, 6, 10, 12, 15, 20, 30, 60]
 *
 */

public class Divisors {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the N value : ");
		int N = scanner.nextInt();
		
		TreeSet<Integer> divisors = new TreeSet<>();
		for(int i=1;i<N;i++){
			int d = N % i;
			if(d == 0){
				//say n is 10
				//if 10 is divide by 2 
				//then it will be divide by 5
				//10%2 == 0 also 10/2 == 0 (5)
				divisors.add(i);
				divisors.add(N/i);
			}
			if(N/i <= i)
				break;
		}
		System.out.println("The divisors of "+N+" are : "+divisors.toString()				);
		System.out.println("Number of Divisors are : "+divisors.size());
		scanner.close();
	}
}
/*
	OUTPUT
	Enter the N value : 45
	The divisors of 45 are : 
	[1, 3, 5, 9, 15, 45]
	Number of Divisors are : 6

	OUTPUT
	Enter the N value : 60
	The divisors of 60 are : 
	[1, 2, 3, 4, 5, 6, 10, 12, 15, 20, 30, 60]
	Number of Divisors are : 12
*/