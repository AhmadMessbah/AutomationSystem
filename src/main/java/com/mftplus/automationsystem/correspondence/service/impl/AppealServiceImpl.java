package com.mftplus.automationsystem.correspondence.service.impl;

import com.mftplus.automationsystem.correspondence.model.Appeal;
import com.mftplus.automationsystem.correspondence.repository.AppealRepository;
import com.mftplus.automationsystem.correspondence.service.AppealService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppealServiceImpl implements AppealService {

    private final AppealRepository appealRepository;

    public AppealServiceImpl(AppealRepository appealRepository) {
        this.appealRepository = appealRepository;
    }

    @Override
    public void save(Appeal appeal) {
        appealRepository.save(appeal);
    }

    @Override
    public void update(Appeal appeal) {
        appealRepository.save(appeal);
    }

    @Override
    public void delete(Long id) {
        appealRepository.deleteById(id);
    }

    @Override
    public List<Appeal> findAll() {
        return appealRepository.findAll();
    }

    @Override
    public Appeal findById(Long id) {
        return appealRepository.findById(id).orElse(null);
    }
}
