package com.java.matrix;

/*
 * Print the Matrix in the Spiral Form
 * ------------------------------------
 * say given matrix is 
 * 1	2	3
 * 4	5	6
 * 7	8	9
 * 
 * Spiral Form :: 1 2 3 6 9 8 7 4 5
 * 
 * Solution:
 * 1. Print the first row
 * 2. Print the last column
 * 3. Print the last row
 * 4. Print the first column
 * 5. make rows--, columns-- and call 1 to 4 recursively
 * 
 */
public class MatrixInSpiralForm {
	public static void main(String[] args) {
		/*int matrix[][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
				};
		int rows = 3, columns = 3;*/
		/*int matrix[][] = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
				};
		int rows = 4, columns = 4;*/
		
		int matrix[][] = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20},
				{21,22,23,24,25}
				};
		int rows = 5, columns = 5;
				
		int curRow = 0;
		int curCol = 0;
	
		System.out.println("Spiral form of the given matrix is ::");
		while(curRow < rows && curCol < columns){
			//print first row
			for(int i=curCol;i<columns;i++)
				System.out.print(matrix[curRow][i]+" ");
			curRow++;
			//print last column
			for(int i=curRow;i<rows;i++)
				System.out.print(matrix[i][rows-1]+" ");
			columns--;
			//print last row
			for(int i=columns-1;i>=curCol;i--)
				System.out.print(matrix[rows-1][i]+" ");
			rows--;
			//print first column
			for(int i=rows-1;i>=curRow;i--)
				System.out.print(matrix[i][curCol]+" ");
			curCol++;
		}
	}
}
/*
	OUTPUT
	{1,2,3},
	{4,5,6},
	{7,8,9}
	Spiral form of the given matrix is ::
	1 2 3 6 9 8 7 4 5
	
	OUTPUT
	{1,2,3,4},
	{5,6,7,8},
	{9,10,11,12},
	{13,14,15,16} 
	Spiral form of the given matrix is ::
	1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
	
	OUTPUT
	{1,2,3,4,5},
	{6,7,8,9,10},
	{11,12,13,14,15},
	{16,17,18,19,20},
	{21,22,23,24,25}
	Spiral form of the given matrix is ::
	1 2 3 4 5 10 15 20 25 24 23 22 21 16 11 6 7 8 9 14 19 18 17 12 13 
*/