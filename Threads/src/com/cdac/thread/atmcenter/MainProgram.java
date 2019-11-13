package com.cdac.thread.atmcenter;

public class MainProgram {
	
	public static void main(String[] args) {
		ATMCenter atmCenter = new ATMCenter();

		MoneyWithdrawRunnable runnable1 = new MoneyWithdrawRunnable(atmCenter, 500);
		MoneyWithdrawRunnable runnable2 = new MoneyWithdrawRunnable(atmCenter, 1000);
		MoneyWithdrawRunnable runnable3 = new MoneyWithdrawRunnable(atmCenter, 50000);
		
		Thread t1 = new Thread(runnable1);
		t1.setName("Sathish");
		Thread t2 = new Thread(runnable2);
		t2.setName("Ranjit");
		Thread t3 = new Thread(runnable3);
		t3.setName("Raakesh");
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
/*
	OUTPUT
	
	Entered into ATM center : Sathish
	Taking the money : 500
	Transaction completed : 500
	Exit from the ATM center : Sathish
	
	Entered into ATM center : Raakesh
	Taking the money : 50000
	Transaction completed : 50000
	Exit from the ATM center : Raakesh
	
	Entered into ATM center : Ranjit
	Taking the money : 1000
	Transaction completed : 1000
	Exit from the ATM center : Ranjit

*/