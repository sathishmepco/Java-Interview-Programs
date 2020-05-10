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
public class Pattern30 {
	public static void main(String args[] ) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.nextLine());
		for(int i=0;i<N;i++){
			for(int j = 0;j<i;j++)
				System.out.print("  ");
			for(int j=i;j<N;j++)
				if(j == i)
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