package com.mftplus.automationsystem.payment.repository;

import com.mftplus.automationsystem.payment.model.Function;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FunctionRepository extends JpaRepository<Function, Long> {
}
