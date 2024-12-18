package com.mftplus.automationsystem.queuing.repository;

import com.mftplus.automationsystem.queuing.model.Timing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimingRepository extends JpaRepository<Timing,Long> {
}
