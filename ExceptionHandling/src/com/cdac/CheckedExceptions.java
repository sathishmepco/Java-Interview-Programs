package com.cdac;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptions {
	
	public static void main(String[] args) throws FileNotFoundException {
		//this exception checked at compile time
		//handle this with try catch to compile the program
		FileReader filereader = new FileReader("FilePath");
		
		
		
	}

}
