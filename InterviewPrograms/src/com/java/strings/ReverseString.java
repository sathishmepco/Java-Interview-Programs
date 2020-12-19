package com.java.strings;

import java.util.Scanner;

/*
 * Reverse the String without using InBuild Functions
 * --------------------------------------------------
 * Say given String :: hello
 * Reversed String :: olleh
 * 
 * Say given String :: good
 * Reversed String :: doog
 * 
 * Steps::
 * -------
 * - get the input string from the user
 * - convert the string into char array
 * - initiate two pointer say 
 * i = 0, and j = length(string) - 1
 * - swap chars at ith and jth place
 * - then do i++, j--
 * - continue the above steps str_len / 2 times 
 *  
 */

public class ReverseString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String :: ");
		String str = scanner.nextLine();
		String reversedString = reverseString(str);
		System.out.println("Reversed String is :: "+reversedString);
		scanner.close();
	}
	
	public static String reverseString(String str){
		char[] charArray = str.toCharArray();
		int j = charArray.length-1;
		for(int i=0 ;i < charArray.length/2; i++, j--){
			char temp = charArray[i];
			charArray[i] = charArray[j];
			charArray[j] = temp;
		}
		return new String(charArray);
	}
}
/*
	OUTPUT
	Enter the String :: hello
	Reversed String is :: olleh
	
	Enter the String :: good
	Reversed String is :: doog
*/