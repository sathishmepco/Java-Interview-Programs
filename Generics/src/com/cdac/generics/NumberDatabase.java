package com.cdac.generics;

public class NumberDatabase<T extends Number> {
	//this class supports objects from only Number 
	//( type of objects should be extended Number class)
	T object;
	
	public void set(T t){
		this.object = t;
	}
	
	public T get(){
		return object;
	}

}