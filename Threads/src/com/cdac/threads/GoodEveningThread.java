package com.cdac.threads;

public class GoodEveningThread implements Runnable{
	@Override
	public void run() {
		Thread curThread = Thread.currentThread();
		String name = curThread.getName();
		for(int i=0;i<10;i++){
			System.out.println(name+" :: Good Evening !");
		}
	}
}