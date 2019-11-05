package com.java.strings;

import java.util.Scanner;

public class CombinationOfString {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any String : ");
		String s = scanner.nextLine().trim();
		combination("", s);
		scanner.close();
	}
	
	public static void combination(String c,String s){
		if(s.length() >0)
			System.out.println(c+s.charAt(0));
		combination(c+s.charAt(0), s.substring(1));
		combination(c, s.substring(1));
	}

}
