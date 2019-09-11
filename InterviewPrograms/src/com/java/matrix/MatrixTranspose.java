package com.java.matrix;

import java.util.Scanner;

/*
 * Transpose of Matrix
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
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no of rows in the matrix : ");
		int rows = Integer.parseInt(scanner.nextLine().trim());
		System.out.println("Enter the no of columns in the matrix : ");
		int cols = Integer.parseInt(scanner.nextLine().trim());
		
		int matrix[][] = new int[rows][cols];
		for(int i=0;i<rows;i++){
			System.out.println("Enter the values (space separated values in one line) in the row :: "+(i+1));
			String line = scanner.nextLine().trim();
			String str[] = line.split("\\s");
			for(int j=0;j<cols;j++){
				matrix[i][j] = Integer.parseInt(str[j]);
			}
		}
		
		System.out.println("The given matrix is (say matrix A)::");
		displayMatrix(rows, cols, matrix);
		
		int matrixT[][] = transposeMatrix(rows, cols, matrix);
		System.out.println("Transpose of Given matrix is (say matrix AT)::");
		displayMatrix(cols, rows, matrixT);
		scanner.close();
	}
	
	private static void displayMatrix(int rows,int cols, int matrix[][]){
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++)
				System.out.print(matrix[i][j]+"\t");
			System.out.println();
		}
	}
	
	private static int[][] transposeMatrix(int rows, int cols, int matrix[][]){
		int matrixT[][] = new int[cols][rows];
		for(int i=0;i<cols;i++){
			for(int j=0;j<rows;j++)
				matrixT[i][j] = matrix[j][i];
		}
		return matrixT;
	}
}

/*
	OUTPUT
	
	Enter the no of rows in the matrix : 
	2
	Enter the no of columns in the matrix : 
	3
	Enter the values (space separated values in one line) in the row :: 1
	1 2 3
	Enter the values (space separated values in one line) in the row :: 2
	4 5 6
	The given matrix is (say matrix A)::
	1	2	3	
	4	5	6	
	Transpose of Given matrix is (say matrix AT)::
	1	4	
	2	5	
	3	6
*/