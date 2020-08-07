package com.java.matrix;

/*
 * Add Two Matrix
 * ---------------
 * Addition is possible only when both A & B
 * matrices should have same dimensions, that is
 * both matrix should have same number of rows
 * and same number of columns.
 * 
 * Then add the corresponding elements means 
 * A[i][j] + B[i][j]
 * 
 * Store the result in the new matrix called C
 */
public class MatrixAddition {
	
	public static void main(String[] args) {
		int matrixA[][] = {
						{1,2,3,4},
						{5,6,7,8},
						{9,10,11,12},
						{13,14,15,16}
						};
		int row1 = 4, col1 = 4;
		
		int matrixB[][] = {
						{5,10,15,20},
						{25,30,35,40},
						{45,50,55,60},
						{65,70,75,80}
						};
		int row2 = 4, col2 = 4;
		
		if(row1 != row2 || col1 != col2){
			System.out.println("Addition is not possible");
			return;
		}
			
		int rows = row1;
		int columns = col1;
		
		int resultMatrix[][] = new int[rows][columns];
		for(int i=0;i<rows;i++)
			for(int j=0;j<columns;j++)
				resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
		
		System.out.println("Matrix A is :: ");
		display(matrixA, rows, columns);
		
		System.out.println("Matrix B is ::");
		display(matrixB, rows, columns);
		
		System.out.println("Addition of two matrix is ::");
		display(resultMatrix, rows, columns);
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
	INPUT
	Matrix A is :: 
	1 2 3 4 
	5 6 7 8 
	9 10 11 12 
	13 14 15 16 
	
	Matrix B is ::
	5 10 15 20 
	25 30 35 40 
	45 50 55 60 
	65 70 75 80
	
	OUTPUT 
	Addition of two matrix is ::
	6 12 18 24 
	30 36 42 48 
	54 60 66 72 
	78 84 90 96 

	INPUT
	Matrix A is ::
	1 2 3 4 
	5 6 7 8
	
	Matrix B is ::
	5 10 15
	20 25 30  
	35 40 45 
	
	OUTPUT
	Addition is not possible
	
*/