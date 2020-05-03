package com.java.patterns;
import java.util.Scanner;
/*
Write the program to print the following pattern
        A 
      B A B
    C B A B C
  D C B A B C D
E D C B A B C D E
*/
public class Pattern15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine().trim());
        String CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int d = (N-1)*2;
        for(int i=0;i<N;i++){
            for(int j=0;j<d-1;j++)
                System.out.print(" ");
            for(int j=i;j>=0;j--)
                if(i == N-1 && j == i)
                    System.out.print(CHARS.charAt(j));
                else
                    System.out.print(" "+CHARS.charAt(j));
            for(int j=1;j<=i;j++)
                System.out.print(" "+CHARS.charAt(j));
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
        A 
      B A B
    C B A B C
  D C B A B C D
E D C B A B C D E
*/