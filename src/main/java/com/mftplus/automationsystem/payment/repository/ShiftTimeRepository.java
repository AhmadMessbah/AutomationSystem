package com.mftplus.automationsystem.payment.repository;

import com.mftplus.automationsystem.payment.model.ShiftTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShiftTimeRepository extends JpaRepository<ShiftTime, Long> {
}
