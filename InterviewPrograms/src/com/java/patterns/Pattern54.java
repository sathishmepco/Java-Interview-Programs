package com.java.patterns;
import java.util.Scanner;
/*
Write the program to print the following pattern
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/
public class Pattern54 {
	public static void main(String args[] ) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.nextLine());
		for(int i=0;i<N;i++){
			for(int j=0;j<=i;j++)
				if(j == 0)
					System.out.print(j+1);
				else
					System.out.print(" "+(j+1));
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
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/