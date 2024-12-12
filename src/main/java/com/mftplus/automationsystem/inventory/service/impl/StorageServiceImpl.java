package com.mftplus.automationsystem.inventory.service.impl;

import com.mftplus.automationsystem.inventory.model.Storage;
import com.mftplus.automationsystem.inventory.repository.StorageRepository;
import com.mftplus.automationsystem.inventory.service.StorageService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StorageServiceImpl implements StorageService {
    private final StorageRepository storageRepository;

    public StorageServiceImpl(StorageRepository storageRepository) {
        this.storageRepository = storageRepository;
    }

    @Override
    public void save(Storage storage) {
        storageRepository.save(storage);
    }

    @Override
    public void update(Storage storage) {
        storageRepository.save(storage);
    }

    @Override
    public void delete(Long id) {
        storageRepository.deleteById(id);

    }

    @Override
    public List<Storage> findAll() {
        return storageRepository.findAll();
    }

    @Override
    public Storage findById(Long id) {
        return storageRepository.findById(id).orElse(null);
    }

    @Override
    public List<Storage> findByTitle(String title) {
        return storageRepository.findByTitle(title);
    }

    @Override
    public List<Storage> findByCount(Double count) {
        return storageRepository.findByCountIsGreaterThan(count);
    }

    @Override
    public List<Storage> findByLocation(String location) {
        return storageRepository.findByLocation(location);
    }
}
