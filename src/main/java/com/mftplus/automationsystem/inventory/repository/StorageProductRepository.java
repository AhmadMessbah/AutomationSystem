package com.mftplus.automationsystem.inventory.repository;

import com.mftplus.automationsystem.inventory.model.Product;
import com.mftplus.automationsystem.inventory.model.StorageProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StorageProductRepository extends JpaRepository<StorageProduct,Long> {
    List<StorageProduct> findByQuantityIsGreaterThan(Double quantity);
    StorageProduct findByProduct(Product product);
    List<StorageProduct> findByRemainder(Double remainder);
    List<StorageProduct> findByLimit(Double limit);
    List<StorageProduct> findByStorageTitle(String storage);
}
