package com.cdac;

/*
 * This method will throw the exception
 * But the method returns the value also.
 */

public class ExceptionWithReturn {
	
	public static void main(String[] args) {
		boolean result = nullCheck(null);
		System.out.println("Result is :: "+result);
	}
	
	public static boolean nullCheck(String s){
		try{
			if(s == null)
				throw new ArithmeticException();
			System.out.println("After exception");
		}catch(ArithmeticException e){
			e.printStackTrace();
			return false;
		}
		finally{
			System.out.println("Finally Block");
		}
		return true;
	}

}