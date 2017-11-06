package com.qph.multithreading.concurentcolection;

public class TicketCreator implements Runnable{
	TicketCenter ticketCenter;
	String agentName;
	int quantity;
	
	public TicketCreator(TicketCenter ticketCenter, String agentName, int quantity) {
		this.ticketCenter = ticketCenter;
		this.agentName = agentName;
		this.quantity = quantity;
	}
	
	@Override
	public void run() {
		System.out.println("Creating agent " + agentName + " with " + quantity + " tickets");
		ticketCenter.createAgent(agentName, quantity);
		System.out.println("Creating finished " + agentName + quantity + " tickets");
	}
}
