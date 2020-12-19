package com.java.series;

import java.util.Scanner;

/*
 *  Geometric Progression
 *  ---------------------
 *  In mathematics, a geometric progression, also known 
 *  as a geometric sequence, is a sequence of numbers 
 *  where each term after the first is found by multiplying 
 *  the previous one by a fixed, non-zero number called 
 *  the common ratio. For example, 
 *  the sequence 2, 6, 18, 54, ... is a geometric progression 
 *  with common ratio 3.
 *  
 * 	Geometric Progression Formula 
 *  current_valuie = previous_value × common_ratio
 *  Ai = A(i-1) * r
 *  
 *  For the series
 *  2 4 8 16 32 64 128 256 512 1024 ......
 *  start value is 2 
 *  ration is 2
 *  
 *  2 = 2 	 * 2 = 4  
 *  3 = 4 	 * 2 = 8
 *  4 = 8 	 * 2 = 16
 *  5 = 16 	 * 2 = 32
 *  6 = 32 	 * 2 = 64
 *  7 = 64 	 * 2 = 128
 *  8 = 128  * 2 = 256
 *  9 = 256  * 2 = 512
 *  10 = 512 * 2 = 1024
 */

public class GeometricProgression {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the start value of the series : ");
		int a = scanner.nextInt();
		System.out.println("Enter the common ratio : ");
		int r = scanner.nextInt();
		System.out.println("Enter the value (N) for the series : ");
		int N = scanner.nextInt();
	
		//printing the first value
		System.out.print(a+" ");
		for(int i=1;i<=N;i++){
			//current a will denote the previous value
			a = a * r;
			//new value a is calculated for the i-th iteration
			System.out.print(a+" ");
		}
		
		scanner.close();
	}
}
/*
	TEST CASE 1
	Enter the start value of the series : 2
	Enter the common ratio : 2
	Enter the value (N) for the series : 10
	OUTPUT :: 2 4 8 16 32 64 128 256 512 1024 2048  
	
	TEST CASE 2
	Enter the start value of the series : 3
	Enter the common ratio : 2
	Enter the value (N) for the series : 10
	OUTPUT :: 3 6 12 24 48 96 192 384 768 1536 3072   
*/