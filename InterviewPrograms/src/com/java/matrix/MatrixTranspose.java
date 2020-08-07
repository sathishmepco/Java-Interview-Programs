package com.java.matrix;

/*
 * Transpose of Matrix
 * --------------------
 * It is simply a flipped version of original matrix.
 * Rows are the columns of original matrix
 * Columns are the rows of the original matrix
 * 
 *  Say Matrix A is 
 *  1 2 3
 *  4 5 6
 *  
 *  Transpose of matrix A is AT 
 *  1 4
 *  2 5
 *  3 6
 */
public class MatrixTranspose {
	public static void main(String[] args) {
		int matrix[][] = {
				{1,2,3},
				{4,5,6}
				};
		int rows = 2;
		int columns = 3;
		
		int rowT = columns;
		int colT = rows;
		
		int matrixT[][] = new int[rowT][colT];
		for(int i=0;i<rowT;i++){
			for(int j=0;j<colT;j++)
				matrixT[i][j] = matrix[j][i];
		}
		
		System.out.println("The given matrix is (say matrix A)::");
		displayMatrix(matrix, rows, columns);
		
		System.out.println("Transpose of Given matrix is (say matrix AT)::");
		displayMatrix(matrixT, rowT, colT);
	}
	
	private static void displayMatrix(int matrix[][],int rows,int cols){
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++)
				System.out.print(matrix[i][j]+"\t");
			System.out.println();
		}
	}
}

/*
	OUTPUT
	The given matrix is (say matrix A)::
	1	2	3	
	4	5	6	
	Transpose of Given matrix is (say matrix AT)::
	1	4	
	2	5	
	3	6	
*/