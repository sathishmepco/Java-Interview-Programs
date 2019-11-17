package com.cdac.java.eum;

public enum Directions{

	LEFT(1),
	RIGHT(2),
	UP(3),
	DOWN(4);
	
	private final int dirCode;
	private Directions(int dirCode){
		this.dirCode = dirCode;
		System.out.println("Constructor called "+this.toString());
	}
	
	public int getDirCode(){
		return dirCode;
	}
}
