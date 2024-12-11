package com.mftplus.automationsystem.correspondence.repository;

import com.mftplus.automationsystem.correspondence.model.Filing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilingRepository extends JpaRepository<Filing, Long> {
}
