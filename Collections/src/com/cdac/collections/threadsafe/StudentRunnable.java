package com.cdac.collections.threadsafe;

import java.util.ArrayList;

public class StudentRunnable 
{
	ArrayList<String> names;
	public StudentRunnable(ArrayList<String> list) 
	{
		this.names = list;
	}
}
//run method moved to MainProgram.java 