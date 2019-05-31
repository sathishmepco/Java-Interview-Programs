package com.cdac.customexception;

public class StudentDB {
Student[] students;
	
	public StudentDB() {
		students = new Student[3];
		Student s1 = new Student(1,"Name1");
		Student s2 = new Student(2,"Name2");
		Student s3 = new Student(3,"Name3");
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
	}
	
	public Student getStudent(int rollNo) throws StudentNotFoundException{
		for(int i=0;i<students.length;i++)
			if(rollNo == students[i].getRollNo())
				return students[i];
		throw new StudentNotFoundException("Student Record not found");
	}

}