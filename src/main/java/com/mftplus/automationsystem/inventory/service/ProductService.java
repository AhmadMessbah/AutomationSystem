package com.mftplus.automationsystem.inventory.service;

import com.mftplus.automationsystem.inventory.model.Product;
import com.mftplus.automationsystem.inventory.model.ProductGroup;
import java.util.List;

public interface ProductService {
    void save(Product product);
    void update(Product product);
    void delete(Long id);
    List<Product> findAll();
    Product findById(Long id);
    List<Product> findByName(String name);
    List<Product> findByTitleProductGroup(ProductGroup productGroup);
}
