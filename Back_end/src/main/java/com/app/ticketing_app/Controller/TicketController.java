package com.app.ticketing_app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.ticketing_app.Entity.Ticket;
import com.app.ticketing_app.Service.TicketService;

@RestController
public class TicketController {
	//constructor injection
	private final TicketService ticketService;
	public TicketController(final TicketService ticketService) {
		this.ticketService = ticketService;
	}
	
	@RequestMapping(value="/ticket", method=RequestMethod.GET)
	
	public List<Ticket> getAllTicket(){
		return ticketService.getAllTicket();
	}
		
	@RequestMapping(value="/ticket/{ticket_id}", method=RequestMethod.GET)
	public Ticket getTicket(@PathVariable Long ticket_id){	
	return ticketService.getTicket(ticket_id).get();
		
	}
	
	@RequestMapping(value="/ticket", method=RequestMethod.POST)
	public String addCustomer(@RequestBody Ticket ticket ){
	ticketService.addTicket(ticket);
	return "added";
		
	}
	
	
	@RequestMapping(value="/ticket/{ticket_id}", method=RequestMethod.DELETE)
	public String deleteTicket(@PathVariable Long ticket_id){
	ticketService.deleteCustomer(ticket_id);
	return "updated";
	}
}
