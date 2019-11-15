package com.cdac.collections.threadsafe;

import java.util.ArrayList;

public class StudentRunnable implements Runnable{

	ArrayList<String> names;
	
	public StudentRunnable(ArrayList<String> list) {
		this.names = list;
	}
	@Override
	public void run() {
		for(int i=100;i<200;i++)
			names.add("Student :: "+i);
	}

}