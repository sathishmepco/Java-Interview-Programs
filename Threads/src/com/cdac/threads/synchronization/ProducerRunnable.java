package com.cdac.threads.synchronization;

public class ProducerRunnable implements Runnable{

	Factory factory;
	public ProducerRunnable(Factory factory) {
		this.factory = factory;
	}
	
	@Override
	public void run() {
		factory.produce();
	}
}
