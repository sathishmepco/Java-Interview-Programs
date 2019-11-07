package com.cdac.customexception;

public class StudentMain {
	
	public static void main(String[] args) {
		StudentDB database = new StudentDB();
		try {
			//there is no record for rollno 6
			//so the code will throw exception
			Student s = database.getStudent(6);
			System.out.println("Student name is :"+s.getName());
		} catch (StudentNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}