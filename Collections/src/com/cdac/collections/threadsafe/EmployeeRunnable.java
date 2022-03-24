package com.cdac.collections.threadsafe;

import java.util.ArrayList;

public class EmployeeRunnable 
{ 

	ArrayList<String> names;
	
	public EmployeeRunnable(ArrayList<String> list) {
		this.names = list;
	}
	

}
//run method moved to MainProgram.java 