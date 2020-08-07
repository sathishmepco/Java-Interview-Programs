package com.java.matrix;

/*
 * Print the Lower Triangular Matrix of Given Matrix
 * -------------------------------------------------
 * 
 * say Given Matrix is 
 * 1 1 1
 * 2 2 2
 * 3 3 3
 * 
 * Lower Triangular Matrix is
 * 1
 * 2 2
 * 3 3 3
 * 
 */
public class LowerTriangularMatrix {
	public static void main(String[] args) {
		int matrix[][] = {
				{1,1,1,1},
				{2,2,2,2},
				{3,3,3,3},
				{4,4,4,4}
				};
		int rows = 4, columns = 4;
		
/*		int matrix[][] = {
				{1,1,1,1,1,1},
				{2,2,2,2,2,2},
				{3,3,3,3,3,3},
				{4,4,4,4,4,4},
				{5,5,5,5,5,5},
				{6,6,6,6,6,6}
				};
		int rows = 6, columns = 6;*/

		System.out.println("Lower Triangular Matrix is :");
		for(int i=0;i<rows;i++){
			for(int j=0;j<=i;j++)
				System.out.print(matrix[i][j]+" ");
			System.out.println();
		}
	}
}
/*
	OUTPUT
	Lower Triangular Matrix is :
	1 
	2 2 
	3 3 3 
	4 4 4 4 

	OUTPUT
	Lower Triangular Matrix is :
	1 
	2 2 
	3 3 3 
	4 4 4 4 
	5 5 5 5 5 
	6 6 6 6 6 6 
*/