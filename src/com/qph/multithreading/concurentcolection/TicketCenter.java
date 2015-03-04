package com.qph.multithreading.concurentcolection;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TicketCenter {
	ConcurrentHashMap<String, Integer> tickets;

	public TicketCenter(ConcurrentHashMap<String, Integer> tickets) {
		this.tickets = tickets;
	}

	public void bookTickets(String agentName, int quantity) {
		/* synchronized (tickets){ */
		int availableTickets = tickets.get(agentName);
		if (availableTickets > quantity) {
			System.out
					.println("Welcome to "
							+ agentName
							+ " !!! There are "
							+ availableTickets
							+ " available tickets for you. The order is created sucessfully.");
			availableTickets -= quantity;
			tickets.put(agentName, availableTickets);
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out
					.println("Sorry!!! We don't have enough tickets for you.");
		}
		// }
	}

	public int createAgent(String agentName, int quantity) {
		synchronized (tickets) {
			if (tickets.get(agentName) == null) {
				tickets.put(agentName, quantity);
			} else {
				return tickets.get(agentName);
			}
		}
		return quantity;
	}
}
