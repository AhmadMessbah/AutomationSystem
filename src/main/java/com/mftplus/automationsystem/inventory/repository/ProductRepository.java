package com.mftplus.automationsystem.inventory.repository;

import com.mftplus.automationsystem.inventory.model.Product;
import com.mftplus.automationsystem.inventory.model.ProductGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    boolean existsProductById(Long id);
    List<Product> findByProductGroupContains(ProductGroup productGroup);
    List<Product> findByNameOrderByDateTime(String name);

}
