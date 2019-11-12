package com.cdac.threads.synchronization;

public class Factory {
	
	int current = 0;
	Object lock = new Object();
	
	public void produce(){
		synchronized (lock) {
			System.out.println("Producer is called");
			while(current < 3){
				current++;
				System.out.println("Producing the Item : "+current);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Production is done!");
			lock.notifyAll();
		}
	}
	
	public void consume(){
		synchronized (lock) {
			System.out.println("Consumer is called !");
			try {
				if(current <= 0 ){
					System.out.println("No item is available to consume, going to wait state");
					lock.wait();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			while(current > 0){
				System.out.println("Consuming the item : "+current);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				current--;
			}
			System.out.println("Consumed all the items");
		}
	}
}
