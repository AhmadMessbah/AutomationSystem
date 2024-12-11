package com.mftplus.automationsystem.correspondence.service;

import com.mftplus.automationsystem.correspondence.model.Appeal;

import java.util.List;

public interface AppealService {
    void save(Appeal appeal);
    void update(Appeal appeal);
    void delete(Long id);
    List<Appeal> findAll();
    Appeal findById(Long id);
}
