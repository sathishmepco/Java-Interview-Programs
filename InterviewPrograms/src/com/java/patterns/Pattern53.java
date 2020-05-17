package com.java.patterns;
import java.util.Scanner;
/*
Write the program to print the following pattern
A
B B
C C C
D D D D
E E E E E
*/
public class Pattern53 {
	public static void main(String args[] ) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.nextLine());
		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(int i=0;i<N;i++){
			for(int j=0;j<=i;j++)
				if(j == 0)
					System.out.print(s.charAt(i));
				else
					System.out.print(" "+s.charAt(i));
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
A
B B
C C C
D D D D
E E E E E
*/