package com.java.convertor;

import java.util.Scanner;

public class DecimalToBinary {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the decimal value : ");
		String input = scanner.nextLine();
		int decimal = Integer.parseInt(input);
		long binary = 0;
		int i = 0;
		
		while (decimal > 0){
			int reminder = decimal %2;
			decimal = decimal / 2;
			binary += ( reminder * Math.pow(10, i));
			i++;
		}
		System.out.println("Binary value is : "+binary);
	}
}