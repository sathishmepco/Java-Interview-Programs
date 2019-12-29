package com.java.numbers;

/*
 * 	LCM - Least Common Multiple
 * 
 * The LCM of two integers is the smallest
 * positive integer that is perfectly divisible 
 * by both the numbers without a reminder.
 * (means reminder should be zero)
 * 
 * say n1 = 12 and n2 = 15
 * 12 & 15 can divide 60, 120, 180 ...
 * but the smallest number is 60
 * LCM of 12 & 15 is 60
 * 
 * steps
 * 1. get the minimum of n1 & n2
 * 2. assume the maximum is LCM
 * 3. increment the lcm upto both n1 & n2
 * perfectly divides the LCM.
 *
 * n1 = 10 and n2 = 6
 * 10 and 6 can divide 30, 60, 90 ...
 * but the smallest number is 30
 * LCM of 10 & 6 is 30
 * 
 */
public class LCM {
	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		
		int lcm = (a > b) ? a : b;
		
		while(true){
			if(lcm % a == 0 && lcm % b == 0){
				System.out.println("LCM of "+a+" & "+b+" is "+lcm);
				break;
			}
			lcm++;
		}
	}
}
/*
	OUTPUT
	
	LCM of 12 & 15 is 60
	LCM of 10 & 6 is 30
	LCM of 10 & 5 is 10
	LCM of 5 & 7 is 35
*/