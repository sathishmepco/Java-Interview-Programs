package com.cdac.collections.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		ArrayList<String> osList = new ArrayList<>();
		
		//ADD
		osList.add("Android");
		osList.add("iOS");
		osList.add("Windows");
		
		//ADD ELEMENT AT INDEX
		osList.add(0, "Linux");

		//GET THE SIZE OF ARRAYLIST
		int size = osList.size();
		System.out.println("Size of the list is : "+size);
		
		//DISPLAY THE ELEMENTS USING 'FOR' LOOP
		for(int i=0;i<osList.size();i++)
			System.out.println("Item at "+i+" is "+osList.get(i));
		
		//DISPLAY THE ELEMENTS USING ITERATOR
		Iterator<String> iterator = osList.iterator();
		while( iterator.hasNext() ){
			String countryName = iterator.next();
			System.out.println(countryName);
		}
		
		//REMOVE ELEMENT BY INDEX
		osList.remove(0);
		
		//REMOVE BY OBJECT
		osList.remove("ABCD");

		//CHECK LIST IS EMPTY OR NOT
		boolean emptyState = osList.isEmpty();
		
		//UPDATE THE VALUE
		osList.set(0, "Android");
		
		//to check whether an item is available in the list
		System.out.println("Does list contains Android :: "+osList.contains("iOS"));

		//to get the index of an item
		System.out.println("Index of Android :: "+osList.indexOf("Android"));
		System.out.println("Last Index of Android : "+osList.lastIndexOf("Android"));
		
		System.out.println(osList.toString());
	}
}