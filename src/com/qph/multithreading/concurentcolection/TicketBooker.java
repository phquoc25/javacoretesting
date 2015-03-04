package com.qph.multithreading.concurentcolection;

public class TicketBooker implements Runnable{
	
	TicketCenter ticketCenter;
	String agenName;
	int quantity;
	
	public TicketBooker(TicketCenter ticketCenter, String agentName, int quantity) {
		this.ticketCenter = ticketCenter;
		this.agenName = agentName;
		this.quantity = quantity;
	}
	
	@Override
	public void run() {
		ticketCenter.bookTickets(agenName, quantity);
	}

}
