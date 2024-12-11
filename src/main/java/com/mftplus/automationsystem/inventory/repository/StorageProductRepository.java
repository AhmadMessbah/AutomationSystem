package com.mftplus.automationsystem.inventory.repository;

import com.mftplus.automationsystem.inventory.model.StorageProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StorageProductRepository  extends JpaRepository<StorageProduct,Long> {
}
