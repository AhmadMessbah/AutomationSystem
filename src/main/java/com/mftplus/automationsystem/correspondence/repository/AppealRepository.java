package com.mftplus.automationsystem.correspondence.repository;

import com.mftplus.automationsystem.correspondence.model.Appeal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppealRepository extends JpaRepository<Appeal, Long> {
}
