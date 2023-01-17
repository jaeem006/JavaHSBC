package com.example.ejemplo2;

import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket,Long> {
}
