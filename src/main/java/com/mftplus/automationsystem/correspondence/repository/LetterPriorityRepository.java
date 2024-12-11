package com.mftplus.automationsystem.correspondence.repository;

import com.mftplus.automationsystem.correspondence.model.LetterPriority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LetterPriorityRepository extends JpaRepository<LetterPriority, Long> {
}
