package com.mftplus.automationsystem.correspondence.service.impl;

import com.mftplus.automationsystem.correspondence.model.Initials;
import com.mftplus.automationsystem.correspondence.repository.InitialsRepository;
import com.mftplus.automationsystem.correspondence.service.InitialsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InitialsServiceImpl implements InitialsService {

    private final InitialsRepository initialsRepository;

    public InitialsServiceImpl(InitialsRepository initialsRepository) {
        this.initialsRepository = initialsRepository;
    }

    @Override
    public void save(Initials initials) {
        initialsRepository.save(initials);
    }

    @Override
    public void update(Initials initials) {
        initialsRepository.save(initials);
    }

    @Override
    public void delete(Long id) {
        initialsRepository.deleteById(id);
    }

    @Override
    public List<Initials> findAll() {
        return initialsRepository.findAll();
    }

    @Override
    public Initials findById(Long id) {
        return initialsRepository.findById(id).orElse(null);
    }
}
