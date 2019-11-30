package com.java.parentheses;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Find whether the given string is balanced brackets or not
 * Possible brackets are ( ) { } [ ]
 * 
 * Balanced Brackets means
 * Each opening brackets has a corresponding closing brackets 
 * and pairs of brackets are properly nested.
 * 
 *  ()[] - VALID
 *  ([]) - VALID
 *  ([)] - INVALID
 *   
 */
public class BalancedParentheses {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any string value :: ");
		String str = scanner.nextLine();
		String output = isBalanced(str);
		System.out.println("Is Balanced Parentheses :: "+output);
		scanner.close();
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
INPUT
{[()]}
{[(])}
{{[[(())]]}}

OUTPUT
YES
NO
YES

*/