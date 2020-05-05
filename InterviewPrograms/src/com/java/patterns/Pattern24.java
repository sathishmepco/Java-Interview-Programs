package com.java.patterns;
import java.util.Scanner;
/*
Write the program to print the following pattern
        1
      2 2 2
    3 3 3 3 3
  4 4 4 4 4 4 4
5 5 5 5 5 5 5 5 5
*/
public class Pattern24 {
	public static void main(String args[] ) throws Exception {
		Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int iSpace = 0;
		int k = 0;
        for(int i=0;i<N;i++){
            for(int j = iSpace;j<N-1;j++)
				System.out.print("  ");
            for(int j=0;j<=k;j++)
                if(j == 0)
                    System.out.print(i+1);
                else
                    System.out.print(" "+(i+1));
            iSpace++;
			k+=2;
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
      2 2 2
    3 3 3 3 3
  4 4 4 4 4 4 4
5 5 5 5 5 5 5 5 5
*/