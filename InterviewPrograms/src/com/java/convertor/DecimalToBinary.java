package com.java.convertor;

import java.util.Scanner;

/*
 * 	Decimal To Binary
 * --------------------
 * Write a Java Program to convert Decimal
 * value to Binary Value
 * 
 * say Given Number is 5
 * binary value is 101
 * 
 * say Given Number is 6
 * binary value is 110
 * 
 * say Given Number is 7
 * binary value is 111
 * 
 * Steps:
 * 1. divide the decimal and get reminder
 * 2. multiply the reminder by 10 power i(i=0)
 * 3. update the decimal by divide by 2
 * 4. divide the decimal and get reminder
 * 5. increment the power value by 1
 * 6. multiply the reminder by 10 power i(i=1)
 * 6. sum the multiplication result
 * 7. continue the steps upto n > 0
 * 
 * given number is n = 5
 * divide (n=5) by 2 and reminder is 1
 * multiply the reminder 1 by 10^i (i=0)
 * sum = sum + 1; (sum = 1)
 * update 5 = n = 5/2 = 2
 *  
 *  divide (n=2) by 2 and reminder is 0
 *  multiply the reminder 0 by 10^i (i=1)
 *  sum = sum + 0; (sum = 1)
 *  update 2 = n = 2/2 = 1
 *
 *  divide (n=1) by 2 and reminder is 1
 *  multiply the reminder 2 by 10^i (i=2)
 *  sum = sum + 4; (sum = 101)
 *  update 2 = n = 0/2 = 0
 *  
 *  now n is 0, so stop the iteration
 *  finally binary value is 101
 */
 
public class DecimalToBinary {	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the decimal value : ");
		int decimal = scanner.nextInt();
		long binary = 0;
		int i = 0;
		
		while (decimal > 0){
			int reminder = decimal %2;
			decimal = decimal / 2;
			binary += ( reminder * Math.pow(10, i));
			i++;
		}
		System.out.println("Binary value is : "+binary);
		
		scanner.close();
	}
}
/*
	OUTPUT
	Enter the decimal value : 31
	Binary value is : 11111
	
	Enter the decimal value : 32
	Binary value is : 100000
	
	Enter the decimal value : 7
	Binary value is : 111
*/