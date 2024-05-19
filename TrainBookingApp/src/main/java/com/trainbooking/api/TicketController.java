package com.trainbooking.api;

import com.trainbooking.model.Ticket;
import com.trainbooking.model.User;
import com.trainbooking.service.TicketService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tickets")
public class TicketController {
    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @PostMapping("/purchase")
    public Ticket purchaseTicket(@RequestBody User user) {
        return ticketService.purchaseTicket(user);
    }

    @GetMapping("/receipt/{email}")
    public Optional<Ticket> getReceipt(@PathVariable("email") String email) {
        return ticketService.getTicket(email);
    }

    @GetMapping("/section/{section}")
    public List<Ticket> getUsersBySection(@PathVariable("section") String section) {
        return ticketService.getTicketsBySection(section);
    }

    @DeleteMapping("/remove/{email}")
    public boolean removeUser(@PathVariable("email") String email) {
        return ticketService.removeUser(email);
    }

    @PutMapping("/modifySeat")
    public boolean modifySeat(@RequestParam("email") String email, @RequestParam("newSeat") String newSeat) {
        return ticketService.modifySeat(email, newSeat);
    }
}
