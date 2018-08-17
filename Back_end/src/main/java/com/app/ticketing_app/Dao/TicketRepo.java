package com.app.ticketing_app.Dao;

import org.springframework.data.repository.CrudRepository;

import com.app.ticketing_app.Entity.Ticket;

public interface TicketRepo extends CrudRepository<Ticket, Long> {

}
