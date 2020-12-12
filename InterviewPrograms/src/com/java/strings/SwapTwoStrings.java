package com.java.strings;

import java.util.Scanner;

/*
 * Swap Two Strings without using third variable
 * ---------------------------------------------
 * Say String1 is : good
 * Say String2 is : bad
 * The output should print string1 is bad and string2 is good
 * 
 */

public class SwapTwoStrings {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String 1 : ");
		String str1 = scanner.nextLine().trim();
		System.out.println("Enter the String 2 : ");
		String str2 = scanner.nextLine().trim();
		
		str1 = str1 + str2;
		str2 = str1.substring(0,str1.length()-str2.length());
		str1 = str1.substring(str2.length());
		
		System.out.println("After swapping ::");
		System.out.println("String 1 is : "+str1);
		System.out.println("String 2 is : "+str2);
		scanner.close();
	}
}
/*
	OUTPUT
	Enter the String 1 : good
	Enter the String 2 : bad
	After swapping::
	String 1 is : bad
	String 2 is : good
	
	Enter the String 1 : hello
	Enter the String 2 : world
	After swapping::
	String 1 is : world
	String 2 is : hello
*/