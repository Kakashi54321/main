package com.trainbooking.service;

import com.trainbooking.model.Ticket;
import com.trainbooking.model.User;
import java.util.List;
import java.util.Optional;

public interface TicketService {
    Ticket purchaseTicket(User user);
    Optional<Ticket> getTicket(String email);
    List<Ticket> getTicketsBySection(String section);
    boolean removeUser(String email);
    boolean modifySeat(String email, String newSeat);
}
