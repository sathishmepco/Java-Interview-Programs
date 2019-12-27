package com.java.numbers;

/*
 * 	Automorphic Number
 * 
 * An automorphic number is a number 
 * whose square ends with the number itself.
 * 
 *  examples are
 *  
 *  5^2 = 25 = here 25 ends with 5
 *  6^2 = 36 = here 36 ends with 6
 *  76^2 = 5776 = here 5776 ends with 76
 *  
 *  Solution steps:
 *  1. find the square root  of the number n
 *  2. get the unit digit of n
 *  3. get the unit digit of sqrt of n
 *  4. check both are same or not
 *  5. if both are same continue from step 2.
 *  6. if both are not same return false
 *  means this number is not a automorphic
 *  
 *  Automorphic Numbers are
 *  1, 5, 6, 25, 76, 376, 625 
 *  
 */
public class AutomorphicNumberList {
	public static void main(String[] args) {
		System.out.println("Automorphic Number from 1 to 1000 :: ");
		
		for(int i=1;i<=1000;i++)
			if(isAutomorphicNumber(i))
				System.out.print(i+" ");
	}
	
	private static boolean isAutomorphicNumber(int n){
		int sqrt = n * n;
		while (n > 0){
			int reminder1 = n % 10;
			int reminder2 = sqrt % 10;
			if(reminder1 != reminder2)
				return false;
			n = n/10;
			sqrt = sqrt/10;
		}
		return true;
	}
}
/*
	OUTPUT
	Automorphic Number from 1 to 1000 :: 
	1 5 6 25 76 376 625 
*/