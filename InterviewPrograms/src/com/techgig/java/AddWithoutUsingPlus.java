package com.techgig.java;

import java.util.Scanner;

public class AddWithoutUsingPlus {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = Integer.parseInt(scanner.nextLine().trim());
		int b = Integer.parseInt(scanner.nextLine().trim());

		while (b != 0) {
			int carry = a & b;
			a = a ^ b;
			b = carry << 1;
		}
		System.out.print(a);
	}
}