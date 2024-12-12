package com.mftplus.automationsystem.inventory.service;

import com.mftplus.automationsystem.inventory.model.Product;
import com.mftplus.automationsystem.inventory.model.StorageProduct;

import java.util.List;

public interface StorageProductService {
    void save(StorageProduct storageProduct);
    void update(StorageProduct storageProduct);
    void delete(Long id);
    List<StorageProduct> findAll();
    StorageProduct findById(Long id);
    List<StorageProduct> findByQuantity(Double quantity);
    StorageProduct findByProductName(Product product);
    List<StorageProduct> findByRemainder(Double remainder);
    List<StorageProduct> findByLimit(Double limit);
    List<StorageProduct> findByStorageTitle(String storage);
}
