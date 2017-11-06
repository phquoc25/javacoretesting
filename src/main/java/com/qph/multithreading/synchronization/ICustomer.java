package com.qph.multithreading.synchronization;

public abstract interface ICustomer {
	int k = 1;
	void withdraw(int amount);
	void deposite(int amount);
}
