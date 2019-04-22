package com.cdac.collections.set;

import java.util.Iterator;
import java.util.TreeSet;

import com.cdac.collections.bean.Student;

public class StudentsTreeSet {
	public static void main(String[] args) {

		Student s1 = new Student(102,"Sathish",350);
		Student s2 = new Student(104,"Atul",450);
		Student s3 = new Student(105,"Maturi",400);
		Student s4 = new Student(103,"Amit",600);
		
		//This tree set sorts the students by roll number (natural sorting order)
		TreeSet<Student> setByRollNo = new TreeSet<>(); 
		setByRollNo.add(s1);
		setByRollNo.add(s2);
		setByRollNo.add(s3);
		setByRollNo.add(s4);
		
		System.out.println("Students sorted by Roll Number :: ");
		Iterator<Student> iteratorByRollNo = setByRollNo.iterator();
		while( iteratorByRollNo.hasNext() ){
			Student student = iteratorByRollNo.next();
			System.out.println(student);
		}
		
		//This tree set sorts the students by name
		NameComparator nameComparator = new NameComparator();
		TreeSet<Student> setByName = new TreeSet<>(nameComparator);
		setByName.addAll(setByRollNo);
		
		System.out.println("Students sorted by Name :: ");
		Iterator<Student> iteratorByName = setByName.iterator();
		while( iteratorByName.hasNext() ){
			Student student = iteratorByName.next();
			System.out.println(student);
		}
		
		//This tree set sorts the students by marks
		MarksComparator marksComparator = new MarksComparator();
		TreeSet<Student> setByMarks = new TreeSet<>(marksComparator);
		setByMarks.addAll(setByRollNo);
		
		System.out.println("Students sorted by Marks :: ");
		Iterator<Student> iteratorByMarks = setByMarks.iterator();
		while( iteratorByMarks.hasNext() ){
			Student student = iteratorByMarks.next();
			System.out.println(student);
		}
	}
}