package com.cdac.nio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NioBasicDemo {
	
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("D:/a.txt");
		Path path2 = Paths.get("D:\\c.txt");

		//FILE EXISTANCE
		System.out.println(Files.exists(path));
		System.out.println(Files.notExists(path));
		System.out.println("File exist : "+Files.exists(path2));
		
		//IS READABLE IS WITABLE
		System.out.println("Regular file : "+Files.isRegularFile(path));
		System.out.println("Is Readable : "+Files.isReadable(path));
		System.out.println("Is Writable : "+Files.isWritable(path));
		System.out.println("Is executable : "+Files.isExecutable(path2));
		
		//IS BOTH FILE SAME OR NOT
//		System.out.println("Is same file : "+Files.isSameFile(path, path2));
		
		//FILE CREATION
//		System.out.println("Create file : "+Files.createFile(path2)); throws excetpion
//		Files.createFile(path); // trhows Exceptions
		/*Files.createDirectories(path);
		Files.createTempDirectory(path.toString());
		Files.createFile(path);
		Files.createTempFile(path,"abc",".txt");*/

//		DELETE
//		Files.delete(path2);   //throws exception if not exist
		//System.out.println("Removing a file : "+Files.deleteIfExists(path2));
		
		//FILE COPY
//		Files.copy(path, path2);  //throws exception  file should not be available
//		Files.copy(path, path2, StandardCopyOption.REPLACE_EXISTING);

		//MOVING FILES
//		Files.move(path, path2); // throws exception
//		Files.move(path, path2, StandardCopyOption.REPLACE_EXISTING); file a replace b, file a deleted
		
		
		//READ FILES
		byte[] buffer = Files.readAllBytes(path);
		System.out.println("Read by bytes :: "+new String(buffer));
		List<String> lines = Files.readAllLines(path);
		System.out.println(lines);
/*		BufferedReader br = Files.newBufferedReader(path2);
		br.readLine();
		br.close();*/
		
		//WRITE FILES
		String content = "Good night";
		Files.write(path2, content.getBytes());
		Iterable<String> listLines  = Arrays.asList("Hello","Hi");
		Files.write(path2, listLines, StandardOpenOption.CREATE);
		BufferedWriter bw = Files.newBufferedWriter(path2,StandardOpenOption.APPEND);
		bw.write("Home Work");
		bw.close();
	}
}