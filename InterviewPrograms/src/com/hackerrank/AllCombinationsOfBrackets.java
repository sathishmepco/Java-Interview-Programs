package com.hackerrank;

public class AllCombinationsOfBrackets {
	
	static int count = 0;
	public static void main(String[] args) {
		brackets(4, 0, "");
		bracketsCount(4, 0, "");
		System.out.println("Count is :: "+count);
	}
	
	public static void brackets(int openStack,int closeStack, String s ){
		if(openStack == 0 && closeStack == 0)
			System.out.println(s);
		if(openStack > 0)
			brackets(openStack-1, closeStack+1, s+"(");
		if( closeStack > 0)
			brackets(openStack, closeStack-1, s+")");
	}
	
	public static void bracketsCount(int openStack,int closeStack, String s ){
		if(openStack == 0 && closeStack == 0)
			count++;
		if(openStack > 0)
			bracketsCount(openStack-1, closeStack+1, s+"(");
		if( closeStack > 0)
			bracketsCount(openStack, closeStack-1, s+")");
	}
}

/*
Input
3
Output
((()))
(()())
(())()
()(())
()()()
Count is :: 5

Input
4
Output
(((())))
((()()))
((())())
((()))()
(()(()))
(()()())
(()())()
(())(())
(())()()
()((()))
()(()())
()(())()
()()(())
()()()()
Count is :: 14
*/

