package com.cdac.thread.atmcenter;

public class ATMCenter {
	public void withdraw(int amount){
		String name = Thread.currentThread().getName();
		System.out.println("Entered into ATM center : "+name);
		System.out.println("Taking the money : "+amount);
		try {
			Thread.sleep(1000);
			System.out.println("Transaction completed : "+amount);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Exit from the ATM center : "+name);
	}
}