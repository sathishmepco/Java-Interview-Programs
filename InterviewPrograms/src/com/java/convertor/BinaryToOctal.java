package com.java.convertor;

/*
 * Binary to Octal
 * ----------------
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
 * Conversion Method
 * - Separate binary number into 3 digit binary
 * numbers
 * - convert 3 digit binary to decimal
 * - every 3 digit binary should be converted separately
 *   
 * 	 Binary Number - 101011
 *   101					011
 *   1*2^2 0*2^1 1*2^0		0*2^2 1*2^1 1*2^0
 *   4	+	0	 + 1		0	+	2	+	1		
 *   5						3
 *   Decimal Number - 53
 *    
 * 	 Binary Number - 110010
 *   110					010
 *   1*2^2 1*2^1 0*2^0		0*2^2 1*2^1 0*2^0
 *   4	+	2	 + 0		0	+	2	+	0		
 *   6						2
 *   Decimal Number - 62
 * 
 */
 
public class BinaryToOctal {
	public static void main(String[] args) {
		long binary = 101101101;
		int octal = 0;
		
		System.out.println("Binary Number is :"+binary);
		int power = 0;
		int octalPow = 0;
		int tempOctal = 0;
		while(binary > 0){
			int r = (int) (binary%10);
			tempOctal += r * Math.pow(2, power);
			binary = binary / 10;
			power++;
			
			if(power == 3){
				//reset all when complete 3 digits
				power = 0;
				tempOctal *= Math.pow(10, octalPow);
				octal += tempOctal;
				octalPow++;
				tempOctal = 0;
			}
		}
		
		System.out.println("Octal Number is :"+octal);
	}
	
}
/*
	OUTPUT
	Binary Number is : 101011
	Octal Number is : 53

	Binary Number is :110010
	Octal Number is :62

	Binary Number is : 101101101
	Octal Number is : 555
*/