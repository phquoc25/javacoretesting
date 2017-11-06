package com.qph.multithreading.synchronization;

public class ThreadCommunication {

	public static void main(String[] args) {
		class Hello{
			
		}
		Boolean test[] = new Boolean[3];
		boolean a = test[1];
		System.out.println();
		final Customer customer = new Customer(100);
		Thread withdrawThread = new Thread(){
			@Override
			public void run() {
				customer.withdraw(150);
			}
		};
		
		Thread depositThread = new Thread(){
			@Override
			public void run() {
				customer.deposite(100);
			}
		};
		
		withdrawThread.start();
		depositThread.start();
	}
}
