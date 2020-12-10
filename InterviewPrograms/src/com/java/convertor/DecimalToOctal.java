package com.java.convertor;

/*
 * Decimal to Octal Converter
 * ---------------------------
 * Octal Number System
 * The octal numeral system, or oct for short, 
 * is the base-8 number system, and uses 
 * the digits 0 to 7. Octal numerals can be 
 * made from binary numerals by grouping 
 * consecutive binary digits into groups 
 * of three (starting from the right). 
 * In the octal system each place 
 * is a power of eight.
 *
 * Decimal Number System
 * Decimal number system, in mathematics, 
 * positional numeral system employing 10 as 
 * the base and requiring 10 different numerals, 
 * the digits 0, 1, 2, 3, 4, 5, 6, 7, 8, 9. 
 * It also requires a dot (decimal point) to 
 * represent decimal fractions.
 *
 * Steps:
 * 1. Divide the decimal by 8 and get
 * reminder
 * 2. store the reminder in an array
 * or use string to append the reminder
 * or use base 10 method to create int
 * 3. Update the decimal by divide it by 8.
 * 
 * Given decimal is 57 (divide by 8)
 * decimal 		reminder		quotient
 *   57			  	1				7
 *   7			  	7				0
 *  
 *  Stop the iterations
 *  Octal number is = 71 
 *  (reminders from reverse order)	
 * 
 * Given decimal is 372 (divide by 8)
 * decimal 		reminder		quotient
 *   372			4				46
 *   46			  	6				5
 *   5				5				0
 * Stop the iterations
 * Octal Value is = 564
 * (reminders from reverse order)					
 * 
 */

public class DecimalToOctal {
	public static void main(String[] args) {
		int decimal = 372;
		System.out.println("Decimal Value is : "+decimal);
		int octal = 0;
		int power = 0;
		while(decimal > 0){
			int r = decimal % 8;
			octal += r * Math.pow(10, power);
			decimal = decimal / 8;
			power++;
		}
		System.out.println("Octal Value is : "+octal);
	}
}
/*
	OUTPUT
	
	Decimal Value is : 57
	Octal Value is : 71
	
	Decimal Value is : 8
	Octal Value is : 10

	Decimal Value is : 16
	Octal Value is : 20

	Decimal Value is : 45
	Octal Value is : 55

	Decimal Value is : 372
	Octal Value is : 564
*/