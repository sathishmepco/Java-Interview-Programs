package com.java.numbers;

import java.util.Scanner;
/*
 * 		FIND THE SMALLEST WIHTOUT USING < AND > SYMBOL
 * 
 * 	Write a java program to find the smallest among a, b, c
 *  without using < AND > symbol.
 *  
 *  For comparing two numbers we need to use the relational operator.
 *  
 *  The alternate idea is to find the divisor of a / b,
 *  if result is 0 then a is small, else b is small
 *  
 *  Then apply same logic with the result like c / a or c / b
 *  
 */
public class FindTheSmallest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of a ::");
		int a = scanner.nextInt();
		System.out.println("Enter the value of b ::");
		int b = scanner.nextInt();
		System.out.println("Enter the value of c ::");
		int c = scanner.nextInt();
		int smallest = findTheSamllest(a, b, c);
		System.out.println("The smallest of a,b,c is :: "+smallest);
		scanner.close();
	}
	
	public static int findTheSamllest(int a,int b,int c){
		if( a/b == 0){
			//here a is smaller than b
			if( c/a == 0){
				//here c is smaller than a
				return c;
			}
			else{
				//here a is smaller than c
				return a;
			}
		}else{
			//here b is smaller a
			if( c/b == 0){
				//here c is smaller than b
				return c;
			}
			else{
				//here b is smaller than c
				return b;
			}
		}
	}
}
/*
	Enter the value of a :: 20
	Enter the value of b :: 10
	Enter the value of c :: 30
	The smallest of a,b,c is :: 10
	
	Enter the value of a :: 200
	Enter the value of b :: 100
	Enter the value of c :: 55
	The smallest of a,b,c is :: 55

	Enter the value of a :: 30
	Enter the value of b :: 50
	Enter the value of c :: 70
	The smallest of a,b,c is :: 30
*/