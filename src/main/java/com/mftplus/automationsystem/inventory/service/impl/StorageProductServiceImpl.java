package com.mftplus.automationsystem.inventory.service.impl;

import com.mftplus.automationsystem.inventory.model.Product;
import com.mftplus.automationsystem.inventory.model.StorageProduct;
import com.mftplus.automationsystem.inventory.repository.StorageProductRepository;
import com.mftplus.automationsystem.inventory.service.StorageProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StorageProductServiceImpl implements StorageProductService {
    private final StorageProductRepository storageProductRepository;

    public StorageProductServiceImpl(StorageProductRepository storageProductRepository) {
        this.storageProductRepository = storageProductRepository;
    }

    @Override
    public void save(StorageProduct storageProduct) {
        storageProductRepository.save(storageProduct);  }

    @Override
    public void update(StorageProduct storageProduct) {
        storageProductRepository.save(storageProduct);
    }

    @Override
    public void delete(Long id) {
        storageProductRepository.deleteById(id);
    }

    @Override
    public List<StorageProduct> findAll() {
        return storageProductRepository.findAll();
    }

    @Override
    public StorageProduct findById(Long id) {
        return storageProductRepository.findById(id).orElse(null);
    }

    @Override
    public List<StorageProduct> findByQuantity(Double quantity) {
        return storageProductRepository.findByQuantityIsGreaterThan(quantity);
    }

    @Override
    public StorageProduct findByProductName(Product product) {
        return storageProductRepository.findByProduct(product);
    }

    @Override
    public List<StorageProduct> findByRemainder(Double remainder) {
        return storageProductRepository.findByRemainder(remainder);
    }

    @Override
    public List<StorageProduct> findByLimit(Double limit) {
        return storageProductRepository.findByLimit(limit);
    }

    @Override
    public List<StorageProduct> findByStorageTitle(String storage) {
        return storageProductRepository.findByStorageTitle(storage);
    }
}
