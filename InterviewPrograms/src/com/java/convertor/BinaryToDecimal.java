package com.java.convertor;

import java.util.Scanner;

/*
 *	Binary To Decimal
 * --------------------
 * Write a Java Program to convert Binary value
 * to Decimal value
 * 
 * say Given binary value is 111
 * corresponding decimal is 7
 * 
 * Steps:
 * given number n = 111
 * 1. get the reminder of n by 10 (r=1)
 * 2. multiply the reminder by power of 2
 * 3. sum the multiplied output
 * 4. update the n, divide n by 10
 * 5. increment the power value
 * 6. if n becomes 0, return sum as output
 * 7. else continue from step 1
 * till n reach 0
 * 
 * iteration 1 
 * n = 111, sum = 0, power = 0
 * reminder 1
 * r = r* 2^power = 1
 * sum = sum+r = 1
 * n =n/10 (n=11)
 * 
 * iteration 2
 * n=11, sum = 1, power 1
 * reminder 1
 * r = r* 2^power = 2
 * sum = sum+r = 3
 * n =n/10 (n=1)
 * 
 * iteration 3
 * n=1, sum = 3, power 2
 * reminder 1
 * r = r* 2^power = 4
 * sum = sum+r = 7
 * n =n/10 (n=0)
 * 
 * now n becomes 0, return the sum
 * decimal value is 7
 * 
 */
 
public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the binary number : ");
		int binary = scanner.nextInt();
		int decimal = 0;
		int digitCount = 0;
		
		while( binary > 0){
			int unitDigit = binary % 10;
			binary = binary / 10;
			decimal += (unitDigit * Math.pow(2, digitCount));
			digitCount++;
		}
		
		System.out.println("The decimal value is : "+decimal);
		scanner.close();
	}
}
/*
	OUTPUT
	Enter the binary number : 1000
	The decimal value is : 8

	Enter the binary number : 1010
	The decimal value is : 10
	
	Enter the binary number : 1110
	The decimal value is : 14
*/