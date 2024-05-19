package com.trainbooking.service;

import com.trainbooking.model.Ticket;
import com.trainbooking.model.User;
import com.trainbooking.repository.InMemoryTicketRepository;
import com.trainbooking.repository.TicketRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class TicketServiceTest {
    private TicketService ticketService;
    private TicketRepository ticketRepository;

    @BeforeEach
    void setUp() {
        ticketRepository = new InMemoryTicketRepository();
        ticketService = new TicketServiceImpl(ticketRepository);
    }

    @Test
    void testPurchaseTicket() {
        User user = new User();
        user.setFirstName("John");
        user.setLastName("Doe");
        user.setEmail("john.doe@example.com");

        Ticket ticket = ticketService.purchaseTicket(user);

        assertNotNull(ticket);
        assertEquals("London", ticket.getFrom());
        assertEquals("France", ticket.getTo());
        assertEquals(20.0, ticket.getPricePaid());
        assertEquals(user, ticket.getUser());
    }

    @Test
    void testGetTicket() {
        User user = new User();
        user.setFirstName("John");
        user.setLastName("Doe");
        user.setEmail("john.doe@example.com");

        ticketService.purchaseTicket(user);
        Optional<Ticket> ticket = ticketService.getTicket("john.doe@example.com");

        assertTrue(ticket.isPresent());
        assertEquals(user, ticket.get().getUser());
    }

    @Test
    void testGetTicketsBySection() {
        User user1 = new User();
        user1.setFirstName("John");
        user1.setLastName("Doe");
        user1.setEmail("john.doe@example.com");

        User user2 = new User();
        user2.setFirstName("Jane");
        user2.setLastName("Doe");
        user2.setEmail("jane.doe@example.com");

        ticketService.purchaseTicket(user1);
        ticketService.purchaseTicket(user2);

        List<Ticket> sectionA = ticketService.getTicketsBySection("A");
        List<Ticket> sectionB = ticketService.getTicketsBySection("B");

        assertEquals(1, sectionA.size());
        assertEquals(1, sectionB.size());
    }

    @Test
    void testRemoveUser() {
        User user = new User();
        user.setFirstName("John");
        user.setLastName("Doe");
        user.setEmail("john.doe@example.com");

        ticketService.purchaseTicket(user);
        boolean removed = ticketService.removeUser("john.doe@example.com");

        assertTrue(removed);
        assertFalse(ticketService.getTicket("john.doe@example.com").isPresent());
    }

    @Test
    void testModifySeat() {
        User user = new User();
        user.setFirstName("John");
        user.setLastName("Doe");
        user.setEmail("john.doe@example.com");

        ticketService.purchaseTicket(user);
        boolean modified = ticketService.modifySeat("john.doe@example.com", "B1");

        assertTrue(modified);
        Optional<Ticket> ticket = ticketService.getTicket("john.doe@example.com");
        assertTrue(ticket.isPresent());
        assertEquals("B1", ticket.get().getSeat());
    }
}
