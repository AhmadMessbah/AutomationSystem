package com.mftplus.automationsystem.users.repository;

import com.mftplus.automationsystem.users.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,String> {
    Role findByName(String name);
}
