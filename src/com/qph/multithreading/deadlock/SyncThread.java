package com.qph.multithreading.deadlock;

public class SyncThread implements Runnable{
	
	private Object obj1;
	private Object obj2;
	
	public SyncThread(Object obj1, Object obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println("Acquiring the lock on " + obj1);
		synchronized (obj1) {
			System.out.println("Acquired the lock on " + obj1);
			work();
			System.out.println("Acquiring the lock on " + obj2);
			synchronized (obj2) {
				System.out.println("Acquired the lock on " + obj2);
				work();
			}
			System.out.println("Released lock on " + obj2);
		}
		System.out.println("Released lock on " + obj1);
		System.out.println("Finished execution.");
	}

	private void work() {
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
