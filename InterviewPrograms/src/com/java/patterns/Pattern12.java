package com.java.patterns;

import java.util.Scanner;
/*
Write a Java Program to print the following Pattern
9 9 9 9 9 9 9 9 9
  7 7 7 7 7 7 7
    5 5 5 5 5
      3 3 3
        1
*/
public class Pattern12 {
	public static void main(String args[] ) throws Exception {
    	Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine().trim());
        int d = 2*N -1;
        int k = 0;
        for(int i=0;i<N;i++){
            for(int j=0;j<k;j++)
                System.out.print("  ");
            for(int j=0;j<d;j++)
                if(j == 0)
                    System.out.print(d);
                else
                    System.out.print(" "+d);
            d-=2;
            k++;
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
9 9 9 9 9 9 9 9 9
  7 7 7 7 7 7 7
    5 5 5 5 5
      3 3 3
        1
*/