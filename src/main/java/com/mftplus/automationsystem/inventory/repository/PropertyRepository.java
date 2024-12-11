package com.mftplus.automationsystem.inventory.repository;

import com.mftplus.automationsystem.inventory.model.*;
import com.mftplus.automationsystem.inventory.model.enums.InventoryStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PropertyRepository extends JpaRepository<Property,Long> {
    boolean existsPropertyById(Long id);
    List<Property> findByProductGroupTitle(String productGroup);
    List<Property> findByInventoryStatus(InventoryStatus status);
    List<Property> findByQuantityIsGreaterThan(Double quantity);
    List<Property> findByProductListOrderByUser(Product productList);
    Property findByUserUsername(String username);
    List<Property> findByStorageTitle(String storage);
    List<Property> findByStorageTransactionOrderByInventoryStatus(StorageTransaction storageTransaction);

}
