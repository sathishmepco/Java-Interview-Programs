package com.java.patterns;
import java.util.Scanner;
/*
Write the program to print the following pattern
5 5 5 5 5
4 4 4 4 4
3 3 3 3 3
2 2 2 2 2
1 1 1 1 1
*/
public class Pattern49 {
	public static void main(String args[] ) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.nextLine());
		for(int i=N;i>0;i--){
			for(int j=0;j<5;j++)
				if(j == 0)
					System.out.print(i);
				else
					System.out.print(" "+i);
			if(i != 1)
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
4 4 4 4 4
3 3 3 3 3
2 2 2 2 2
1 1 1 1 1
*/