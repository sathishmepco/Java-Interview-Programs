package com.java.patterns;
import java.util.Scanner;
/*
Write the program to print the following pattern
        A
      C B A
    E D C B A
  G F E D C B A
I H G F E D C B A
*/
public class Pattern17 {
    public static void main(String args[] ) throws Exception {
		Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int iSpace = 0;
        for(int i=0;i<N;i++){
            for(int j = iSpace;j<N-1;j++)
            System.out.print("  ");
            for(int j=2*i;j>=0;j--)
                if(j == 2*i)
                    System.out.print(s.charAt(j));
                else
                    System.out.print(" "+s.charAt(j));
            iSpace++;
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
      C B A
    E D C B A
  G F E D C B A
I H G F E D C B A
*/