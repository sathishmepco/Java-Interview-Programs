package com.java.matrix;

/*
 * Multiply Two Matrices
 * ----------------------
 * Matrix multiplication is possible only when
 * number of columns of first matrix equals to 
 * number of rows of second matrix.
 * 
 * If col1 not equals to row2 then multiplication
 * is not possible
 * 
 * Matrix A (rows = 2, columns = 2)
 * 	1	1
 * 	2	2
 * Matrix B (rows = 2, columns = 2)
 * 	3	4
 * 	5	6
 * 
 * A * B
 * 1*3+1*5  1*4+1*6	
 * 2*3+2*5	2*4+2*6
 * 
 * 3+5		4+6
 * 6+10		8+12
 * 
 * 8	10
 * 16	20
 * 
 * Example 2
 * Matrix A (rows = 2, columns = 3)
 * 	1	1	1
 * 	2	2	2
 * Matrix B (rows = 2, columns = 2)
 * 	5	10
 * 	15	20
 * 
 * Multiplication is NOT possible
 * because column1 not equal to row2
 * 
 */
public class MatrixMultiplication {
	public static void main(String[] args) {
		int matrixA[][] = { 
				{ 1, 1 }, 
				{ 2, 2 } 
				};
		int row1 = 2, col1 = 2;
		int matrixB[][] = { 
				{ 3, 4 }, 
				{ 5, 6 }
				};
		int row2 = 2, col2 = 2;
		
		if(col2 != row1){
			System.out.println("Multiplication is NOT possible.");
			return;
		}
		
		int result[][] = new int[row1][col2];
		for(int i=0;i<row1;i++)
			for(int j=0;j<col2;j++)
				for(int k=0;k<col1;k++)
					result[i][j] += matrixA[i][k] * matrixB[k][j];
				
		System.out.println("Matrix A is :: ");
		display(matrixA, row1, col1);
		
		System.out.println("Matrix B is ::");
		display(matrixB, row2, col2);
		
		System.out.println("Multiplication of two matrices is ::");
		display(result, row1, col2);	
	}
	
	static void display(int matrix[][],int rows,int columns){
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++)
				System.out.print(matrix[i][j]+" ");
			System.out.println();
		}		
	}
}
/*
	OUTPUT
	Matrix A is :: 
	1 1 
	2 2 
	Matrix B is ::
	3 4 
	5 6 
	Multiplication of two matrices is ::
	8 10 
	16 20 
*/