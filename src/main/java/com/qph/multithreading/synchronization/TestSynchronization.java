package com.qph.multithreading.synchronization;

public class TestSynchronization extends Customer{
	
	public TestSynchronization(int amount) {
		super(amount);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		String [] as = new String[3];
		assert (1<0):"false";
		
		try{
			badMethod();
			System.out.println("A");
		}catch(Exception e){
			System.out.println("B");
		}finally{
			System.out.println("C");
		}
		System.out.println("D");
	}

	private static void badMethod() {
		throw new RuntimeException();
		
	}
	
	
}
