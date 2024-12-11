package com.mftplus.automationsystem.correspondence.service;

import com.mftplus.automationsystem.correspondence.model.Initials;

import java.util.List;

public interface InitialsService {
    void save(Initials initials);
    void update(Initials initials);
    void delete(Long id);
    List<Initials> findAll();
    Initials findById(Long id);
}
