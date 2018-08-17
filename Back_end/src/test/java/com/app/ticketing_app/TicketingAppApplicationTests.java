package com.app.ticketing_app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.app.ticketing_app.Dao.TicketRepo;
import com.app.ticketing_app.Entity.Ticket;

@RunWith(SpringRunner.class)

//@AutoConfigureMockMvc
@SpringBootTest
//@Configuration
//@EnableWebMvc
public class TicketingAppApplicationTests {
	@Autowired
	private TicketRepo ticketRepo;
	
	@Test
	public void CreateTicket() {
		Ticket ticket = new Ticket();
		ticket.setAccount_no("2058737518");
		ticket.setPan("1157xxxx34");
		ticket.setPhone_no("08135997541");
		ticket.setAmount(120.90);
		ticket.setChannel("NTA");
		ticket.setTerminal_id(12346l);
		
		
		ticketRepo.save(ticket);
	}

}
