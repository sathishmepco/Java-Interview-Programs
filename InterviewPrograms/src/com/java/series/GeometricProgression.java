package com.java.series;

import java.util.Scanner;

/*
 * 	Write Java program to generate the following Series
 *  Geometric Progression
 * 	2 4 8 16 32 64 128 256 512 1024 ......
 * 
 * 	Geometric Progression Formula 
 *  current_valuie = previous_value × common_ratio
 *  Ai = A(i-1) * r
 *  
 *  In the above series
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
		int a = Integer.parseInt(scanner.nextLine().trim());
		System.out.println("Enter the common ratio : ");
		int r = Integer.parseInt(scanner.nextLine().trim());
		System.out.println("Enter the value (N) for the series : ");
		int N = Integer.parseInt(scanner.nextLine().trim());
	
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
	2 4 8 16 32 64 128 256 512 1024 2048  
	
	TEST CASE 2
	Enter the start value of the series : 3
	Enter the common ratio : 2
	Enter the value (N) for the series : 10
	3 6 12 24 48 96 192 384 768 1536 3072   
*/