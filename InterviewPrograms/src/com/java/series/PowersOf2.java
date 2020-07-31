package com.java.series;

/*
 * Print the following series
 * 1 2 4 8 16 32 64 128 256 512 1024 ...
 * Powers of 2
 * 
 * i-th term is 
 * 2^i
 * 
 * i = 0 => 2^0 = 1
 * i = 1 => 2^1 = 2
 * i = 2 => 2^2 = 4
 * i = 3 => 2^3 = 8
 * i = 4 => 2^4 = 16
 * i = 5 => 2^5 = 32
 * i = 6 => 2^6 = 64
 * i = 7 => 2^7 = 128
 * i = 8 => 2^8 = 256
 * i = 9 => 2^9 = 512
 * i = 10 => 2^10 = 1024
 * 
 */
public class PowersOf2 {
	public static void main(String[] args) {
		int n = 5;
		System.out.println("The Series is : ");
		for(int i=0; i<=n; i++){
			int value = (int)Math.pow(2, i);
			System.out.print(value+", ");
		}
	}
}
/*
	OUTPUT
	n = 10
	The Series is : 
	1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024
	
	OUTPUT
	n = 5
	The Series is : 
	1, 2, 4, 8, 16, 32 
*/