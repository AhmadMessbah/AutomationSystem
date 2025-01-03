package com.mftplus.automationsystem.payment.repository;

import com.mftplus.automationsystem.payment.model.Salary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaryRepository extends JpaRepository<Salary, Long> {
}
