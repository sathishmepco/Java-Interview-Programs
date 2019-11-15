package com.cdac.collections.threadsafe;

import java.util.ArrayList;

import com.cdac.collections.bean.Student;

public class MainProgram {
	public static void main(String[] args) throws CloneNotSupportedException {
		ArrayList<String> list = new ArrayList<>();
		EmployeeRunnable employeeRunnable = new EmployeeRunnable(list);
		StudentRunnable studentRunnable = new StudentRunnable(list);
		
		Thread t1 = new Thread(employeeRunnable);
		Thread t2 = new Thread(studentRunnable);
		
		t1.start();
		t2.start();
		
				
				
	}
}