package com.java.singleton;

public class Account {
	
	private int balance;
	private static Account instance = null;
	
	private Account(){
		balance = 0;
	}
	
	public static Account getInstance(){
		if( instance == null)
			instance = new Account();
		return instance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void addBalance(int balance){
		this.balance += balance;
	}
	
	public int getBalance() {
		return balance;
	}
}