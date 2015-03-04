package com.qph.multithreading.synchronization;

public class Customer implements ICustomer {
	
	static Float f = new Float("12");
	int amount;

	public Customer(int amount) {
		this.amount = amount;
	}

	public static void main(String[] args) {
		/*int i;
		Customer c = new Customer(100);
		i=c.k;
		i=Customer.k;
		i=ICustomer.k;*/
	}
	
	int getInt(){
		return 1;
	}

	@Override
	public void withdraw(int amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposite(int amount) {
		// TODO Auto-generated method stub
		
	}

}
