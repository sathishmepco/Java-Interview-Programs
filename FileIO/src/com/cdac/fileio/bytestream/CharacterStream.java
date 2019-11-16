package com.cdac.fileio.bytestream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.CharBuffer;

public class CharacterStream {
	
	public static void main(String[] args) throws IOException {
		String content = "Hi -1 Good morning!";
		writeToFile(content);
		readFromFile();
	}
	
	public static void writeToFile(String content){
		String filePath = "D:\\char-based-stream.txt";
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(filePath);
			fileWriter.write(content);
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}
	}
	
	public static void readFromFile(){
		String filePath = "D:\\char-based-stream.txt";
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(filePath);
			int i;
			while ( (i = fileReader.read()) != -1){
				char ch = (char) i;
				System.out.print(ch);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}
	}
}