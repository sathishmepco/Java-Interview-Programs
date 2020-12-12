package com.java.strings;

import java.util.Scanner;

/*
 * Find All Subsets using Recursion approach
 * -----------------------------------------
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
 * { a b }
 * { a b c }
 * { a c }
 * { b }
 * { b c }
 * { c }
 *	
 */

public class AllSubsetsUsingRecursion {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any String : ");
		String str = scanner.nextLine().trim();
		printAllSubsets(str);
		scanner.close();
	}
	//using recursion approach
	public static void printAllSubsets(String str) {
		char array[] =str.toCharArray();
		int visited[] = new int[array.length];
		traverse(array, visited,0);
	}
	public static void traverse(char array[],int visited[],int curIndex){
		System.out.print("\n{ ");
		for(int i=0;i<visited.length;i++)
			if(visited[i] == 1)
				System.out.print(array[i]+" ");
		System.out.print("}");
		
		for(int j=curIndex;j<array.length;j++){
			visited[j] = 1;
			traverse(array, visited,j+1);
			visited[j] = 0;
		}
	}	
}
/*
	OUTPUT
	Enter any String : abc
	{ }
	{ a }
	{ a b }
	{ a b c }
	{ a c }
	{ b }
	{ b c }
	{ c }
	
	Enter any String : four
	{ }
	{ f }
	{ f o }
	{ f o u }
	{ f o u r }
	{ f o r }
	{ f u }
	{ f u r }
	{ f r }
	{ o }
	{ o u }
	{ o u r }
	{ o r }
	{ u }
	{ u r }
	{ r }
*/