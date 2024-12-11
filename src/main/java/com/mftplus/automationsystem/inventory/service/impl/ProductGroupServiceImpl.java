package com.mftplus.automationsystem.inventory.service.impl;

import com.mftplus.automationsystem.inventory.model.ProductGroup;
import com.mftplus.automationsystem.inventory.repository.ProductGroupRepository;
import com.mftplus.automationsystem.inventory.service.ProductGroupService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductGroupServiceImpl implements ProductGroupService {
    private final ProductGroupRepository productGroupRepository;

    public ProductGroupServiceImpl(ProductGroupRepository productGroupRepository) {
        this.productGroupRepository = productGroupRepository;
    }

    @Override
    public void save(ProductGroup productGroup) {
        productGroupRepository.save(productGroup);
    }

    @Override
    public void update(ProductGroup productGroup) {
        productGroupRepository.save(productGroup);
    }

    @Override
    public void delete(Long id) {
        productGroupRepository.deleteById(id);
    }

    @Override
    public List<ProductGroup> findAll() {
        return productGroupRepository.findAll();
    }

    @Override
    public ProductGroup findById(Long id) {
        return productGroupRepository.findById(id).orElse(null);
    }

    @Override
    public List<ProductGroup> findByTitle(String title) {
        return productGroupRepository.findProductGroupByTitle(title);
    }

    @Override
    public List<ProductGroup> findByChildGroup(ProductGroup childGroup) {
        return productGroupRepository.findProductGroupByChildGroupList(childGroup);
    }

    @Override
    public List<ProductGroup> findByParentGroup(ProductGroup parentGroup) {
        return productGroupRepository.findProductGroupByParentGroup(parentGroup);
    }
}
