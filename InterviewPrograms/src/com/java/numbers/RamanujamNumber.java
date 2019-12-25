package com.java.numbers;

import java.util.Scanner;

/*
 * 	Ramanujam's Number
 * 
 * A number can be expressed as the sum of 
 * two positive number cubes in two different ways
 * 
 * 1729 = 1^3 + 12^3 = 10^3 + 9^3
 * 4104 = 16^3 + 2^3 = 15^3 + 9^3
 * 
 * Ramanujam's Number are
 * 1729 4104 13832 20683 32832
 * 
 */
public class RamanujamNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any positive integer : ");
		int n = Integer.parseInt(scanner.nextLine().trim());
		if(isRamanugamNumber(n))
			System.out.println("Given number "+n+" is a Ramanujam Number");
		else
			System.out.println("Given number is NOT a Ramanujam Number");
		scanner.close();
	}
	
	private static boolean isRamanugamNumber(int n){
		int a=0, b=0;
		int x=0, y=0;
		
		for(int i=1; i<=100; i++)
			for(int j=1; j<=100; j++){
				int temp = (i*i*i) + (j*j*j);
				if(temp == n){
					a = i;
					b = j;
					break;
				}
			}
		
		for(int i=1; i<=100; i++)
			for(int j=1; j<=100; j++){
				int temp = (i*i*i) + (j*j*j);
				if(temp == n && i != a){
					x = i;
					y = j;
					break;
				}
			}
				
		if(a != 0 && x != 0){
			String str = String.format("[%d,%d] and [%d,%d]", a,b,x,y);
			System.out.println(n+" can be expressed as "+str);
			return true;
		}
		return false;
	}
}
/*
	OUTPUT
	Enter any positive integer : 1729
	1729 can be expressed as [12,1] and [10,9]
	Given number 1729 is a Ramanujam Number
	
	Enter any positive integer : 4104
	4104 can be expressed as [16,2] and [15,9]
	Given number 4104 is a Ramanujam Number

	Enter any positive integer : 13832
	13832 can be expressed as [24,2] and [20,18]
	Given number 13832 is a Ramanujam Number
	
	Enter any positive integer : 1000
	Given number is NOT a Ramanujam Number

*/