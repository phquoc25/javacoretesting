package com.qph.multithreading.concurentcolection;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurentCollectionTest {
	public static void main(String[] args) {
		ConcurrentHashMap<String, Integer> tickets = new ConcurrentHashMap<String, Integer>();
		/*tickets.put(AgentName.CANTHO, 5);
		tickets.put(AgentName.TPHCM, 5);
		tickets.put(AgentName.ANGIANG, 5);*/
		
		TicketCenter ticketCenter = new TicketCenter(tickets);
		
		/*Thread cantho1 = new Thread(new TicketBooker(ticketCenter, AgentName.CANTHO, 3));
		Thread cantho2 = new Thread(new TicketBooker(ticketCenter, AgentName.CANTHO, 3));*/
		Thread cantho1 = new Thread(new TicketCreator(ticketCenter, AgentName.CANTHO, 3));
		Thread cantho2 = new Thread(new TicketCreator(ticketCenter, AgentName.CANTHO, 5));
		cantho1.start();
		cantho2.start();
		try {
			cantho1.join();
			cantho2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(tickets.get(AgentName.CANTHO));
	}
}
