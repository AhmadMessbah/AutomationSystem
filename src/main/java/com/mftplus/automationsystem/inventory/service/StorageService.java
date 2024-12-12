package com.mftplus.automationsystem.inventory.service;

import com.mftplus.automationsystem.inventory.model.Storage;

import java.util.List;

public interface StorageService {
    void save(Storage storage);
    void update(Storage storage);
    void delete(Long id);
    List<Storage> findAll();
    Storage findById(Long id);
    List<Storage> findByTitle(String title);
    List<Storage> findByCount(Double count);
    List<Storage> findByLocation(String location);
}
