package com.java.strings;

import java.util.Scanner;

/*
 * Permutation
 * ------------
 * 
 * A permutation, also called an “arrangement number” 
 * or “order,” is a rearrangement of the elements of 
 * an ordered list S into a one-to-one correspondence 
 * with S itself. A string of length n has n! permutation.
 *
 * Permutation of String "abc" are
 * abc, acb, bac, bca, cab, cba
 * 
 */
public class PermutationOfString {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any String : ");
		String s = scanner.nextLine().trim();
		permutation("", s);
		scanner.close();
	}
	
	public static void permutation(String p,String s){
		if(s.length() == 0)
			System.out.println(p);
		for(int i=0; i < s.length(); i++){
			permutation(p+s.charAt(i), s.substring(0, i)+s.substring(i+1));
		}
	}
}
/*
	OUTPUT
	
	Enter any String : abc
	abc
	acb
	bac
	bca
	cab
	cba
	
	Enter any String : 1234
	1234
	1243
	1324
	1342
	1423
	1432
	2134
	2143
	2314
	2341
	2413
	2431
	3124
	3142
	3214
	3241
	3412
	3421
	4123
	4132
	4213
	4231
	4312
	4321
*/