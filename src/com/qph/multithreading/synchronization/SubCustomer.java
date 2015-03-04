package com.qph.multithreading.synchronization;

public class SubCustomer extends Customer{

	private SubCustomer(int amount) {
		super(amount);
		// TODO Auto-generated constructor stub
	}
	
	int getInt(){
		return 2;
	}
	int getInt(int... a){
		return 3;
	}
	int getInt(int a){
		return 4;
	}
	public static void main(String[] args) {
		
		SubCustomer a1 = new SubCustomer(100);
		
		System.out.println(a1.getInt(1));
	}

}
