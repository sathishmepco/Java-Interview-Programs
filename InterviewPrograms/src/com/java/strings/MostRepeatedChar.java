package com.java.strings;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/*
 * 	Most Repeated Character
 * ------------------------
 * Write a Java Program to find Most repeated character.
 * 
 * solution:
 * Use Hashmap to store the occurrences of the
 * character.
 * say Given string : malayalam
 * m is occurred 2 times
 * a is occurred 4 times
 * l is occurred 2 times
 * y is occurred 1 time  
 * 
 * So "m" is the most repeated char
 * 
 */

public class MostRepeatedChar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any String : ");
		String str = scanner.nextLine().trim();
		
		HashMap<Character, Integer> charMap = new HashMap<>();
		
		for(Character c : str.toCharArray()){
			if(charMap.containsKey(c))
				charMap.put(c, charMap.get(c)+1);
			else
				charMap.put(c, 1);
		}
		
		int maxCount = 0 ;
		char mostRepeatedChar = 0;
		
		Set<Character> keySet = charMap.keySet();
		for(Character c : keySet){
			int value = charMap.get(c);
			if(maxCount < value){
				maxCount = value;
				mostRepeatedChar = c;
			}
		}

		System.out.println("Most Repeated Character is : "+mostRepeatedChar);
		System.out.println("Repeated count is : "+maxCount);
		scanner.close();
	}
}
/*
	OUTPUT
	Enter any String : malayalam
	Most Repeated Character is : a
	Repeated count is : 4

	Enter any String : java
	Most Repeated Character is : a
	Repeated count is : 2
*/