package com.cdac.collections.collectionsutils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsDemo {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("One");
		list.add("Two");
		list.add("One");
		
		Set<String> set = new HashSet<>();
		set.add("Three");
		set.add("Four");
		set.add("One");
		
		System.out.println(set);
		set.addAll(list);
		System.out.println(set);
		
		Collections.sort(list);
		System.out.println("Sort : "+list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("Reverse Order : "+list);
		
		String max = Collections.max(list);
		System.out.println("Max : "+max);
		String min = Collections.min(list);
		System.out.println("Min : "+min);
		
		List<Integer> iList = new ArrayList<>();
		iList.add(10);
		iList.add(20);
		iList.add(40);
		iList.add(30);
		
		int index = Collections.binarySearch(iList, 190);
		System.out.println("Binary Search index is : "+index);
		
		ArrayList<Integer> newList = new ArrayList<>();
		newList.add(11);
		newList.add(12);
		newList.add(13);
		newList.add(14);
		newList.add(15);
		Collections.copy(newList, iList); //newList should have the same size as src list
		System.out.println("Copied List : "+newList);
		
		Set<String> emptySet = Collections.emptySet();
		System.out.println("Empty Set : "+emptySet.size());
		//emptySet.add("Try");  //not allowed its immutable
		
		Collections.replaceAll(iList, 10, 100);
		System.out.println(iList);
		
		Collections.shuffle(iList);
		System.out.println(iList);
		
		Set<String> singletonSet = Collections.singleton("Java");
		System.out.println(singletonSet);
//		singletonSet.add("Hello"); //not supported its immutable

		Map<Integer, String> map = new HashMap<>();
		map = Collections.synchronizedMap(map);
	}
}