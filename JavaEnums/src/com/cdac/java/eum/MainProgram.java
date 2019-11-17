package com.cdac.java.eum;

import java.util.EnumMap;
import java.util.EnumSet;

public class MainProgram {
	
	public static void main(String[] args) {
		

		/*//Enum Set
		EnumSet<Directions> enumSet = EnumSet.of(Directions.DOWN,Directions.UP);
		
		//Enum Map
		EnumMap<Directions, String> map = new EnumMap<>(Directions.class);
		map.put(Directions.LEFT, "Left");
		map.put(Directions.RIGHT, "right");*/
		
		//returns all the enum constants
		for(Directions d : Directions.values())
			System.out.println(d);
		
		//enum follows the order ( insertion order)
		//ordinal method returns the index in the enum constants
		Directions d1 = Directions.UP;
		int index = d1.ordinal();
		System.out.println(index);
		
		Directions left = Directions.valueOf("LEFT");
		System.out.println(left);
		
		System.out.println("Traffic Signals : ");
		for(TrafficSignal t : TrafficSignal.values())
			System.out.println(t.name()+" "+t.getAction()+" "+t.getCode());
	}
}