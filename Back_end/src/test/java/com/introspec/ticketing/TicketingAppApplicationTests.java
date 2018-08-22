package com.introspec.ticketing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.introspec.ticketing.repo.TicketRepo;

import java.util.Date;

import com.introspec.ticketing.entity.Ticket;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TicketingAppApplicationTests {
	@Autowired
	private TicketRepo ticketRepo;
	
	@Test
	public void CreateTicket() {
		Ticket ticket = new Ticket();
		ticket.setAccountNo("2058737518");
		ticket.setPan("1157xxxx34");
		ticket.setPhoneNumber("08135997541");
		ticket.setAmount(120.90);
		ticket.setChannel("NTA");
		ticket.setTerminalId(12346l);
		//ticket.setCreatedAt(new Date());
		//ticket.setUpdatedAt(new Date());
		
		ticketRepo.save(ticket);
	}

}
