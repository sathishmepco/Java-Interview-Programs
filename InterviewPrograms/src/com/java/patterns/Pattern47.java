package com.java.patterns;
import java.util.Scanner;
/*
Write the program to print the following pattern
E E E E E
D D D D D
C C C C C
B B B B B
A A A A A
*/
public class Pattern47 {
	public static void main(String args[] ) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.nextLine());
		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(int i=N-1;i>=0;i--){
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
E E E E E
D D D D D
C C C C C
B B B B B
A A A A A
*/