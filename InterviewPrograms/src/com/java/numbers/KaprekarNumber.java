package com.java.numbers;

import java.util.Scanner;

/*
 * Kaprekar Number
 * 
 * A Kaprekar number is a number whose square 
 * when divided into two parts and such that 
 * sum of parts is equal to the original number 
 * and none of the parts has value 0.
 * 
 * for example n = 45
 * square of 45 is = 2025
 * 2025 = 20 + 25 = 45
 * 
 * n	  Square	2 parts sum 
 * 9       81        8 + 1
 * 45      2025      20 + 25
 * 55      3025      30 + 25
 * 99      9801      98 + 01
 * 297     88209     88 + 209
 * 703     494209    494 + 209
 * 999     998001    998 + 001
 *       
 */
public class KaprekarNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any positive number :: ");
		int num = Integer.parseInt(scanner.nextLine().trim());
		
		scanner.close();
	}
	
	public static boolean isKaprekarNumber(int num){
		
	}
}
