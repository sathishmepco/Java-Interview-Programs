package com.cdac.threads.deadlock;

public class DeadLock2 {
	public static void main(String[] args) throws InterruptedException {
		DeadLockRunnable runnable = new DeadLockRunnable();
		Thread t1 = new Thread(runnable);
		t1.start();
		t1.join();
		System.out.println("End of Main Thread");
	}
}