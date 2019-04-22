package com.cdac.collections.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		LinkedList<String> osList = new LinkedList<>();
		
		//ADD ELEMENTS
		osList.add("Android");
		osList.add("iOS");
		osList.add("Windows");
		
		//ADD AT GIVEN INDEX
		osList.add(1, "MacOS");
		
		//ADD USIGN SPECIAL METHODS
		osList.addFirst("Linux");
		osList.addLast("WebOS");

		
		//GET ELEMENT
		String firstElt = osList.getFirst();
		String lastElt = osList.getLast();
		String eltAtZero = osList.get(0);
		
		//GET ELEMETNS USING PEEK AND POLL
		System.out.println("Peek : "+osList.peek());
		System.out.println("Peek First : "+osList.peekFirst());
		System.out.println("Peek Last : "+osList.peekLast());
		
		System.out.println("Poll : "+osList.poll());
		System.out.println("Poll First : "+osList.pollFirst());
		System.out.println("Poll Last : "+osList.pollLast());
		
		//GET ALL ELEMENTS USING ITERATOR
		Iterator<String> iterator = osList.iterator();

		System.out.println("Iterating elements using List Iterator :: ");
		//GET ALL ELEMENTS USING LIST ITERATOR
		ListIterator<String> listIterator = osList.listIterator();
		while(listIterator.hasNext()){
			String element = listIterator.next();
			System.out.println(element);
		}		
		
		//Removes first Element
		String elt = osList.remove();
		
		//Removes element at given index
		elt = osList.remove(2);
		
		//Removes First Element
		elt = osList.removeFirst();
		
		//Removes Last Element
		osList.removeLast();
	}
}