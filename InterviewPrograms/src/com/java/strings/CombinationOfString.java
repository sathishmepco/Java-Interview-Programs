package com.java.strings;

import java.util.Scanner;

/*
 * Combination
 * ------------
 * 
 * A combination is a selection of all or part of 
 * a set of objects, without regard to the order in 
 * which objects are selected.
 *
 * For example, suppose we have a set of 
 * three letters: A, B, and C. We might ask how many ways 
 * we can select 2 letters from that set. 
 * Each possible selection would be an example of a combination. 
 * The complete list of possible selections 
 * would be: AB, AC, and BC.
 * 
 * When the order doesn't matter, it is a Combination.
 * When the order does matter it is a Permutation.
 * 
 * Order does matter
		1 2 3
		1 3 2
		2 1 3
		2 3 1		
		3 1 2
		3 2 1	

 */

public class CombinationOfString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any String : ");
		String s = scanner.nextLine().trim();
		System.out.println("All Combinations are :: ");
		combination("", s,0);
		scanner.close();
	}
	
	public static void combination(String c,String s,int curIndex){
		for(int i=curIndex;i<s.length();i++){
			System.out.println(c+s.charAt(i));
			combination(c+s.charAt(i), s, i+1);
		}
	}
}
/*
	OUTPUT
	Enter any String : abc
	All Combinations are ::
	a
	ab
	abc
	ac
	b
	bc
	c
	
	Enter any String : 123
	All Combinations are :: 
	1
	12
	123
	13
	2
	23
	3
*/