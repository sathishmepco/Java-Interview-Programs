package com.java.patterns;
import java.util.Scanner;
/*
Write the program to print the following pattern
E E E E E
  D D D D
    C C C
      B B
        A
*/
public class Pattern27 {
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i=0;i<N;i++){
            for(int j = 0;j<i;j++)
				System.out.print("  ");
            for(int j=0;j<N-i;j++)
                if(j == 0)
                    System.out.print(s.charAt(N-i-1));
                else
                    System.out.print(" "+s.charAt(N-i-1));
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
E E E E E
  D D D D
    C C C
      B B
        A
*/