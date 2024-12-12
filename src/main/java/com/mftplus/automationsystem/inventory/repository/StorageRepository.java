package com.mftplus.automationsystem.inventory.repository;

import com.mftplus.automationsystem.inventory.model.Storage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StorageRepository extends JpaRepository<Storage,Long> {
    List<Storage> findByTitle(String title);
    List<Storage> findByCountIsGreaterThan(Double count);
    List<Storage> findByLocation(String location);
}
