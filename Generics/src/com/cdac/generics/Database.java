package com.cdac.generics;

public class Database<T> {
	T object;
	public void set(T t){
		this.object = t;
	}
	
	public T get(){
		return object;
	}
}