package com.trainbooking.repository;


import com.trainbooking.model.Ticket;
import java.util.List;
import java.util.Optional;

public interface TicketRepository {
	Ticket save(Ticket ticket);
    Optional<Ticket> findByEmail(String email);
    List<Ticket> findBySection(String section);
    boolean deleteByEmail(String email);
    boolean updateSeat(String email, String newSeat);
}
