package com.cdac.collections.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		
		//ADD
		set.add("India");
		set.add("Pakistan");
		set.add("China");
		set.add("US");
		set.add("Australia");
		
		//SEARCH OR CONTAINS
		set.contains("India");
		
		//READ OR ITERATE
		//lowest element - first element in the set
		String minElement = set.first();	
		//highest element - last element in the set
		String maxElement = set.last();		
		
		//Iterate all elements using Iterator
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()){
			System.out.println(iterator.next()); 
			
		}
		
		//SIZE AND EMPTY STATE
		int size = set.size();
		boolean emptyState = set.isEmpty();
		
		//REMOE THE GIVEN ELEMENT
//		boolean isRemoved = set.remove("China");
		
		System.out.println(set);
		
		//READS THE FIRST ELEMENT AND REMOVES IT
		String pollFirst = set.pollFirst();
		System.out.println("Poll First [First value] : "+pollFirst);
		
		//READS AND REMOVES THE LAST ELEMENT
		String pollLast = set.pollLast();
		System.out.println("Poll Last [Last value] : "+pollLast);
		
		//strictly highest than India
		String nextMax = set.higher("India");
		System.out.println("Highest value {India} is : "+nextMax);
		
		//strictly lower than India
		String nextMin = set.lower("India");
		System.out.println("Lowest value {India} is : "+nextMin);

		//returns the next maximum to "High", the output is "India"
		String ceilingValue = set.ceiling("High");
		System.out.println("Ceiling value {High} is : "+ceilingValue);
		
		String floorValue = set.floor("China");
		System.out.println("Floor value {China} is : "+floorValue);
		
		//REMVOE ALL THE ELEMENTS
		set.clear();
	}
}