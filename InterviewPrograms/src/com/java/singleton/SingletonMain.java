package com.java.singleton;

public class SingletonMain {
	
	public static void main(String[] args) {
		Account donateAcnt1 = Account.getInstance();
		donateAcnt1.setBalance(10000);
		System.out.println("Balance in Donation account is : "+donateAcnt1.getBalance());
		getDonation();
	}
	
	public static void getDonation(){
		Account account = Account.getInstance();
		account.addBalance(25000);
		System.out.println("New balance in Donation account is : "+account.getBalance());
	}
}