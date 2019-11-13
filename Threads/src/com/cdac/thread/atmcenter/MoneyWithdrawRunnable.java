package com.cdac.thread.atmcenter;

public class MoneyWithdrawRunnable implements Runnable{
	
	ATMCenter atmCenter;
	int amount;
	
	public MoneyWithdrawRunnable(ATMCenter atmCenter,int amount) {
		this.atmCenter = atmCenter;
		this.amount= amount;
	}
	
	@Override
	public void run() {
		synchronized (atmCenter) {
			atmCenter.withdraw(amount);
		}
	}
}