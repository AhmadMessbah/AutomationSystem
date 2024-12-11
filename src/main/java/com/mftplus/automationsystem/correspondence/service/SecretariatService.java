package com.mftplus.automationsystem.correspondence.service;

import com.mftplus.automationsystem.correspondence.model.Secretariat;

import java.util.List;

public interface SecretariatService {
    void save(Secretariat secretariat);
    void update(Secretariat secretariat);
    void delete(Long id);
    List<Secretariat> findAll();
    Secretariat findById(Long id);
}
