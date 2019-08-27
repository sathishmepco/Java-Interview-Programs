package com.java.strings;

import java.util.Scanner;

/*
 * Palindrome
 * A String is a palindrome if it is remain unchanged even when it is reversed.
 * A String is a palindrome if it equals to the reverse of the string 
 * example words are :: malayalam, radar, madam, civic, level, racecar, refer
 */
public class Palindrome {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any String to check Palindrome or not :: ");
		String str = scanner.nextLine().trim();
		
		if( checkPalindrome(str) )
			System.out.println("The Given String \""+str+"\" is a Palindrome");
		else
			System.out.println("The Given String \""+str+"\" is NOT a Palindrome");
	}
	
	private static boolean checkPalindrome(String str){
		int strLen = str.length();

		//The logic is compare 1st char with last char (nth char)
		//Then compare 2nd char with (n-1) char
		//here index starts with 0, so compare index 0 with index (n-1)
		//then compare index 1 with index (n-2)
		//do this comparison for half of the string,
		//if is palindrome 2nd half the string is mirror(reverse) of the 1st half 
		for(int i=0;i<str.length()/2;i++)
			if(str.charAt(i) != str.charAt(strLen-i-1))
				return false;
		return true;
	}
}
/*

	OUTPUT
	
	Enter any String to check Palindrome or not :: malayalam
	The Given String "malayalam" is a Palindrome
	
	Enter any String to check Palindrome or not :: radar
	The Given String "radar" is a Palindrome

	Enter any String to check Palindrome or not :: madam
	The Given String "madam" is a Palindrome
	
	Enter any String to check Palindrome or not :: sathish
	The Given String "sathish" is NOT a Palindrome
	
	Enter any String to check Palindrome or not :: java
	The Given String "java" is NOT a Palindrome

*/
