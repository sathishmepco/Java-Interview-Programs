package com.cdac.java.eum;

public enum TrafficSignal {
	
	RED("STOP",1),GREEN("GO",2),ORANGE("SLOW DOWN",3);
	
	private String action;
	private int code;
	private TrafficSignal(String action,int code){
		this.action = action;
		this.code = code;
	}
	
	public String getAction(){
		return action;
	}
	
	public int getCode(){
		return code;
	}
	
}
