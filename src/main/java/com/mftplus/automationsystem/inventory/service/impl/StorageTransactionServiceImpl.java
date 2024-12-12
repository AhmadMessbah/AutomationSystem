package com.mftplus.automationsystem.inventory.service.impl;

import com.mftplus.automationsystem.inventory.model.Product;
import com.mftplus.automationsystem.inventory.model.StorageTransaction;
import com.mftplus.automationsystem.inventory.model.enums.InventoryStatus;
import com.mftplus.automationsystem.inventory.repository.StorageTransactionRepository;
import com.mftplus.automationsystem.inventory.service.StorageTransactionService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class StorageTransactionServiceImpl implements StorageTransactionService {

    private final StorageTransactionRepository storageTransactionRepository;

    public StorageTransactionServiceImpl(StorageTransactionRepository storageTransactionRepository) {
        this.storageTransactionRepository = storageTransactionRepository;
    }

    @Override
    public void save(StorageTransaction storageTransaction) {
        storageTransactionRepository.save(storageTransaction);
    }

    @Override
    public void update(StorageTransaction storageTransaction) {
        storageTransactionRepository.save(storageTransaction);
    }

    @Override
    public void delete(Long id) {
        storageTransactionRepository.deleteById(id);
    }

    @Override
    public List<StorageTransaction> findAll() {
        return storageTransactionRepository.findAll();
    }

    @Override
    public StorageTransaction findById(Long id) {
        return storageTransactionRepository.findById(id).orElse(null);
    }

    @Override
    public List<StorageTransaction> findByStatus(InventoryStatus status) {
        return storageTransactionRepository.findByInventoryStatus(status);
    }

    @Override
    public List<StorageTransaction> findByQuantity(Double quantity) {
        return storageTransactionRepository.findByQuantityIsGreaterThan(quantity);
    }

    @Override
    public StorageTransaction findByProductName(Product product) {
        return storageTransactionRepository.findByProduct(product);
    }

    @Override
    public List<StorageTransaction> findByStorageTitle(String storage) {
        return storageTransactionRepository.findByStorageTitle(storage);
    }

    @Override
    public List<StorageTransaction> findByRegisterDateTime(LocalDateTime registerDateTime) {
        return storageTransactionRepository.findByRegisterDateTime(registerDateTime);
    }

    @Override
    public List<StorageTransaction> findAllByRegisterDateTime(StorageTransaction storageTransaction) {
        return storageTransactionRepository.findAllByRegisterDateTime(storageTransaction);
    }
}
