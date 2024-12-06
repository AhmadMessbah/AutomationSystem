package com.mftplus.automationsystem.ticketing.service;

import com.mftplus.automationsystem.organization.model.Department;
import com.mftplus.automationsystem.ticketing.model.Ticket;
import com.mftplus.automationsystem.ticketing.model.enums.TicketStatus;
import com.mftplus.automationsystem.users.model.User;

import java.util.List;

public interface TicketService {
    void save(Ticket ticket);
    void update(Ticket ticket);
    void delete(Long id);
    List<Ticket> findAll();
    Ticket findById(Long id);
    List<Ticket> findByUser(User user);
    List<Ticket> findByUserUsername(String username);
    List<Ticket> findByStatus(TicketStatus status);
    List<Ticket> findByTitleContains(String title);
    List<Ticket> findByDepartment(Department department);
    List<Ticket> findByScoreLessThan(Integer score);

}
