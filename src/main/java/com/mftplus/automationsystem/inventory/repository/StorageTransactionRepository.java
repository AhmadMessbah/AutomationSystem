package com.mftplus.automationsystem.inventory.repository;

import com.mftplus.automationsystem.inventory.model.Product;
import com.mftplus.automationsystem.inventory.model.StorageTransaction;
import com.mftplus.automationsystem.inventory.model.enums.InventoryStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface StorageTransactionRepository extends JpaRepository<StorageTransaction,Long> {
    List<StorageTransaction> findAllByRegisterDateTime(StorageTransaction storageTransaction);
    List<StorageTransaction> findByInventoryStatus(InventoryStatus status);
    List<StorageTransaction> findByQuantityIsGreaterThan(Double quantity);
    StorageTransaction findByProduct(Product product);
    List<StorageTransaction> findByStorageTitle(String storage);
    List<StorageTransaction> findByRegisterDateTime(LocalDateTime registerDateTime);
}
