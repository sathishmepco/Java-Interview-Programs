package com.cdac.threads.synchronization2;

public class SenderRunnable implements Runnable{
	
	MessageSender sender;
	String message;
	
	public SenderRunnable(MessageSender sender, String message) {
		this.sender = sender;
		this.message = message;
	}
	
	@Override
	public void run() {
		synchronized (sender) {
			sender.send(message);
		}
	}
}