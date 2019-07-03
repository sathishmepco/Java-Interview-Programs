package com.hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class BalancedBrackets {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine().trim());
		String output[] = new String[n];
		for(int i=0;i<n;i++){
			String line = scanner.nextLine();
			output[i] = isBalanced(line);
		}
		for(int i=0;i<n;i++)
			System.out.println(output[i]);
	}
	
	public static String isBalanced(String line){
		String output = null;
		ArrayList<Character> charStack = new ArrayList<>();
		for(Character c : line.toCharArray()){
			if(c == '(' || c == '[' || c == '{'){
				charStack.add(c);
			}else{
				if(charStack.isEmpty()){
					output = "NO";
					break;
				}
				char ch = charStack.remove(charStack.size()-1);
				if(c == ')' && ch == '('){
					continue;
				}else if(c == '}' && ch == '{'){
					continue;
				}else if(c == ']' && ch == '['){
					continue;
				}else{
					output = "NO";
					break;
				}
			}
		}
		
		if(!charStack.isEmpty())
			output = "NO";
		if(output == null)
			output = "YES";
		
		return output;
	}
}

/*

Input
3
{[()]}
{[(])}
{{[[(())]]}}
{{}(

Output
YES
NO
YES
NO
 
*/