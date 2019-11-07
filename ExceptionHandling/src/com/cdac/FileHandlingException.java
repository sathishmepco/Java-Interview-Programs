package com.cdac;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingException {

	public static void main(String[] args) {
		try {
			File file = new File("D:\\abc.txt");
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			bufferedReader.readLine();
			bufferedReader.close();
			System.out.println("End of the program!");
		} catch (FileNotFoundException e) {
			//when the file is not available in the path
			//this exception will be thrown
			e.printStackTrace();
		} catch (IOException e) {
			//when there is an issue in input/output of the file
			//this exception will be thrown
			e.printStackTrace();
		}
	}
}