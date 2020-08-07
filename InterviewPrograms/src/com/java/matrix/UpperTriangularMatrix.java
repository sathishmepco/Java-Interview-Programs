package com.java.matrix;
/*
 * Print the Upper Triangular Matrix of Given Matrix
 * -------------------------------------------------
 * say Given Matrix is 
 * 1 1 1
 * 2 2 2
 * 3 3 3
 * 
 * Upper Triangular Matrix is
 * 1 1 1
 *   2 2
 *     3
 */
public class UpperTriangularMatrix {
	public static void main(String[] args) {
		/*int matrix[][] = {
				{1,1,1,1},
				{2,2,2,2},
				{3,3,3,3},
				{4,4,4,4}
				};
		int rows = 4, columns = 4;*/
		
		int matrix[][] = {
				{1,1,1,1,1,1},
				{2,2,2,2,2,2},
				{3,3,3,3,3,3},
				{4,4,4,4,4,4},
				{5,5,5,5,5,5},
				{6,6,6,6,6,6}
				};
		int rows = 6, columns = 6;

		System.out.println("Upper Triangular Matrix is :");
		for(int i=0;i<rows;i++){
			for(int j=0;j<i;j++)
				System.out.print("  ");
			for(int j=i;j<columns;j++)
				System.out.print(matrix[i][j]+" ");
			System.out.println();
		}
	}
}
/*
	OUTPUT
	Upper Triangular Matrix is :: 
	1 1 1 1 
	  2 2 2 
	    3 3 
	      4
	
	OUTPUT
	Upper Triangular Matrix is :: 
	1 1 1 1 1 1 
	  2 2 2 2 2 
	    3 3 3 3 
	      4 4 4 
	        5 5 
	          6 
*/