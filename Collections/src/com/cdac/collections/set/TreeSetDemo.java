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
		
		//SEARCH OR CONTAINS
		set.contains("India");
		
		//READ OR ITERATE
		String minElement = set.first();	//lowest element
		String maxElement = set.last();		//highest element
		String nextMax = set.higher("India");	//strictly highest than India
		String nextMin = set.lower("India");		//strictly lower than India

		//Iterate all elements using Iterator
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()){
			iterator.next();
		}
		
		//SIZE AND EMPTY STATE
		int size = set.size();
		boolean emptyState = set.isEmpty();
		
		//REMOE THE GIVEN ELEMENT
		boolean isRemoved = set.remove("China");
		
		//REMVOE ALL THE ELEMENTS
		set.clear();
	}
}