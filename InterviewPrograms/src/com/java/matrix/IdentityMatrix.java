package com.java.matrix;

/*
 * Identity Matrix
 * ----------------
 * If a matrix is a Identity matrix then it should 
 * follow all the conditions
 * 1. It should be square matrix row == column
 * 2. All the elements of main diagonal should be 1
 * 3. Rest of the elements should be 0.
 * 
 * If any of the above conditions are not satisfied
 * then the matrix is not Identity Matrix.
 * 
 * Examples of Identity matrix
 * ----------------------------
 * 1 0 0 
 * 0 1 0
 * 0 0 1
 * 
 * 1 0 0 0
 * 0 1 0 0
 * 0 0 1 0
 * 0 0 0 1
 * 
 * NOT Identity matrix
 * --------------------
 * 1 2
 * 3 4
 * 
 * 1 1 1
 * 1 0 1
 * 1 1 1
 * 
 * 1 0 0
 * 0 1 0
 *  
 */
public class IdentityMatrix {
	public static void main(String[] args) {
		int matrix[][] = {
				{1,0,0,0},
				{0,1,0,0},
				{0,0,1,0},
				{0,0,0,1}
				};
/*		int matrix[][] = {
				{1,0,0},
				{0,1,0},
				{0,0,1}
				};*/
		int row = 4;
		int column = 4;
		
		//row and column should be same to make square matrix
		if(row != column){
			System.out.println("Given matrix is NOT a Identity Matrix");
			return;
		}
		
		//main diagonal elements should be 1
		for(int i=0;i<row;i++)
			if(matrix[i][i] != 1){
				System.out.println("Given matrix is NOT a Identity Matrix");
				return;
			}
				
		//rest of the elements should be 0
		for(int i=0;i<row;i++)
			for(int j=0;j<column;j++)
				if(i != j && matrix[i][j] != 0){
					System.out.println("Given matrix is NOT a Identity Matrix");
					return;
				}
		//if all the 3 conditions are satisfied
		//Given matrix is Identity Matrix
		
		System.out.println("Given matrix is a Identity Matrix");
	}
}
/*
	OUTPUT
	matrix[][] = {
				{1,0,0,0},
				{0,1,0,0},
				{0,0,1,0},
				{0,0,0,1}
				};
	Given matrix is a Identity Matrix
	
	OUTPUT
	matrix[][] = {
				{1,0,0},
				{0,1,0},
				{0,0,1},
				};
	Given matrix is a Identity Matrix

	OUTPUT
	matrix[][] = {
				{1,1,1},
				{0,1,1},
				{1,0,1},
				};
	Given matrix is NOT a Identity Matrix
	
	OUTPUT
	matrix[][] = {
				{1,0,0},
				{0,1,0}
				};
	Given matrix is NOT a Identity Matrix	
*/