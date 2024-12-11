package com.mftplus.automationsystem.correspondence.repository;

import com.mftplus.automationsystem.correspondence.model.Secretariat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecretariatRepository extends JpaRepository<Secretariat, Long> {

}
