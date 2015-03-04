package com.qph.multithreading;

public class WorkerThread implements Runnable{
	
	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public WorkerThread(String message) {
		this.message = message;
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "(Start) message = " + message);
		processMessage();
		System.out.println(Thread.currentThread().getName() + "(End)");
	}

	private void processMessage() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
