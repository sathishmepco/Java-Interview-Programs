package com.cdac.collections.set;

import java.util.Iterator;
import java.util.TreeSet;

public class StringSetDemo {
	
	public static void main(String[] args) {
		StringLengthComparator comparator = new StringLengthComparator();
		TreeSet<String> stringSet = new TreeSet<>(comparator);
		
		stringSet.add("one");
		stringSet.add("four");
		stringSet.add("hundred");
		stringSet.add("c");
		stringSet.add("seven");
		
		Iterator<String> iterator = stringSet.iterator();
		while( iterator.hasNext() )
			System.out.println(iterator.next());
		
	}

}
/*
	OUTPUT
	
	c
	one
	four
	seven
	hundred

*/