package com.app.ticketing_app.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.ticketing_app.Dao.TicketRepo;
import com.app.ticketing_app.Entity.Ticket;


@Service
public class TicketService {
	/*field injection
	  @Autowired
	private TicketRepo ticketRepo;*/
	
	//constructor injection
	private final TicketRepo ticketRepo;
	public TicketService(final TicketRepo ticketRepo) { 
		this.ticketRepo = ticketRepo;
	}
	 
	public List<Ticket> getAllTicket(){
		List<Ticket> tickets = new ArrayList<>();
		ticketRepo.findAll()
		.forEach(tickets::add);
		return tickets;
		
	}
	
	public Optional<Ticket> getTicket(Long ticket_id){
		return ticketRepo.findById(ticket_id);
	}

	public void addTicket(Ticket ticket) {
		ticketRepo.save(ticket);
		
	}

	public void deleteCustomer(Long bvn) {
		ticketRepo.deleteById(bvn);
		
	}

}
