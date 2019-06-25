package com.java.coin.change;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumCoins {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int noOfCoins = Integer.parseInt(scanner.nextLine().trim());
		int coins[] = new int[noOfCoins];
		for(int i=0;i<noOfCoins;i++)
			coins[i] = Integer.parseInt(scanner.nextLine().trim());
		int n = Integer.parseInt(scanner.nextLine().trim());
		
		int table[] = new int[n+1];
		table[0] = 0;
		
		for(int i=1;i<=n;i++)
			table[i] = Integer.MAX_VALUE;
		
		for(int i=1;i<=n;i++){
			for(int j=0;j<noOfCoins;j++)
				if(coins[j] <= i){
					int sub_res = table[i-coins[j]];
					if(sub_res != Integer.MAX_VALUE && sub_res+1 < table[i])
						table[i] = sub_res+1;
				}
//			System.out.println(i+" "+Arrays.toString(table));
		}
		System.out.print(table[n]);
		scanner.close();
	}
}
/*

Input 
4
7
3
2
6
13
Output
2

Input
3
1
2
10
5

*/