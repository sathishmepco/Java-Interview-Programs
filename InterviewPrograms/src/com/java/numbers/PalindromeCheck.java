package com.java.numbers;

/*
 * Palindrome Check
 * 
 * Check the given number is Palinndrome Number or NOT
 * 
 * A palindrome number is a number that remains the same when 
 * its digits are reversed.
 * 
 * Say N = 16461
 * reverse of N = 16461
 * N and reverse of N are same
 * So 16461 is Palindrome number
 * 
 * Other examples are
 * 12321, 1001, 10101
 * 
 * NOT a Palindrome
 * 100, 123, 2020
 * 
 */
public class PalindromeCheck {
	public static void main(String[] args) {
		int N = 12345;
		String reverse = "";
		
		int temp = N;
		while(temp > 0){
			int d = temp % 10;
			temp = temp/10;
			reverse =  reverse + d; 
		}
		int reverseN = Integer.parseInt(reverse);
		if(N == reverseN)
			System.out.println(N+" is a Palindrome Number");
		else
			System.out.println(N+" is NOT a Palindrome Number");		
	}
}
/*
	OUTPUT
	16461 is a Palindrome Number
	
	OUTPUT
	12321 is a Palindrome Number

	OUTPTU
	12345 is NOT a Palindrome Number
*/