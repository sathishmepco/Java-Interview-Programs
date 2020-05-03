package com.java.patterns;
import java.util.Scanner;

/*
Write the program to print the following pattern
        1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
*/
public class Pattern14 {
    public static void main(String args[] ) throws Exception {
    	Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine().trim());
        int d = (N-1)*2;
        for(int i=0;i<N;i++){
            for(int j=0;j<d-1;j++)
                System.out.print(" ");
            for(int j=0;j<=i;j++)
                if(i == N-1 && j == 0)
                    System.out.print(j+1);
                else
                    System.out.print(" "+(j+1));
            for(int j=i-1;j>=0;j--)
                System.out.print(" "+(j+1));
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
        1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
*/