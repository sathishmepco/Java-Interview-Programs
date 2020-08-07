package com.java.basic;

/*
 * Add two numbers a,b without using + operator
 * --------------------------------------------
 * Use bitwise operators instead of using + operator
 * bitwise and = &
 * XOR operator = ^
 * shift operator = <<
 *  
 */
public class AddWithoutPlus {
	public static void main(String[] args) {
		int a = 10;
		int b = 30;
		while(b != 0){
			int carry = a & b;
			a = a ^ b;
			b = carry << 1;
		}
		System.out.println("Sum of a and b is : "+a);
	}
}
/*
	INPUT
	a = 10
	b = 30
	OUTPUT
	Sum of a and b is : 40
*/