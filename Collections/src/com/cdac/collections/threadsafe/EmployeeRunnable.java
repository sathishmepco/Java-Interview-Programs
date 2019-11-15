package com.cdac.collections.threadsafe;

import java.util.ArrayList;

public class EmployeeRunnable implements Runnable{

	ArrayList<String> names;
	
	public EmployeeRunnable(ArrayList<String> list) {
		this.names = list;
	}
	
	@Override
	public void run() {
		for(int i=0;i<100;i++)
			names.add("Employee :: "+i);
	}
}