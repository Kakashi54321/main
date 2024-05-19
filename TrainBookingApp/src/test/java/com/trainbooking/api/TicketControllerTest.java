package com.trainbooking.api;

import com.trainbooking.model.Ticket;
import com.trainbooking.model.User;
import com.trainbooking.service.TicketService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(TicketController.class)
class TicketControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TicketService ticketService;

    private User user;
    private Ticket ticket;

    @BeforeEach
    void setUp() {
        user = new User();
        user.setFirstName("John");
        user.setLastName("Doe");
        user.setEmail("john.doe@example.com");

        ticket = new Ticket("London", "France", user, 20.0, "A1");
    }

    @Test
    void testPurchaseTicket() throws Exception {
        given(ticketService.purchaseTicket(any(User.class))).willReturn(ticket);

        mockMvc.perform(post("/api/tickets/purchase")
                .contentType("application/json")
                .content("{\"firstName\":\"John\",\"lastName\":\"Doe\",\"email\":\"john.doe@example.com\"}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.from").value("London"))
                .andExpect(jsonPath("$.to").value("France"))
                .andExpect(jsonPath("$.pricePaid").value(20.0))
                .andExpect(jsonPath("$.user.firstName").value("John"))
                .andExpect(jsonPath("$.user.lastName").value("Doe"))
                .andExpect(jsonPath("$.user.email").value("john.doe@example.com"));
    }

    @Test
    void testGetReceipt() throws Exception {
        given(ticketService.getTicket(anyString())).willReturn(Optional.of(ticket));

        mockMvc.perform(get("/api/tickets/receipt/john.doe@example.com"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.from").value("London"))
                .andExpect(jsonPath("$.to").value("France"))
                .andExpect(jsonPath("$.pricePaid").value(20.0))
                .andExpect(jsonPath("$.user.firstName").value("John"))
                .andExpect(jsonPath("$.user.lastName").value("Doe"))
                .andExpect(jsonPath("$.user.email").value("john.doe@example.com"));
    }

    @Test
    void testGetUsersBySection() throws Exception {
        given(ticketService.getTicketsBySection(anyString())).willReturn(List.of(ticket));

        mockMvc.perform(get("/api/tickets/section/A"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].from").value("London"))
                .andExpect(jsonPath("$[0].to").value("France"))
                .andExpect(jsonPath("$[0].pricePaid").value(20.0))
                .andExpect(jsonPath("$[0].user.firstName").value("John"))
                .andExpect(jsonPath("$[0].user.lastName").value("Doe"))
                .andExpect(jsonPath("$[0].user.email").value("john.doe@example.com"));
    }

    @Test
    void testRemoveUser() throws Exception {
        given(ticketService.removeUser(anyString())).willReturn(true);

        mockMvc.perform(delete("/api/tickets/remove/john.doe@example.com"))
                .andExpect(status().isOk());
    }

    @Test
    void testModifySeat() throws Exception {
        given(ticketService.modifySeat(anyString(), anyString())).willReturn(true);

        mockMvc.perform(put("/api/tickets/modifySeat")
                .param("email", "john.doe@example.com")
                .param("newSeat", "B1"))
                .andExpect(status().isOk());
    }
}
