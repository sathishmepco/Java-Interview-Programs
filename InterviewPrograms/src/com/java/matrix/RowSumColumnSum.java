package com.java.matrix;

/*
 * Print each Row Sum & each Column Sum
 * -------------------------------------
 * Traverse each row and calculate the sum of all
 * elements of the row then print it.
 * 
 * In the same way do it for each column.
 * 
 * say Given Matrix is 
 * 1 1 1 1
 * 2 2 2 2
 * 3 3 3 3
 * 4 4 4 4
 * 
 * Row Sum 
 * Row 1 sum is : 4
 * Row 2 sum is : 8
 * Row 3 sum is : 12
 * Row 4 sum is : 16
 * 
 * Column Sum
 * Column 1 sum is : 10
 * Column 2 sum is : 10
 * Column 3 sum is : 10
 * Column 4 sum is : 10
 * 
 */
public class RowSumColumnSum {
	public static void main(String[] args) {
		/*int matrix[][] = {
				{1,1,1,1},
				{2,2,2,2},
				{3,3,3,3},
				{4,4,4,4}
				};
		int rows = 4, columns = 4;*/
		
		int matrix[][] = {
				{5,10,15,20},
				{25,30,35,40},
				{45,50,55,60},
				{65,70,75,80}
				};
		int rows = 4, columns = 4;
		System.out.println("Row's Sum");
		for(int i=0;i<rows;i++){
			int sum = 0;
			for(int j=0;j<columns;j++)
				sum += matrix[i][j];
			System.out.println("Row "+(i+1)+" sum is :"+sum);
		}
		
		System.out.println("Column's Sum");
		for(int j=0;j<columns;j++){
			int sum = 0;
			for(int i=0;i<rows;i++)
				sum += matrix[i][j];
			System.out.println("Column "+(j+1)+" sum is :"+sum);
		}
	}
}

/*
	INPUT
	{1,1,1,1},
	{2,2,2,2},
	{3,3,3,3},
	{4,4,4,4}
	OUTPUT
	Row's Sum
	Row 1 sum is :4
	Row 2 sum is :8
	Row 3 sum is :12
	Row 4 sum is :16
	Column's Sum
	Column 1 sum is :10
	Column 2 sum is :10
	Column 3 sum is :10
	Column 4 sum is :10

	INPUT
	{5,10,15,20},
	{25,30,35,40},
	{45,50,55,60},
	{65,70,75,80}
	OUTPUT
	Row's Sum
	Row 1 sum is :50
	Row 2 sum is :130
	Row 3 sum is :210
	Row 4 sum is :290
	Column's Sum
	Column 1 sum is :140
	Column 2 sum is :160
	Column 3 sum is :180
	Column 4 sum is :200

*/