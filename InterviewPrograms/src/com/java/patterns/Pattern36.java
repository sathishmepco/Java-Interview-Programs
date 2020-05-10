package com.java.patterns;
import java.util.Scanner;
/*
Write the program to print the following pattern
E D C B A
E D C B
E D C
E D
E
*/
public class Pattern36 {
	public static void main(String args[] ) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.nextLine());
		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(int i=0;i<N;i++){
			for(int j=N-1;j>=i;j--)
				if(j == N-1)
					System.out.print(s.charAt(j));
				else
					System.out.print(" "+s.charAt(j));
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
E D C B A
E D C B
E D C
E D
E
*/