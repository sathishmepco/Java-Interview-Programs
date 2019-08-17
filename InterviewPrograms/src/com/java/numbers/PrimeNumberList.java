package com.java.numbers;

import java.util.Scanner;

/*
 * This program will does the prime number check between the stand and end range
 * say start is 5 and end is 10
 * 5 is a Prime Number
 * 6 is NOT a Prime Number
 * 7 is a Prime Number
 * 8 is NOT a Prime Number
 * 9 is NOT a Prime Number
 * 10 is NOT a Prime Number
 */
public class PrimeNumberList {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the start value of the range ::");
		int start = Integer.parseInt(scanner.nextLine().trim());
		System.out.println("Enter the end value of the range ::");
		int end = Integer.parseInt(scanner.nextLine().trim());
		
		for(int i = start; i<=end; i++){
			if(checkPrimeNumber(i))
				System.out.println(i+" is a Prime Number");
			else
				System.out.println(i+" is NOT a Prime Number");
		}
		scanner.close();
	}
	
	private static boolean checkPrimeNumber(int number){
		if(number <= 1)
			return false;
		int length = number / 2;

		for(int i=2;i<length;i++)
			if(number % i ==0)
				return false;
		return true;
	}
}
/*

OUTPUT - Test Case 1

Enter the start value of the range :: 100
Enter the end value of the range :: 110
100 is NOT a Prime Number
101 is a Prime Number
102 is NOT a Prime Number
103 is a Prime Number
104 is NOT a Prime Number
105 is NOT a Prime Number
106 is NOT a Prime Number
107 is a Prime Number
108 is NOT a Prime Number
109 is a Prime Number
110 is NOT a Prime Number

OUTPUT - Test Case 2

Enter the start value of the range :: 500
Enter the end value of the range :: 510
500 is NOT a Prime Number
501 is NOT a Prime Number
502 is NOT a Prime Number
503 is a Prime Number
504 is NOT a Prime Number
505 is NOT a Prime Number
506 is NOT a Prime Number
507 is NOT a Prime Number
508 is NOT a Prime Number
509 is a Prime Number
510 is NOT a Prime Number

*/