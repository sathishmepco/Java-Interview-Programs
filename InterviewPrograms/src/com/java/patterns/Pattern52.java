package com.java.patterns;
import java.util.Scanner;
/*
Write the program to print the following pattern
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
*/
public class Pattern52 {
	public static void main(String args[] ) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.nextLine());
		for(int i=0;i<N;i++){
			for(int j=1;j<6;j++)
				if(j == 1)
					System.out.print(j);
				else
					System.out.print(" "+j);
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
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
*/