package com.java.patterns;

import java.util.Scanner;

/*
Write a Java Program to print the following Pattern
5 5 5 5 5 5 5 5 5
  4 4 4 4 4 4 4
    3 3 3 3 3
      2 2 2
        1
 */
public class Pattern10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows to print the pattern :: ");
		int N = Integer.parseInt(scanner.nextLine().trim());
        for(int i=N;i>=1;i--){
            for(int j=0;j<2*(N-i);j++)
                System.out.print(" ");
            for(int j=0;j<(2*i)-1;j++)
                if( j == 0)
                    System.out.print("*");
                else
                    System.out.print(" *");
            if(i > 1 )
                System.out.println();
        }
		scanner.close();
	}
}
/*
OUTPUT
Enter the number of rows to print the pattern :: 5
5 5 5 5 5 5 5 5 5
  4 4 4 4 4 4 4
    3 3 3 3 3
      2 2 2
        1
*/