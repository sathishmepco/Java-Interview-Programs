package com.java.numbers;

/*
 * Find GCD of two numbers
 * GCD :: Greatest Common Divisor
 * The HCF or GCD of two numbers is the largest number 
 * that can divide both numbers without reminder.
 * 
 * Number a = 45 = 3 * 3 * 5
 * Number b = 75 = 3 * 5 * 5
 * GCD is = 3 * 5 = 15
 */

public class GCD {
	public static void main(String[] args) {
		int a = 10;
		int b = 55;
	
		// for this approach 
		//a should be bigger
		//b should be small
		if(a < b){
			int temp = a;
			a = b;
			b = temp;
		}
		
		while(b > 0){
			int temp = b;
			//as b is small get reminder of a and b
			b = a%b;
			a = temp;
		}
		System.out.println("GCD is 10 & 55 : "+a);
	}
}
/*
	OUTPUT
	GCD is 10 & 55 : 5
	GCD is 143 & 26 : 13
	GCD is 7 & 29 : 1
	GCD is 45 & 75 : 15
*/