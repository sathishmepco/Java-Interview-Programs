package com.java.convertor;

/*
 * Octal To Decimal Conversion
 * ----------------------------
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
 * Steps
 * ------
 * - get input (hexadecimal) from the user
 * - create a variable, lets say pow (default value is 0)
 * - create a variable, lets say decimal (default value is 0)
 * - get the last digit of the octal number (last_digit = num%10)
 * - multiply the last digit with power of 8 to pow variable
 * - add the above result with decimal variable
 * - increment the pow variable
 * - continue all the above steps for all the digits of octal
 * 
 * say the octal is = 123
 * decimal = 1 * 8^2 + 2 * 8^1 + 3 * 8^0
 * decimal = 1 * 64 + 2 * 8 + 3 * 1
 * decimal = 64 + 16 + 3
 * decimal = 83
 * 
 * say the octal is = 144
 * decimal = 1 * 8^2 + 4 * 8^1 + 4 * 8^0
 * decimal = 1 * 64 + 4 * 8 + 4 * 1
 * decimal = 64 + 32 + 4
 * decimal = 100
 */

public class OctalToDecimal {
	public static void main(String[] args) {
//		int octal = 123;
//		int octal = 144;
		int octal = 1000;
		System.out.println("The Octal Number is : "+octal);
		int pow = 0;
		int decimal = 0;
		
		while(octal > 0){
			int unitDigit = octal % 10;
			decimal = (int) (decimal + (unitDigit*Math.pow(8, pow)));
			pow++;
			octal = octal / 10;
		}
		System.out.println("The Decimal Value is : "+decimal);
	}
}
/*
	OUTPUT

	The Octal Number is : 123
	The Decimal Value is : 83

	The Octal Number is : 144
	The Decimal Value is : 100
	
	The Octal Number is : 1000
	The Decimal Value is : 512
*/