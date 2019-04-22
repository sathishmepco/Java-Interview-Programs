package com.cdac.threads.synchronization2;

public class MessageSenderMain {
	
	public static void main(String[] args) {
		MessageSender sender = new MessageSender();
		
		Thread t1 = new Thread(new SenderRunnable(sender, "Hi"));
		Thread t2 = new Thread(new SenderRunnable(sender, "Hello"));
		Thread t3 = new Thread(new SenderRunnable(sender, "Good Morning"));
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}