package com.java.basic;

/*
 * Print 1 to 10 without using loop
 * --------------------------------
 * 
 * Solution: 
 * Use recursion to print without using loop
 * 
 */
public class Print10WithoutLoop {
	public static void main(String[] args) {
		printWihtoutLoop(1);
	}
	
	public static void printWihtoutLoop(int n){
		if(n <= 10){
			System.out.println(n);
			printWihtoutLoop( n+1 );
		}
	}
}
/*
	OUTPUT
	1
	2
	3
	4
	5
	6
	7
	8
	9
	10
*/