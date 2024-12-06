package com.mftplus.automationsystem.ticketing.service;


import com.mftplus.automationsystem.ticketing.model.Message;
import com.mftplus.automationsystem.ticketing.model.Ticket;
import com.mftplus.automationsystem.users.model.User;

import java.util.List;

public interface MessageService {
    void save(Message message);
    void update(Message message);
    void delete(Long id);
    List<Message> findAll();
    Message findById(Long id);
    List<Message> findByUser(User user);
    List<Message> findByUserUsername(String username);
    List<Message> findByTicket(Ticket ticket);
    List<Message> findByTicketId(Long ticketId);
}
