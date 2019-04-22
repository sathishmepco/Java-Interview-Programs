package com.cdac.threads.synchronization;

public class ConsumerRunnable implements Runnable{

	Factory factory;
	public ConsumerRunnable(Factory factory) {
		this.factory = factory;
	}
	
	@Override
	public void run() {
		factory.consume();
	}

}
