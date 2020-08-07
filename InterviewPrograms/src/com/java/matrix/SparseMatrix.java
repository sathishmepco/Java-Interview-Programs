package com.java.matrix;

/*
 * Sparse Matrix
 * --------------
 * First count the number of zero elements in the matrix. 
 * Then calculate the size of the matrix (row*column).
 * 
 * For the matrix to be Sparse Matrix,
 * count of the zero elements should be greater 
 * than size/2.
 * 
 * Say the matrix is 
 * 1 2 3
 * 4 0 0
 * 0 0 0
 * zeroCount = 5
 * size of the array = 9
 * zeroCount > size/2
 * So this matrix is Sparse Matrix
 * 
 * Say the matrix is 
 * 5 0 3
 * 0 6 0
 * 0 0 7
 * zeroCount = 6
 * size of the array = 9
 * zeroCount > size/2
 * So this matrix is Sparse Matrix
 * 
 * Say the matrix is 
 * 2 0 2
 * 0 2 0
 * zeroCount = 3
 * size of the array = 6
 * zeroCount == size/2
 * So this matrix is NOT Sparse Matrix
 * 
 */
public class SparseMatrix {
	public static void main(String[] args) {
		int matrix[][] = {
				{1,2,3},
				{4,0,0},
				{0,0,0}
				};
		int row = 3;
		int column = 3;
		
		int zeroCount = 0;
		for(int i=0;i<row;i++)
			for(int j=0;j<column;j++)
				if(matrix[i][j] == 0)
					zeroCount++;
		
		int size = row*column;
		
		if(zeroCount > size/2)
			System.out.println("Given matrix is a Sparse Matrix");
		else
			System.out.println("Given matrix is NOT a Sparse Matrix");
	}
}
/*
	INPUT
	1 2 3
 	4 0 0
 	0 0 0
	OUTPUT
	Given matrix is a Sparse Matrix

	INPUT
	5 0 3
	0 6 0
	0 0 7
	OUTPUT
	Given matrix is a Sparse Matrix
	
	INPUT
	2 0 2
	0 2 0
	OUTPUT
	Given matrix is NOT a Sparse Matrix
	
	INPUT
	1 0 1
	0 1 0
	1 0 1
	OUTPUT
	Given matrix is NOT a Sparse Matrix
	
*/