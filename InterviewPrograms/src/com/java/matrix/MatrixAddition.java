package com.java.matrix;

public class MatrixAddition {
	
	public static void main(String[] args) {
		int matrixA[][] = {
						{1,2,3,4},
						{5,6,7,8},
						{9,10,11,12},
						{13,14,15,16}
						};
		
		int matrixB[][] = {
						{5,10,15,20},
						{25,30,35,40},
						{45,50,55,60},
						{65,70,75,80}
						};
		int rows = 4;
		int columns = 4;
		
		int resultMatrix[][] = new int[rows][columns];
		for(int i=0;i<rows;i++)
			for(int j=0;j<columns;j++)
				resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
		
		System.out.println("Addition of two matrix is ::");
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++)
				System.out.print(resultMatrix[i][j]+" ");
			System.out.println();
		}
	}
}
