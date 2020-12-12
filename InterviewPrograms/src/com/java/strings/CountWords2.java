package com.java.strings;

import java.util.Scanner;

/*
 * Count the number of Words using split method
 * ---------------------------------------------
 * Write the java program to count the number of
 * words in the given string using split method
 * 
 * string.split("\\s");
 * The above method returns the no of words
 * 
 * say Given String : java programming
 * no of words : 2
 * say Given String : code
 * no of words : 1
 *  
 */

public class CountWords2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any String : ");
		String str = scanner.nextLine().trim();
		
		String words[] = str.split("\\s");
		int wordCount = words.length;
		
		System.out.println("Number of words : "+wordCount);
		scanner.close();
	}
}
/*
	OUTPUT
	Enter any String : java programming
	Number of words : 2
	
	Enter any String : 123 123
	Number of words : 2
		
	Enter any String : code
	Number of words : 1

	Enter any String : I am a good coder
	Number of words : 5
*/