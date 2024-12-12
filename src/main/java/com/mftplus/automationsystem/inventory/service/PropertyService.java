package com.mftplus.automationsystem.inventory.service;

import com.mftplus.automationsystem.inventory.model.*;
import com.mftplus.automationsystem.inventory.model.enums.InventoryStatus;

import java.util.List;

public interface PropertyService {
    void save(Property property);
    void update(Property property);
    void delete(Long id);
    List<Property> findAll();
    Property findById(Long id);
    List<Property> findByTitleProductGroup(String productGroup);
    List<Property> findByStatus(InventoryStatus status);
    List<Property> findByQuantity(Double quantity);
    List<Property> findByProductName(Product product);
    Property findByUserUsername(String username);
    List<Property> findByStorageTitle(String storage);
    List<Property> findByStorageTransaction(StorageTransaction storageTransaction);

}
