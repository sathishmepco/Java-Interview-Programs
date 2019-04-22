package com.cdac.generics;

import java.util.Date;

public class StringDB {
	
	public static void main(String[] args) {
		Database<String> db = new Database<>();
		db.set("Hello");
		String s = db.get();
		System.out.println(s);
		
		Database<Date> date = new Database<>();
		date.set(new Date());
//		String abc = (String)date.get();  // not ok
	}

}
