package com.mftplus.automationsystem.inventory.repository;

import com.mftplus.automationsystem.inventory.model.ProductGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductGroupRepository extends JpaRepository<ProductGroup,Long> {
    List<ProductGroup> findProductGroupByTitle(String title);
    List<ProductGroup> findProductGroupByChildGroupList(ProductGroup productGroup);
    List<ProductGroup> findProductGroupByParentGroup(ProductGroup productGroup);

}
