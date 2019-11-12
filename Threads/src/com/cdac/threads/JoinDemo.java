package com.cdac.threads;

public class JoinDemo {
	
	public static void main(String[] args) {
		GoodMorningThread thread1 = new GoodMorningThread();
		thread1.setName("Morning");
		
		GoodEveningThread runnable = new GoodEveningThread();
		Thread thread2 = new Thread(runnable);
		thread2.setName("Evening");
		
		thread1.start();
		try {
			thread1.join();
			//now thread1 will complete then only thread2 will start its execution
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread2.start();
		
		System.out.println("End of main Thread");
	}

}