package com.cdac.fileio.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {
	
	public static void main(String[] args) throws IOException {
		String content = "Welcome to DAC Course!";
		writeToFile(content);
		readFromFile();
	}
	
	public static void writeToFile(String content){
		String filePath = "D:\\byteStream.txt";
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(filePath);
			fos.write(content.getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}
	}
	
	public static void readFromFile(){
		String filePath = "D:\\byteStream.txt";
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(filePath);
			byte[] buffer = new byte[fis.available()];
			fis.read(buffer);
			String fileContent = new String(buffer);
			System.out.println("File Content is : "+fileContent);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}
	}
}