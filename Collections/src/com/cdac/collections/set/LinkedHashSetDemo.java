package com.cdac.collections.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	
	public static void main(String[] args) {
		
		LinkedHashSet<String> set = new LinkedHashSet<>();
		
		//ADD ELEMENTS
		set.add("Android");
		set.add("Android");
		set.add("Windows");
		
		//SIZE AND ISEMPTY
		int size = set.size();
		boolean emptyState = set.isEmpty();
		
		//CHECK AVAILABILITY OF AN ELEMENT
		boolean isAvailable = set.contains("iOS");
		
		//GET AND RETRIEVAL
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()){
			String element = iterator.next();
			System.out.println(element);
		}
		
		//REMOVE THE GIVEN ELEMENT
		boolean isRemoved = set.remove("Android");
		
		//REMOVE ALL THE ELEMENTS
		set.clear();
	}
}