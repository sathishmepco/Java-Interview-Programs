package com.cdac.threads;

public class GoodMorningThread extends Thread{
	@Override
	public void run() {
		super.run();
		Thread curThread = Thread.currentThread();
		String name = curThread.getName();
		for(int i=0;i<10;i++){
			System.out.println(name+" :: Good Morning !");
		}
	}
}
