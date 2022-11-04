package com.pluralsight.fundamentals.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluralsight.fundamentals.entity.Ticket;
import com.pluralsight.fundamentals.repository.TicketRepository;

@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public Iterable<Ticket> listTickets() {
        return ticketRepository.findAll();
    }

}
