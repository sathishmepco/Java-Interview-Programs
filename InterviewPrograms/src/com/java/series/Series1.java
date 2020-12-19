package com.java.series;

/*
 * Print the following Series
 * 2 9 28 65 126 217 344
 * -------------------------
 * for i-th element
 * (i^3)+1
 * 
 * i = 1 => 1^3+1 = 1 + 1 = 2 
 * i = 2 => 2^3+1 = 8 + 1 = 9  
 * i = 3 => 3^3+1 = 27 + 1 = 28
 * i = 4 => 4^3+1 = 64 + 1 = 65
 * i = 5 => 5^3+1 = 125 + 1 = 126
 * i = 6 => 6^3+1 = 216 + 1 = 217
 * i = 7 => 7^3+1 = 343 + 1 = 344
 * 
 */

public class Series1 {
	public static void main(String[] args) {
		int n = 10;
		System.out.println("The Series is : ");
		for(int i=1;i<=n;i++){
			int value = (i*i*i) + 1;
			System.out.print(value+", ");
		}
	}
}
/*
	OUTPUT
	n = 10
	The Series is : 
	2, 9, 28, 65, 126, 217, 344, 513, 730, 1001
	
	OUTPUT
	n = 5
	The Series is : 
	2, 9, 28, 65, 126  
*/