package com.introspec.ticketing.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.introspec.ticketing.entity.Ticket;;

@Repository
public interface TicketRepo extends JpaRepository<Ticket, Long> {
    
}
