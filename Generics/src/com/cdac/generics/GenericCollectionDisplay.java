package com.cdac.generics;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class GenericCollectionDisplay {
	public static void display(Collection<?> list){
		Iterator<?> iterator = list.iterator();
		while( iterator.hasNext()){
			Object obj = iterator.next();
			System.out.println(obj);
		}
	}
}