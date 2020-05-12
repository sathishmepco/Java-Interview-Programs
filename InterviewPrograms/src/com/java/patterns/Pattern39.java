package com.java.patterns;
import java.util.Scanner;
/*
Write the program to print the following pattern
5 5 5 5 5
4 4 4 4
3 3 3
2 2
1
*/
public class Pattern39 {
	public static void main(String args[] ) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.nextLine());
		for(int i=0;i<N;i++){
			for(int j=0;j<N-i;j++)
				if(j == 0)
					System.out.print(N-i);
				else
					System.out.print(" "+(N-i));
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
5 5 5 5 5
4 4 4 4
3 3 3
2 2
1
*/