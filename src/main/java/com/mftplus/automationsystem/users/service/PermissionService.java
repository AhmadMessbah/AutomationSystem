package com.mftplus.automationsystem.users.service;

import com.mftplus.automationsystem.users.model.Permission;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PermissionService {
    void save(Permission permission);
    void update(Permission permission);
    void delete(Long id);
    Permission findById(Long id);
    List<Permission> findAll();
}
