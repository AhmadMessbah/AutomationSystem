package com.mftplus.automationsystem.correspondence.service.impl;

import com.mftplus.automationsystem.correspondence.model.Filing;
import com.mftplus.automationsystem.correspondence.repository.FilingRepository;
import com.mftplus.automationsystem.correspondence.service.FilingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilingServiceImpl implements FilingService {

    private final FilingRepository filingRepository;

    public FilingServiceImpl(FilingRepository filingRepository) {
        this.filingRepository = filingRepository;
    }

    @Override
    public void save(Filing filing) {
        filingRepository.save(filing);
    }

    @Override
    public void update(Filing filing) {
        filingRepository.save(filing);
    }

    @Override
    public void delete(Long id) {
        filingRepository.deleteById(id);
    }

    @Override
    public List<Filing> findAll() {
        return filingRepository.findAll();
    }

    @Override
    public Filing findById(Long id) {
        return filingRepository.findById(id).orElse(null);
    }
}
