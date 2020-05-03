package com.java.patterns;

import java.util.Scanner;

/*
Write a Java Program to print the following Pattern
1 1 1 1 1
2 2 2 2 2
3 3 3 3 3
4 4 4 4 4
5 5 5 5 5
*/
public class Pattern11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows to print the pattern :: ");
		int N = Integer.parseInt(scanner.nextLine().trim());
		for(int i=0;i<N;i++){
            for(int j=0;j<5;j++)
                if(j == 4)
                    System.out.print((i+1)+"");
                else
                    System.out.print(i+1+" ");
            if(i < N-1)
                System.out.println("");
        }
		scanner.close();
	}
}
/*
OUTPUT
Enter the number of rows to print the pattern :: 5
1 1 1 1 1
2 2 2 2 2
3 3 3 3 3
4 4 4 4 4
5 5 5 5 5

Enter the number of rows to print the pattern :: 2
1 1 1 1 1
2 2 2 2 2
*/