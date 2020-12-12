package com.java.strings;

import java.util.Scanner;

/*
 * Find All Subsets using Bitwise Approach
 * ---------------------------------------
 * 
 * The subset of a string is the character 
 * or the group of characters that are present 
 * inside the string. 
 * All the possible subsets for a string 
 * will be 2^n (n is the no of characters). 
 * 
 * say Given String is "abc"
 * { }
 * { a }
 * { b }
 * { a b }
 * { c }
 * { a c }
 * { b c }
 * { a b c }
 * 
 * Using Bitwise Approach
 * every characters will be denoted by a bit
 * 
 * cba
 * 000		{ }	
 * 001		{ a }
 * 010		{ b }
 * 011		{ a b }
 * 100		{ c }
 * 101		{ a c }
 * 110		{ b c }
 * 111		{ a b c }
 *	
 */
public class AllSubsetsUsingBitwise {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any String : ");
		String str = scanner.nextLine().trim();
		printAllSubsets(str);
		scanner.close();
	}

	//using bitwise approach
	public static void printAllSubsets(String str) {
		char set[] = str.toCharArray();
		int n = set.length;
		for (int i = 0; i < (1 << n); i++) {
			System.out.print("{ ");
			for (int j = 0; j < n; j++){
				if ((i & (1 << j)) > 0)
					System.out.print(set[j] + " ");
			}
			System.out.println("}");
		}
	}
}
/*
	OUTPUT
	Enter any String : abcd
	{ }
	{ a }
	{ b }
	{ a b }
	{ c }
	{ a c }
	{ b c }
	{ a b c }
	{ d }
	{ a d }
	{ b d }
	{ a b d }
	{ c d }
	{ a c d }
	{ b c d }
	{ a b c d }

	Enter any String : one
	{ }
	{ o }
	{ n }
	{ o n }
	{ e }
	{ o e }
	{ n e }
	{ o n e }

*/