package com.java.convertor;

/*
 * Decimal To Hexadecimal Conversion
 * -------------------------------
 * 
 * Hexadecimal::
 * In mathematics and computing, the hexadecimal 
 * (also base 16 or hex) numeral system is a 
 * positional numeral system that represents numbers 
 * using a radix (base) of 16.
 * 
 * Unlike the common way of representing numbers 
 * using 10 symbols, hexadecimal uses 16 distinct symbols, 
 * most often the symbols "0"–"9" to represent 
 * values 0 to 9, and "A"–"F" (or alternatively "a"–"f") 
 * to represent values 10 to 15.
 * 
 * Steps
 * ------
 * - get the input (decimal value) from user
 * - get the remainder by divide the decimal by 16
 * - fetch the corresponding hex value for the reminder
 * - add the hex value to output variable
 * - divide the decimal by 16
 * - continue above steps until decimal is greater than 0
 * - finally print the output variable as hexadecimal value
 * 
 * say decimal is 1997
 * 
 * Division	 	Quotient	Remainder	Remainder
	by 16				 	(decimal) 	 (hex)
	1997/16		124				13			D	
	124/16		7				12			C
	7/16		0				7			7
 * 	Decimal(1997) = Hex(7CD)
 * 
 * 
 * say decimal is 7562
 * 
 * Division	 	Quotient	Remainder	Remainder
	by 16				 	(decimal) 	 (hex)
	7562/16		472				10			A	
	472/16		29				8			8
	29/16		1				13			D
	1/16		0				1			1
 * 	Decimal(7562) = Hex(1D8A)
 * 
 */

public class DecimalToHexadecimal {
	private static char hexaValue[] = {'0','1','2','3','4'
			,'5','6','7','8','9','A','B','C','D','E','F'};
	
	public static void main(String[] args) {
//		int decimal = 1024;
//		int decimal = 1997;
//		int decimal = 15;
		int decimal = 11259375;
		StringBuilder hex = new StringBuilder();
		
		System.out.println("Decimal Value is :"+decimal);
		while(decimal > 0){
			int remainder = decimal % 16;
			char hexChar = hexaValue[remainder];
			hex.append(hexChar);
			decimal /= 16;
		}
		System.out.println("Hexadecimal Value is :"+hex.reverse());
	}
}

/*
	OUTPUT
	Decimal Value is :1024
	Hexadecimal Value is :400

	Decimal Value is :1997
	Hexadecimal Value is :7CD
	
	Decimal Value is :15
	Hexadecimal Value is :F
	
	Decimal Value is :11259375
	Hexadecimal Value is :ABCDEF
*/