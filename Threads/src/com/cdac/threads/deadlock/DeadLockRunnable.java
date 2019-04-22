package com.cdac.threads.deadlock;

public class DeadLockRunnable implements Runnable
{
	@Override
	public void run() {
		System.out.println("Dead Lock Thread Start ");
		try {
			Thread.currentThread().join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Dead Lock Thread End");
	}
}
