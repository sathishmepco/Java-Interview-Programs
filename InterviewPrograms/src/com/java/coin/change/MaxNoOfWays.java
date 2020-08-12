package com.java.coin.change;

/*
 * All possible change for the given money
 * ---------------------------------------
 * say the bank has following denominations
 * 1, 2, 3
 * 
 * Also the bank has unlimited coins of 1 
 * unlimited coins of 2 and unlimited coins of 3.
 * 
 * One customer comes to the bank to get the change for 5
 * What are all the ways the bank cashier can give the change?
 * need change for 5?
 * 1) 1, 1, 1, 1, 1
 * 2) 1, 1, 1, 2
 * 3) 1, 2, 2
 * 4) 1, 1, 3
 * 5) 2, 3
 * So there are 5 ways the cashier can give change.
 *
 *    
 * another example coins are {5, 10, 20}
 * need change for 40?
 * All possible ways are
 * 1) 5, 5, 5, 5, 5, 5, 5, 5
 * 2) 5, 5, 5, 5, 5, 5, 10
 * 3) 5, 5, 5, 5, 10, 10
 * 4) 5, 5, 5, 5, 20
 * 5) 5, 5, 10, 10, 10
 * 6) 5, 5, 10, 20
 * 7) 10, 10, 10, 10
 * 8) 10, 10, 20
 * 9( 20, 20
 *  
 * So total possible ways are 9.
 */
public class MaxNoOfWays {
	public static void main(String[] args) {
		
//		int n = 5;
//		int coins[] = {1,2,3};
		
		int n = 40;
		int coins[] = {5,10,20};
		int noOfCoins = coins.length;

		int table[] = new int[n+1];
		table[0] = 1;
		for(int i=0;i<noOfCoins;i++){
			for(int j=coins[i];j<=n;j++)
				table[j] += table[j-coins[i]];
		}
		System.out.println("Maximum no of ways to get change is :: "+table[n]);
	}
}
/*
	OUTPUT
	coins = {1,2,3}
	n = 5
	Maximum no of ways to get change is :: 5

	OUTPUT
	coins = {5,10,20}
	n = 40
	Maximum no of ways to get change is :: 9
*/