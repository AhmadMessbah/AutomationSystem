package com.mftplus.automationsystem.inventory.repository;

import com.mftplus.automationsystem.inventory.model.Storage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StorageRepository extends JpaRepository<Storage,Long> {
}
