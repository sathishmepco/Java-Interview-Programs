package com.cdac.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import com.cdac.collections.bean.Student;

public class HashSetDemo {
	
	public static void main(String[] args) {
		HashSet<Integer> nosList = new HashSet<>();
		//ADD
		nosList.add(10);
		nosList.add(20);
		nosList.add(30);
		nosList.add(null);
		
		//Adding duplicate element will be ignored
		nosList.add(40);
		
		//SIZE AND EMPTY
		int size = nosList.size();
		boolean emptyState = nosList.isEmpty();
		
		//CHECK AVAILABILITY OF AN ELEMENT
		boolean contains = nosList.contains(40);
		
		//Remove element by Object
		boolean isRemoved = nosList.remove(10);
		
		//Remove all elements
		nosList.clear();
		
		//Read all elements using Iterator
		Iterator<Integer> iterator = nosList.iterator();
		while(iterator.hasNext()){
			int element = iterator.next();
			System.out.println(element);
		}
	}
	
	public static void studentsSet(){
		HashSet<Student> students = new HashSet<>();
		Student s1 = new Student(101,"Sathish",350);
		Student s2 = new Student(102, "Atul",450);
		Student s3 = new Student(101,"Sathish",350);
		
		//s1 and s3 are different, because s1 and s3 are having different hashCode() values
		students.add(s1);
		students.add(s2);
		students.add(s3);

		System.out.println("Student Set size : "+students.size());
		//override hascode method to overcome the abvoe problem
	}
}