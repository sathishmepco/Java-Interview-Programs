package com.java.patterns;
import java.util.Scanner;
/*
Write the program to print the following pattern
        A
      B B B
    C C C C C
  D D D D D D D
E E E E E E E E E
*/
public class Pattern22 {
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
                    System.out.print(s.charAt(i));
                else
                    System.out.print(" "+s.charAt(i));
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
      B B B
    C C C C C
  D D D D D D D
E E E E E E E E E
*/