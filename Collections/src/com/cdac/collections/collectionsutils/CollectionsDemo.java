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
		System.out.println("Initial List");
		System.out.println(list);
		
		Set<String> set = new HashSet<>();
		set.add("Three");
		set.add("Four");
		set.add("One");
		System.out.println("Initial Set");
		System.out.println(set);
		
		//Adding all list elements to Set Collection
		set.addAll(list);
		System.out.println("Adding list to set collection");
		System.out.println(set);
		
		//Adding array values to List Collection
		String strArray[] = {"ABC","acb"};
		Collections.addAll(list, strArray);
		System.out.println("Adding Array values to List collection ");
		System.out.println(list);

		//sorting the List Collection
		Collections.sort(list);
		System.out.println("Sorting the List : ");
		System.out.println(list);
		
		//sorting the list with comparator - reverse order
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("Reverse Order : ");
		System.out.println(list);
		
		String max = Collections.max(list);
		System.out.println("Max Element in the List : "+max);
		String min = Collections.min(list);
		System.out.println("Min Element in the List : "+min);
		
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
