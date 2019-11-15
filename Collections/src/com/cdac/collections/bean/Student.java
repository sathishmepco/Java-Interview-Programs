package com.cdac.collections.bean;

public class Student implements Comparable<Student>,Cloneable{
	
	private int rollNo;
	private String name;
	private int marks;
	
	public Student(){
		rollNo = -1;
		name = "";
		marks = 0;
	}

	public Student(int rollNo, String name,int marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return rollNo+" "+name+" "+marks;
	}

	@Override
	public int compareTo(Student o) {
		return this.rollNo - o.rollNo;
		//DECREASING ORDER BY ROLL NO
//		return o.rollNo - this.rollNo ;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}