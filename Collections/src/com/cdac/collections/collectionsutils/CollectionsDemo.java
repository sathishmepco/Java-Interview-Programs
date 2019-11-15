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
		
		//Binary Search in List Collection
		int index = Collections.binarySearch(iList, 190);
		System.out.println("Binary Search of 190 index is : "+index);
		
		//Copy one list to another list
		//It does not create new list
		//It copies the values into the new list indexs
		ArrayList<Integer> newList = new ArrayList<>();
		newList.add(11);
		newList.add(12);
		newList.add(13);
		newList.add(14);
		newList.add(15);
		//newList should have minimum size as iList
		Collections.copy(newList, iList); 
		System.out.println("Copying the list from another list : "+newList);

		//Creating Immutable Collection
		Set<String> emptySet = Collections.emptySet();
		List<String> emptyList = Collections.emptyList();
		Map<String, String> emptyMap = Collections.emptyMap();
		System.out.println("Creating immutable collection (list, set, map)");
		System.out.println("Empty Set : "+emptySet.size());
		//emptySet.add("Try");  //not allowed its immutable
		
		//replacing all the elements with the new value
		Collections.replaceAll(iList, 10, 100);
		System.out.println("Replacing all the 10 in the list with 100 :");
		System.out.println(iList);
		
		//shuffling the list
		Collections.shuffle(iList);
		System.out.println("Shuffle the Elements in the List : ");
		System.out.println(iList);
		
		//Creating singleton Collection Set, List, Map
		Set<String> singletonSet = Collections.singleton("Java");
		System.out.println("Creating singleton Collection : ");
		System.out.println(singletonSet);
//		singletonSet.add("Hello"); //not supported its immutable

		//Creating synchronized Collection List, Set, Map
		Map<Integer, String> map = new HashMap<>();
		map = Collections.synchronizedMap(map);
		System.out.println("Creating synchronizing Collection : ");
	}
}