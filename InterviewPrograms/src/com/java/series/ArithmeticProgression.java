package com.java.series;

import java.util.Scanner;

/*
 *  Arithmetic Progression
 *  -----------------------
 *  In mathematics, an arithmetic progression (AP) 
 *  or arithmetic sequence is a sequence of 
 *  numbers such that the difference between the 
 *  consecutive terms is constant. Difference means 
 *  the second minus the first.
 *  
 * 	Arithmetic Progression Formula 
 *  current_valuie = previous_value + common_ratio
 *  Ai = A(i-1) + d or
 *  Ai = startValue + (N-1) * d
 *  
 *  For the series
 *  0 5 10 15 20 25 30 35 ....
 *  start value is 0 
 *  common ration is 5
 *  
 *  1 = 0 	+ 5 = 5  
 *  3 = 5 	+ 5 = 10
 *  4 = 10 	+ 5 = 15
 *  5 = 15 	+ 5 = 20
 *  6 = 20 	+ 5 = 25
 *  7 = 25 	+ 5 = 30
 *  8 = 30  + 5 = 35
 *  9 = 35  + 5 = 40
 *  10 = 40 + 5 = 45
 *  11 = 45 + 5 = 50
 */

public class ArithmeticProgression {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the start value of the series : ");
		int a = scanner.nextInt();
		System.out.println("Enter the common ratio : ");
		int d = scanner.nextInt();
		System.out.println("Enter the value (N) for the series : ");
		int N = scanner.nextInt();
	
		//printing the first value
		System.out.print(a+" ");
		for(int i=1;i<=N;i++){
			//current a will denote the previous value
			a = a + d;
			//new value a is calculated for the i-th iteration
			System.out.print(a+" ");
		}
		
		scanner.close();
	}
}
/*
	TEST CASE 1
	Enter the start value of the series : 0
	Enter the common ratio : 5
	Enter the value (N) for the series : 10
	OUTPUT :: 0 5 10 15 20 25 30 35 40 45 50   
	
	TEST CASE 2
	Enter the start value of the series : 7
	Enter the common ratio : 4
	Enter the value (N) for the series : 10
	OUTPUT :: 7 11 15 19 23 27 31 35 39 43 47    
*/