package com.java.convertor;

/*
 * 	Octal To Binary
 * -----------------
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
 * Binary Number System
 * A binary number is a number expressed 
 * in the base-2 numeral system or binary 
 * numeral system, which uses only two 
 * symbols: typically "0" (zero) and "1" 
 * (one). The base-2 numeral system is a 
 * positional notation with a radix of 2. 
 * Each digit is referred to as a bit.
 * 
 * Octal 	Binary		Binary
 *   1		  001		1
 *   2		  010		10
 *   3		  011		11
 *   4		  100		100
 *   5		  101		101
 *   6		  110		110
 *   7		  111		111
 *   10		 001 000	1000
 *   11		 001 001	1001
 *   12		 001 010	1010
 *   13		 001 011	1011
 *   14		 001 100	1100
 *   15		 001 101	1101
 *   16		 001 110	1110
 *   17		 001 111	1111
 *   20		 010 000	10000
 *   
 *   Conversion Method
 *   
 *   Octal number - 12
 *   1		2
 *   001	010
 *   Binary Number - 1010
 *    
 *   Octal Number - 753
 *   7		5		3
 *   111	101		011
 *   Binary Number - 111101011
 *   
 */

public class OctalToBinary {
	public static void main(String[] args) {
		int octal = 20;
		long binary = 0;
		long base = 1;
		
		System.out.println("Given Octal Number is : "+octal);
		while(octal > 0){
			int r = octal % 10;
			binary = binary + base * octalToBinary(r);
			octal = octal / 10;
			base = base * 1000;
		}
		System.out.println("Binary Value is : "+binary);
	}
	public static int octalToBinary(int oneDigit){
		int binary = 0;
		int power = 0;
		while(oneDigit > 0){
			int r = oneDigit % 2;
			binary = (int) (binary + r * Math.pow(10, power)); 
			oneDigit = oneDigit / 2;
			power++;
		}
		return binary;
	}
}
/*
	OUTPUT
	Given Octal Number is : 70
	Binary Value is : 111000

	Given Octal Number is : 12
	Binary Value is : 1010

	Given Octal Number is : 20
	Binary Value is : 10000
*/