package com.trainbooking.service;

import com.trainbooking.model.Ticket;
import com.trainbooking.model.User;
import com.trainbooking.repository.TicketRepository;

import java.util.List;
import java.util.Optional;

public class TicketServiceImpl implements TicketService {
    private final TicketRepository ticketRepository;
    private Integer seatCounter  = 1;
    
    public TicketServiceImpl(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @Override
    public Ticket purchaseTicket(User user) {
        String seat = allocateSeat();
        Ticket ticket = new Ticket("London", "France", user, 20.0, seat);
        return ticketRepository.save(ticket);
    }

    @Override
    public Optional<Ticket> getTicket(String email) {
        return ticketRepository.findByEmail(email);
    }

    @Override
    public List<Ticket> getTicketsBySection(String section) {
        return ticketRepository.findBySection(section);
    }

    @Override
    public boolean removeUser(String email) {
        return ticketRepository.deleteByEmail(email);
    }

    @Override
    public boolean modifySeat(String email, String newSeat) {
        return ticketRepository.updateSeat(email, newSeat);
    }

    private String allocateSeat() {
        // Implementation of seat allocation logic
        String section = seatCounter % 2 == 0 ? "B" : "A";
        return section + (seatCounter++);
    }
}
