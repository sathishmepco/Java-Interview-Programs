package com.java.patterns;
import java.util.Scanner;
/*
Write the program to print the following pattern
        0 
      1 0 1
    2 1 0 1 2
  3 2 1 0 1 2 3
4 3 2 1 0 1 2 3 4
*/
public class Pattern16 {
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine().trim());
        int d = (N-1)*2;
        for(int i=0;i<N;i++){
            for(int j=0;j<d-1;j++)
                System.out.print(" ");
            for(int j=i;j>=0;j--)
                if(i == N-1 && j == i)
                    System.out.print(j);
                else
                    System.out.print(" "+j);
            for(int j=1;j<=i;j++)
                System.out.print(" "+j);
			if(i==0 && N != 1)
                System.out.print(" ");
            d-=2;
            if(i < N-1)
                System.out.println();
        }
        scanner.close();
   }
}
/*
Input
5
Output
        0 
      1 0 1
    2 1 0 1 2
  3 2 1 0 1 2 3
4 3 2 1 0 1 2 3 4
*/