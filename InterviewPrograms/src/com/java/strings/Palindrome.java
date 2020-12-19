package com.java.strings;

/*
 * Palindrome Check
 * -----------------
 * A String is a palindrome,
 * if it is remain unchanged even when it is reversed.
 * 
 * A String is a palindrome,
 * if it equals to the reverse of the string
 *  
 * example words are :: 
 * malayalam, radar, madam, civic, level, racecar, refer
 */

public class Palindrome {
	public static void main(String[] args) {
		String word = "malayalam";
//		String word = "radar";
//		String word = "madam";
//		String word = "sathish";
//		String word = "java";

		System.out.println("The Given String \""+word+"\"");
		if( checkPalindrome(word) )
			System.out.println("Yes, it is a Palindrome");
		else
			System.out.println("No, it is NOT a Palindrome");
	}
	
	private static boolean checkPalindrome(String str){
		int strLen = str.length();

		//The logic is compare 1st char with last char (nth char)
		//Then compare 2nd char with (n-1) char
		//here index starts with 0, so compare index 0 with index (n-1)
		//then compare index 1 with index (n-2)
		//do this comparison for half of the string,
		//if is palindrome 2nd half the string is mirror(reverse) of the 1st half 
		for(int i=0; i < str.length()/2; i++)
			if(str.charAt(i) != str.charAt(strLen-i-1))
				return false;
		return true;
	}
}
/*

	OUTPUT
	
	The Given String "malayalam"
	Yes, it is a Palindrome
	
	The Given String "radar"
	Yes, it is a Palindrome

	The Given String "madam"
	Yes, it is a Palindrome
	
	The Given String "sathish"
	No, it is NOT a Palindrome

	The Given String "java"
	No, it is NOT a Palindrome
*/