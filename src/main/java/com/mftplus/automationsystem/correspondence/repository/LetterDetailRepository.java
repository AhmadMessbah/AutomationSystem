package com.mftplus.automationsystem.correspondence.repository;

import com.mftplus.automationsystem.correspondence.model.LetterDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LetterDetailRepository extends JpaRepository<LetterDetail, Long> {
}
