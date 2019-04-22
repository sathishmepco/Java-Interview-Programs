package com.cdac.threads.deadlock;

public class DeadLock1 {
	
	public static void main(String[] args) throws InterruptedException {
		//here current thread is Main Thread
		Thread.currentThread().join();	
	}
}