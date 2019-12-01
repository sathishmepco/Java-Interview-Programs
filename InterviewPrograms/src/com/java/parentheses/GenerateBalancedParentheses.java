package com.java.parentheses;

import java.util.Scanner;

/*
 * Generate Balanced Parentheses
 * 
 * Given n pairs of parentheses
 * Write a java program to generate all combinations of 
 * well-formed or balanced parentheses
 * 
 * input 1
 * ()
 * 
 * input 2
 * ()()
 * (())
 * 
 */
public class GenerateBalancedParentheses {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		generateParentheses(0, 0, "",N);
		scanner.close();
	}
	
	public static void generateParentheses(int openCount,int closeCount,String parentheses,int N){
		if(closeCount == N){
			System.out.println(parentheses);
			return;
		}
		if(openCount < N)
			generateParentheses(openCount+1, closeCount, parentheses+"(",N);
		if(openCount > closeCount)
			generateParentheses(openCount, closeCount+1, parentheses+")",N);
	}
}
/*
	INPUT
	 3
	
	OUTPUT
	((()))
	(()())
	(())()
	()(())
	()()()
	
	INPUT
	4
	
	OUTPUT
	(((())))
	((()()))
	((())())
	((()))()
	(()(()))
	(()()())
	(()())()
	(())(())
	(())()()
	()((()))
	()(()())
	()(())()
	()()(())
	()()()()
*/