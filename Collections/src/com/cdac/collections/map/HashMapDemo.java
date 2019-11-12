package com.cdac.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		//ADD
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(null, null);
		map.put(null, "Hello");
		map.put(4, "Hello");
		//only one null key allowed
		//duplicate keys are not allowed
		
		//CHECK OR CONTAIN
		boolean keyAvailable = map.containsKey(11);
		System.out.println("Is Key 11 is available :: "+keyAvailable);
		keyAvailable = map.containsKey(1);
		System.out.println("Is Key 1 is available :: "+keyAvailable);
		boolean valueAvailable = map.containsValue("Five");
		System.out.println("Is value Five available :: "+valueAvailable);
		
		//READ OR ITERATE
		String value = map.get(2);
		System.out.println("Value for the Key 2 is :: "+value);
		value = map.get(1);
		System.out.println("Value for the Key 1 is :: "+value);
		
		//SIZE AND ISEMPTY
		int mapSize = map.size();
		boolean isMapEmpty = map.isEmpty();
		System.out.println("Map Size is :: "+mapSize);
		System.out.println("Is the Map is empty :: "+isMapEmpty);
		
		//READ ALL THE KEYS
		System.out.println("Read All the Keys - ");
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()){
			Integer key = keyIterator.next();
			System.out.println(key);
		}
		
		System.out.println("All the records :: ");
		Iterator<Entry<Integer, String>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()){
			Entry<Integer, String>	entry = iterator.next();
			System.out.println("Key is : "+entry.getKey()+" value is :"+entry.getValue());
		}
		
		//READ ALL THE VALUES
		System.out.println("Read all the values - ");
		List<String> listValues = (List<String>) map.values();
		for(String val : listValues){
			System.out.println(val);
		}
		
		
	}
}