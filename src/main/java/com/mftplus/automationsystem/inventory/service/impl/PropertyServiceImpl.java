package com.mftplus.automationsystem.inventory.service.impl;

import com.mftplus.automationsystem.inventory.model.Product;
import com.mftplus.automationsystem.inventory.model.ProductGroup;
import com.mftplus.automationsystem.inventory.model.Property;
import com.mftplus.automationsystem.inventory.model.StorageTransaction;
import com.mftplus.automationsystem.inventory.model.enums.InventoryStatus;
import com.mftplus.automationsystem.inventory.repository.PropertyRepository;
import com.mftplus.automationsystem.inventory.service.PropertyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyServiceImpl implements PropertyService {
    private final PropertyRepository propertyRepository;

    public PropertyServiceImpl(PropertyRepository propertyRepository) {
        this.propertyRepository = propertyRepository;
    }

    @Override
    public void save(Property property) {
        propertyRepository.save(property);
    }

    @Override
    public void update(Property property) {
        propertyRepository.save(property);
    }

    @Override
    public void delete(Long id) {
        propertyRepository.deleteById(id);
    }

    @Override
    public List<Property> findAll() {
        return propertyRepository.findAll();
    }

    @Override
    public Property findById(Long id) {
        return propertyRepository.findById(id).orElse(null);
    }

    @Override
    public List<Property> findByTitleProductGroup(String productGroup) {
        return propertyRepository.findByProductGroupTitle(productGroup);
    }

    @Override
    public List<Property> findByStatus(InventoryStatus status) {
        return propertyRepository.findByInventoryStatus(status);
    }

    @Override
    public List<Property> findByQuantity(Double quantity) {
        return propertyRepository.findByQuantityIsGreaterThan(quantity);
    }

    @Override
    public List<Property> findByProductName(Product product) {
        return propertyRepository.findByProductListOrderByUser(product);
    }

    @Override
    public Property findByUserUsername(String username) {
        return propertyRepository.findByUserUsername(username);
    }

    @Override
    public List<Property> findByStorageTitle(String storage) {
        return propertyRepository.findByStorageTitle(storage);
    }

    @Override
    public List<Property> findByStorageTransaction(StorageTransaction storageTransaction) {
        return propertyRepository.findByStorageTransactionOrderByInventoryStatus(storageTransaction);
    }
}
