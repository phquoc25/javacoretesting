package com.qph.multithreading.synchronization;

public class DeadLockTesting {
	
	public static void main(String[] args) {
		final String resource1 = "Quoc PHAN";
		final String resource2 = "Chieu LUU";
		Thread t1 = new Thread(){
			@Override
			public void run() {
				synchronized (resource1) {
					System.out.println("Resource1 is locked by thread 1");
					try {
						Thread.sleep(4000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				synchronized (resource2) {
					System.out.println("Resource2 is locked by thread 1");
					try {
						Thread.sleep(400);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		Thread t2 = new Thread(){
			@Override
			public void run() {
				synchronized (resource2) {
					System.out.println("Resource2 is locked by thread 2");
					try {
						Thread.sleep(4000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				synchronized (resource1) {
					System.out.println("Resource1 is locked by thread 2");
					try {
						Thread.sleep(400);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};

		t1.start();
		t2.start();
	}

}
