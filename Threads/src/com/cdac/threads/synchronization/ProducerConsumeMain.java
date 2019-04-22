package com.cdac.threads.synchronization;

public class ProducerConsumeMain {
	public static void main(String[] args) {
		Factory factory = new Factory();
		
		ProducerRunnable producer = new ProducerRunnable(factory);
		ConsumerRunnable consumer = new ConsumerRunnable(factory);
		
		Thread producerThread = new Thread(producer);
		Thread consumerThread = new Thread(consumer);
		
		consumerThread.start();
		producerThread.start();
	}
}
