package com.trainbooking.repository;

import com.trainbooking.model.Ticket;
import java.util.*;
import java.util.stream.Collectors;

public class InMemoryTicketRepository implements TicketRepository {
    private final Map<String, Ticket> tickets = new HashMap<>();
    private final Map<String, String> seatAllocation = new HashMap<>();

    @Override
    public Ticket save(Ticket ticket) {
        String email = ticket.getUser().getEmail();
        tickets.put(email, ticket);
        seatAllocation.put(ticket.getSeat(), email);
        return ticket;
    }

    @Override
    public Optional<Ticket> findByEmail(String email) {
        return Optional.ofNullable(tickets.get(email));
    }

    @Override
    public List<Ticket> findBySection(String section) {
        return seatAllocation.entrySet().stream()
                .filter(entry -> entry.getKey().startsWith(section))
                .map(entry -> tickets.get(entry.getValue()))
                .collect(Collectors.toList());
    }

    @Override
    public boolean deleteByEmail(String email) {
        Ticket ticket = tickets.remove(email);
        if (ticket != null) {
            seatAllocation.remove(ticket.getSeat());
            return true;
        }
        return false;
    }

    @Override
    public boolean updateSeat(String email, String newSeat) {
        Ticket ticket = tickets.get(email);
        if (ticket != null && !seatAllocation.containsKey(newSeat)) {
            seatAllocation.remove(ticket.getSeat());
            ticket.setSeat(newSeat);
            seatAllocation.put(newSeat, email);
            return true;
        }
        return false;
    }
}
