package com.cdac.collections.set;

import java.util.Comparator;

//This comparator, compares and sorts the string based on the LENGTH 
//of the string.
public class StringLengthComparator implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		if(o1.length() > o2.length())
			return 1;
		if(o1.length() < o2.length())
			return -1;
		return 0;
	}
}