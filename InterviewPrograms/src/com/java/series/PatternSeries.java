package com.java.series;

import java.util.Scanner;
/*
 * Write the program to print the following series
 * 
 * 3 33 333 3333 33333 333333 .....
 * 
 * Best approach
 * Use String variable and starts with 3, 
 * and append 3 for every iteration
 * 
 */

public class PatternSeries {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the N value for the series : ");
		int N = scanner.nextInt();
		
		int baseValue = 3;
		int result = 0;
		for(int i=0;i<N;i++){
			result = result + baseValue * (int)Math.pow(10, i);
			System.out.print(result+" ");
		}
		
		System.out.print("\nUsing String approach: ");
		//Alternate approach
		String s = "";
		for(int i=0;i<N;i++){
			s += "3";
			System.out.print(s+" ");
		}
		
		scanner.close();
	}
}
/*
	OUTPUT
	Enter the N value for the series : 5
	3 33 333 3333 33333
	Using String approach:
	3 33 333 3333 33333
	
	Enter the N value for the series : 10
	3 33 333 3333 33333 333333 3333333 33333333 333333333 -961633963
	Using String approach: 
	3 33 333 3333 33333 333333 3333333 33333333 333333333 3333333333 
*/