package com.java.array;

public class FindingAllSubsets {
	
	public static void main(String[] args) {
		//solution 1 follows bitwise approach
//		solution1();
		
		//solution 2 follows recursion approach
		solution2();
	}

	public static void solution1() {
		char set[] = {'a','b','c','d'};
		int n = set.length;
		for (int i = 0; i < (1 << n); i++) {
			System.out.print("{ ");
			for (int j = 0; j < n; j++){
				if ((i & (1 << j)) > 0)
					System.out.print(set[j] + " ");
			}
			System.out.println("}");
		}
	}
	
	public static void solution2(){
		int array[] = {10,20,30,40,50};
		int visited[] = new int[array.length];
		traverse(array, visited,0);
	}
	
	public static void traverse(int array[],int visited[],int curIndex){
		System.out.print("\n{ ");
		for(int i=0;i<visited.length;i++)
			if(visited[i] == 1)
				System.out.print(array[i]+" ");
		System.out.print("}");
		
		for(int j=curIndex;j<array.length;j++){
			visited[j] = 1;
			traverse(array, visited,j+1);
			visited[j] = 0;
		}
	}
}

/*
 * 
 * Input: S = {a, b, c, d} Output: {}, {a} , {b}, {c}, {d}, {a,b}, {a,c}, {a,d},
 * {b,c}, {b,d}, {c,d}, {a,b,c}, {a,b,d}, {a,c,d}, {b,c,d}, {a,b,c,d}
 * 
 */
