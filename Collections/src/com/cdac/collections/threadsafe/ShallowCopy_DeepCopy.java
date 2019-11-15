package com.cdac.collections.threadsafe;

import com.cdac.collections.bean.Student;

public class ShallowCopy_DeepCopy {
	public static void main(String[] args) throws CloneNotSupportedException {
		//Shallow copy
		Student s1 = new Student(101, "Atul", 80);
		Student s2 = s1;
		s2.setMarks(85);
		System.out.println("Shallow Copy");
		System.out.println(s2.getMarks()+" "+s1.getMarks());
		
		Student s3 = (Student) s1.clone();
		s3.setMarks(90);
		System.out.println("Deep Copy");
		System.out.println(s3.getMarks() +" "+s1.getMarks());
	}
}