package com.mftplus.automationsystem.inventory.service;

import com.mftplus.automationsystem.inventory.model.Product;
import com.mftplus.automationsystem.inventory.model.StorageTransaction;
import com.mftplus.automationsystem.inventory.model.enums.InventoryStatus;

import java.time.LocalDateTime;
import java.util.List;

public interface StorageTransactionService {
    void save(StorageTransaction storageTransaction);
    void update(StorageTransaction storageTransaction);
    void delete(Long id);
    List<StorageTransaction> findAll();
    StorageTransaction findById(Long id);
    List<StorageTransaction> findByStatus(InventoryStatus status);
    List<StorageTransaction> findByQuantity(Double quantity);
    StorageTransaction findByProductName(Product product);
    List<StorageTransaction> findByStorageTitle(String storage);
    List<StorageTransaction> findByRegisterDateTime(LocalDateTime registerDateTime);
    List<StorageTransaction> findAllByRegisterDateTime(StorageTransaction storageTransaction);

}
