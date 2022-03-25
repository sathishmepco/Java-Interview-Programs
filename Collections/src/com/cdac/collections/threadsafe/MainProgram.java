package com.cdac.collections.threadsafe;
import java.util.ArrayList;
// import com.cdac.collections.bean.Student;
// Applying move method run to main program, decreases the complexity of tread running
public class MainProgram  implements Runnable
{
	public static void main(String[] args)  throws CloneNotSupportedException {

		Thread t1 = new Thread();
		Thread t2 = new Thread();
		
		t1.start();
		t2.start();
		ArrayList<String> list = new ArrayList<>();
		EmployeeRunnable employeeRunnable = new EmployeeRunnable(list);
		StudentRunnable studentRunnable = new StudentRunnable(list);
		
	
	}
	public void run() 
	{
		ArrayList<String> Employeenames = null;
		ArrayList<String> Studentnames = null;
				for(int i=0;i<100;i++)
				{
					Employeenames.add("Employee :: "+i);
				}
				for(int j =100; j<200;j++)
				{
					Studentnames.add("Student :: "+j);
				}
				
	}

}
//  class EmployeeRunnable implements Runnable
//  {

// 	ArrayList<String> names;
	
// 	public EmployeeRunnable(ArrayList<String> list) {
// 		this.names = list;
// 	}
	
// 	@Override
// 	public void run() {
// 		for(int i=0;i<100;i++)
// 			names.add("Employee :: "+i);
// 	}
// }

//  class StudentRunnable implements Runnable
//  {

// 	ArrayList<String> names;
	
// 	public StudentRunnable(ArrayList<String> list) {
// 		this.names = list;
// 	}
// 	@Override
// 	public void run() {
// 		for(int i=100;i<200;i++)
// 			names.add("Student :: "+i);
// 	}

