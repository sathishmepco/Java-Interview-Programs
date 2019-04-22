package com.cdac.fileio.bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		writeObject();
		readObject();
	}
	
	public static void writeObject() throws IOException{
		Employee e = new Employee();
		e.setEmpId(1100);
		e.setName("Sathish");
		e.setSalary(50000);
		
		FileOutputStream fos = new FileOutputStream("D:\\empobject.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e);
		oos.close();
		fos.close();
		System.out.println("Object successfully saved in the disk.");
	}
	
	public static void readObject() throws IOException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream("D:\\empobject.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee e = (Employee) ois.readObject();
		ois.close();
		fis.close();
		System.out.println("Employee Details : "+e);
	}
}
