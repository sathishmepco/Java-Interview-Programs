package com.cdac.threads.synchronization2;

public class MessageSender {
	public void send(String message){
		System.out.println("Sending : "+message);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Message Sent : "+message);
	}
}