package com.mftplus.automationsystem.correspondence.service;

import com.mftplus.automationsystem.correspondence.model.Filing;

import java.util.List;

public interface FilingService {
    void save(Filing filing);
    void update(Filing filing);
    void delete(Long id);
    List<Filing> findAll();
    Filing findById(Long id);
}
