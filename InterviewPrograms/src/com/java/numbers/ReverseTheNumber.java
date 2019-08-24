package com.java.numbers;

import java.util.Scanner;

/*
 * Reverse The Number
 * Say the given number is 123
 * Reverse of the number is 321
 * 
 * Say the given number is 2019
 * Reverse of the number is 9102
 */
public class ReverseTheNumber {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any positive number :: ");
		int num = Integer.parseInt(scanner.nextLine().trim());
		
		int reversedNum = reverse(num);
		System.out.println("Reverse of the given number is : "+reversedNum);
		scanner.close();
	}
	
	public static int reverse(int num){
		int reversedNum = 0;
		while( num > 0){
			int unitDigit = num % 10;
			reversedNum = (reversedNum * 10) + unitDigit;
			num = num / 10;
		}
		return reversedNum;
	}

}
/*
	OUTPUT
	Enter any positive number :: 123
	Reverse of the given number is : 321

	Enter any positive number :: 2019
	Reverse of the given number is : 9102

*/