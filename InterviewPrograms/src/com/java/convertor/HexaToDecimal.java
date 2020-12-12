package com.java.convertor;

/*
 * Hexadecimal To Decimal Conversion
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
 * -----
 * - get input (hexadecimal) from the user
 * - create a variable, lets say pow (default value is 0)
 * - create a variable, lets say decimal (default value is 0)
 * - get the last digit of the hex number
 * - get the corresponding numeric value
 * - because hexadecimal digits contains alphabets also
 * 	{0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F}
 * - multiply the numeric value with power of 16 to pow variable
 * - add the above result with decimal variable
 * - increment the pow variable
 * - continue all the above steps for all the digits of hex
 * - read the digits from the reverse direction
 * 
 * say hex = 153
 * decimal = 1 * 16^2 + 5 * 16^1 + 3 * 16^0
 * decimal = 1 * 256 + 5 * 16 + 3 * 1
 * decimal = 256 + 80 + 3
 * decimal = 339
 * 
 * say hex = FAD
 * decimal = F * 16^2 + A * 16^1 + D * 16^0
 * decimal = 15*256 + 10*16 + 13*1
 * decimal = 3840 + 160 + 13
 * decimal = 4013
 */

public class HexaToDecimal {
	public static void main(String[] args) {
		String hex = "35432";
//		String hex = "153";
//		String hex = "A0";
//		String hex = "FAD";
		 
		int decimal = 0;
		int pow = 0;
		
		for(int i=hex.length()-1;i>=0;i--){
			char unitChar = hex.charAt(i);
			int unitDigitValue = numericValue(unitChar);
			decimal = (int) (decimal + unitDigitValue*Math.pow(16, pow));
			pow++;
		}
		
		System.out.println("Hexadecimal Value is :"+hex);
		System.out.println("Decimal Value :"+decimal);
	}
	
	private static int numericValue(char c){
		//hexa digit may contain alphabet also
		//so we need to it to the corresponding numeric value
		switch (c) {
		case '0':
			return 0;
		case '1':
			return 1;
		case '2':
			return 2;
		case '3':
			return 3;
		case '4':
			return 4;
		case '5':
			return 5;
		case '6':
			return 6;
		case '7':
			return 7;
		case '8':
			return 8;
		case '9':
			return 9;
		case 'a':
		case 'A':
			return 10;
		case 'b':
		case 'B':
			return 11;
		case 'c':
		case 'C':
			return 12;
		case 'd':
		case 'D':
			return 13;
		case 'e':
		case 'E':
			return 14;
		case 'f':
		case 'F':
			return 15;
		default:
			return 0;
		}
	}
}
/*
	OUTPUT
	Hexadecimal Value is :35432
	Decimal Value :218162

	Hexadecimal Value is :A0
	Decimal Value :160
	
	Hexadecimal Value is :153
	Decimal Value :339

	Hexadecimal Value is :FAD
	Decimal Value :4013
*/