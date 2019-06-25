package com.java.coin.change;

import java.util.Arrays;
public class MaxNoOfWays {
	
	public static void main(String[] args) {
		int n = 5;
		int coins[] = {1,2,5};
		int noOfCoins = coins.length;

		int table[] = new int[n+1];
		table[0] = 1;
		for(int i=0;i<noOfCoins;i++){
			for(int j=coins[i];j<=n;j++)
				table[j] += table[j-coins[i]];
//			System.out.println(i+" "+Arrays.toString(array));
		}
		System.out.println(table[n]);
		System.out.println("Maximum no of ways to get change is :: "+table[n]);
	}
}