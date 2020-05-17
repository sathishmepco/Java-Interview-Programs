package com.java.patterns;
import java.util.Scanner;
/*
Write the program to print the following pattern
A A A A A
B B B B B
C C C C C
D D D D D
E E E E E
*/
public class Pattern51 {
	public static void main(String args[] ) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.nextLine());
		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(int i=0;i<N;i++){
			for(int j=0;j<5;j++)
				if(j == 0)
					System.out.print(s.charAt(i));
				else
					System.out.print(" "+s.charAt(i));
			if(i != 0)
				System.out.println();
		}
		scanner.close();
	}
}
/*
Input
5
Output
A A A A A
B B B B B
C C C C C
D D D D D
E E E E E
*/
