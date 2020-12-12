package com.java.strings;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Check 2 strings are Anagram to each other or NOT
 * ------------------------------------------------
 * Anagram ::
 * -----------
 * Two Strings are called as Anagrams if they contain same set of 
 * characters but in different order
 * 
 * Say String 1 : keep
 * Say String 2 : peek
 * String 1 & 2 are Anagrams
 * String 2 have same set of characters but in different order
 * 
 * Other examples are
 * listen === silent
 * triangle === integral
 * 
 */
public class Anagram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String 1 :: ");
		String str1 = scanner.nextLine().trim();
		
		System.out.println("Enter the String 2 :: ");
		String str2 = scanner.nextLine().trim();
		
		if( bestApproach(str1, str2) )
			System.out.println("Both strings are Anagrams.");
		else
			System.out.println("Both strings are NOT Anagrams.");
		scanner.close();
	}
	
	private static boolean bestApproach(String str1, String str2){
		//remove the white spaces in the strings
		str1 = str1.replaceAll("\\s", "");
		str2 = str2.replaceAll("\\s", "");
		
		//check both strings have the same length
		if(str1.length() != str2.length())
			return false;

		//anagram means both strings having the same characters
		//so we can use XOR operator, a XOR a will be zero
		//so string1 chars XOR string 2 chars will be zero
		//else both strings are not anagram
		int value = 0;
		for(int i=0;i<str1.length();i++){
			value = value ^ (int)str1.charAt(i);
			value = value ^ (int)str2.charAt(i);
		}
		return value == 0 ? true : false;
	}
	
	private static boolean checkAnagrams(String str1, String str2){
		//remove the white spaces in the strings
		str1 = str1.replaceAll("\\s", "");
		str2 = str2.replaceAll("\\s", "");
		
		//check both strings have the same length
		if(str1.length() != str2.length())
			return false;
		
		//convert string to character array
		char[] array1 = str1.toCharArray();
		char[] array2 = str2.toCharArray();
		
		//sort the character array, it will be easy for comparison
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		//now compare both character array
		if(Arrays.equals(array1, array2))
			return true;
		return false;
	}
}
/*
	OUTPUT

	Enter the String 1 :: keep
	Enter the String 2 :: peek
	Both strings are Anagrams.
	
	Enter the String 1 :: mother in law
	Enter the String 2 :: hitler woman
	Both strings are Anagrams.

	Enter the String 1 :: listen
	Enter the String 2 :: silent
	Both strings are Anagrams.
	
	Enter the String 1 :: triangle
	Enter the String 2 :: integral
	Both strings are Anagrams.
	
*/