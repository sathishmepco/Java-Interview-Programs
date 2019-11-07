package com.cdac;

/*
 * Exception Hierarchy Chaining
 * multiple catch block in Hierarchy order
 */
public class ExceptionChaining {
	
	public static void main(String[] args) {
		try{
			//test case 1 - Arithmetic Exception
			int i = 10 / 0;
			
			//comment the above code and run this code
			//test case 2 - Runtime exception with return statement
			String s =null;
			s.length();
		}catch(ArithmeticException ae){
			System.out.println("Arithmetic Exception");
			ae.printStackTrace();
		}catch(RuntimeException re){
			System.out.println("Runtime Exception");
			re.printStackTrace();
			//this return statement transfer the control to calling method
			//because this return, code statement after try block will not execute
			return;
		}catch(Exception e){
			System.out.println("Exception");
			e.printStackTrace();
		}
		finally{
			//this block will execute in both cases
			//with exception or without exception occurs
			System.out.println("Finally block");
		}
		System.out.println("Outside of try block");
	}
}