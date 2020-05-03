package com.java.patterns;
import java.util.Scanner;
/*
Write the program to print the following pattern
        A
      C C C
    E E E E E
  G G G G G G G
I I I I I I I I I
*/
public class Pattern21 {
    public static void main(String args[] ) throws Exception {
		Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int iSpace = 0;
		int k = 0;
        for(int i=0;i<N;i++){
            for(int j = iSpace;j<N-1;j++)
				System.out.print("  ");
            for(int j=0;j<=k;j++)
                if(j == 0)
                    System.out.print(s.charAt(k));
                else
                    System.out.print(" "+s.charAt(k));
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
        A
      C C C
    E E E E E
  G G G G G G G
I I I I I I I I I
*/