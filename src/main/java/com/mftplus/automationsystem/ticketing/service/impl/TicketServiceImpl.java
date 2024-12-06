package com.mftplus.automationsystem.ticketing.service.impl;

import com.mftplus.automationsystem.organization.model.Department;
import com.mftplus.automationsystem.ticketing.model.Ticket;
import com.mftplus.automationsystem.ticketing.model.enums.TicketStatus;
import com.mftplus.automationsystem.ticketing.repository.TicketRepository;
import com.mftplus.automationsystem.ticketing.service.TicketService;
import com.mftplus.automationsystem.users.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {
    private final TicketRepository ticketRepository;

    public TicketServiceImpl(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @Override
    public void save(Ticket ticket) {
        ticketRepository.save(ticket);
    }

    @Override
    public void update(Ticket ticket) {
        ticketRepository.save(ticket);
    }

    @Override
    public void delete(Long id) {
        ticketRepository.deleteById(id);
    }

    @Override
    public List<Ticket> findAll() {
        return ticketRepository.findAllByOrderByDateTime();
    }

    @Override
    public Ticket findById(Long id) {
        return ticketRepository.findById(id).orElse(null);
    }

    @Override
    public List<Ticket> findByUser(User user) {
        return ticketRepository.findByUserOrderByDateTime(user);
    }

    @Override
    public List<Ticket> findByUserUsername(String username) {
        return ticketRepository.findByUserUsernameOrderByDateTime(username);
    }

    @Override
    public List<Ticket> findByStatus(TicketStatus status) {
        return ticketRepository.findByStatusOrderByDateTime(status);
    }

    @Override
    public List<Ticket> findByTitleContains(String title) {
        return ticketRepository.findByTitleIsLikeOrderByDateTime("%" + title + "%");
    }

    @Override
    public List<Ticket> findByDepartment(Department department) {
        return null; //ticketRepository.findBySection_IdOrderByDateTime(department.getId());
    }

    @Override
    public List<Ticket> findByScoreLessThan(Integer score) {
        return ticketRepository.findByScoreIsLessThanEqualOrderByDateTime(score);
    }
}
