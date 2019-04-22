package com.cdac.generics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class GenericCollectionDisplayMain {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Perl");
		list.add("PHP");
		list.add("Dot Net");
		System.out.println("Reading elements from List :: ");
		GenericCollectionDisplay.display(list);
		
		HashSet<Integer> set = new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		System.out.println("Reading elements from Set :: ");
		GenericCollectionDisplay.display(set);
		
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.addAll(list);
		System.out.println("Reading elements from TreeSet :: ");
		GenericCollectionDisplay.display(treeSet);
	}
}