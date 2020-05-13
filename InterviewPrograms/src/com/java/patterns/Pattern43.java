package com.java.patterns;
import java.util.Scanner;
/*
Write the program to print the following pattern
* * * * *
* * * *
* * *
* *
*
*/
public class Pattern43 {
	public static void main(String args[] ) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.nextLine());
		for(int i=0;i<N;i++){
			for(int j=0;j<N-i;j++)
				if(j == 0)
					System.out.print("*");
				else
					System.out.print(" *");
			if(i != N-1)
				System.out.println();
		}
		scanner.close();
	}
}
/*
Input
5
Output
* * * * *
* * * *
* * *
* *
*
*/