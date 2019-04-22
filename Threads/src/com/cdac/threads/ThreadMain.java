package com.cdac.threads;

public class ThreadMain {
	public static void main(String[] args) {
		
		GoodMorningThread thread1 = new GoodMorningThread();
		thread1.setName("Morning");
		
		GoodEveningThread runnable = new GoodEveningThread();
		Thread thread2 = new Thread(runnable);
		thread2.setName("Evening");
		
		thread1.start();
		thread2.start();
		
		System.out.println("End of main Thread");
	}

}
