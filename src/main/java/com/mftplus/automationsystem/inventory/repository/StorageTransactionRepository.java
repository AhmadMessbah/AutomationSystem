package com.mftplus.automationsystem.inventory.repository;

import com.mftplus.automationsystem.inventory.model.StorageTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StorageTransactionRepository extends JpaRepository<StorageTransaction,Long> {
}
