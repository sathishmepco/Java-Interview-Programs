package com.cdac.collections.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
	
	public static void main(String[] args) {
		Vector<String> vector = new Vector<>();
		
		//ADD
		vector.add("ONE");
		vector.add("ONE");
		vector.addElement("ONE");
		
		//ADD ELEMENT AT INDEX
		vector.add(1, "ONE");
		
		//GET OR ITERATE
		String value = vector.get(1);
		String value2 = vector.elementAt(2);
		
		//DISPLAY THE ELEMENTS USING ITERATOR
		Enumeration<String> enumeration = vector.elements();
		while ( enumeration.hasMoreElements() ){
			String s = enumeration.nextElement();
			System.out.println(s);
		}

		//UPDATE OR SET
		vector.setElementAt("Hello", 0);
		vector.set(0, "Hello");
		
		//REMOVE
		vector.removeElementAt(1);
	}
}