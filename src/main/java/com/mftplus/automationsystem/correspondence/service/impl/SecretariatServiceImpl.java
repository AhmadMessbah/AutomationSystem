package com.mftplus.automationsystem.correspondence.service.impl;

import com.mftplus.automationsystem.correspondence.model.Secretariat;
import com.mftplus.automationsystem.correspondence.repository.SecretariatRepository;
import com.mftplus.automationsystem.correspondence.service.SecretariatService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SecretariatServiceImpl implements SecretariatService {

    private final SecretariatRepository secretariatRepository;

    public SecretariatServiceImpl(SecretariatRepository secretariatRepository) {
        this.secretariatRepository = secretariatRepository;
    }

    @Override
    public void save(Secretariat secretariat) {
        secretariatRepository.save(secretariat);
    }

    @Override
    public void update(Secretariat secretariat) {
        secretariatRepository.save(secretariat);
    }

    @Override
    public void delete(Long id) {
        secretariatRepository.deleteById(id);
    }

    @Override
    public List<Secretariat> findAll() {
        return secretariatRepository.findAll();
    }

    @Override
    public Secretariat findById(Long id) {
        return secretariatRepository.findById(id).orElse(null);
    }
}
