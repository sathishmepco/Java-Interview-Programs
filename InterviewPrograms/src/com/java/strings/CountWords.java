package com.java.strings;

import java.util.Scanner;

/*
 * Count the number of Words
 *
 * Write the java program to count the number of
 * words in the given string without string functions
 * 
 * Count the number of white spaces " "
 * say Given String : java programming
 * no of words : 2
 * say Given String : code
 * no of words : 1
 *  
 */
public class CountWords {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any String : ");
		String str = scanner.nextLine().trim();
		System.out.println("Number of words : "+countWords(str));
		scanner.close();
	}
	
	private static int countWords(String str){
		int count = 0;
		boolean isWord = false;
		for(int i=0;i<str.length();i++){
			String ch = str.charAt(i)+"";
			if(ch.equals(" ")){
				count++;
				isWord = false;
				//this while loop removes continuous
				//white spaces
				while(ch.equals(" ")){
					ch = str.charAt(i++)+"";
				}
			}else{
				isWord = true;
			}
		}
		if(isWord == true)
			count++;
		return count;
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