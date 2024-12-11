package com.mftplus.automationsystem.inventory.service;
import com.mftplus.automationsystem.inventory.model.ProductGroup;

import java.util.List;

public interface ProductGroupService {
    void save(ProductGroup productGroup);
    void update(ProductGroup productGroup);
    void delete(Long id);
    List<ProductGroup> findAll();
    ProductGroup findById(Long id);
    List<ProductGroup> findByTitle(String title);
    List<ProductGroup> findByChildGroup(ProductGroup productGroup);
    List<ProductGroup> findByParentGroup(ProductGroup productGroup);

}
