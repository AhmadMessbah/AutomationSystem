package com.mftplus.automationsystem.ticketing.repository;

import com.mftplus.automationsystem.ticketing.model.Ticket;
import com.mftplus.automationsystem.ticketing.model.enums.TicketStatus;
import com.mftplus.automationsystem.users.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
    List<Ticket> findByTitleIsLikeOrderByDateTime(String title);
    List<Ticket> findAllByOrderByDateTime();
    List<Ticket> findByUserOrderByDateTime(User user);
    List<Ticket> findByUserUsernameOrderByDateTime(String username);
    List<Ticket> findByStatusOrderByDateTime(TicketStatus status);
    List<Ticket> findByScoreIsLessThanEqualOrderByDateTime(Integer score);
    List<Ticket> findByDepartment_IdOrderByDateTime(Long id);
}
