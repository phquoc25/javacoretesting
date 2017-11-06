package com.qph.multithreading.synchronization;

public enum Animal {
	DOG("woof"), CAT("meow");
	String sound;
	Animal(String s){
		sound = s;
	}
}

class TestEnum{
	int i = 0;
	
	private class inner implements ICustomer{

		@Override
		public void withdraw(int amount) {
			System.out.println(i);
			
		}

		@Override
		public void deposite(int amount) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
