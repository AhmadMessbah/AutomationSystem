package com.mftplus.automationsystem.payment.service.impl;

import com.mftplus.automationsystem.payment.model.Function;
import com.mftplus.automationsystem.payment.repository.FunctionRepository;
import com.mftplus.automationsystem.payment.service.FunctionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FunctionServiceImpl implements FunctionService
{
    private final FunctionRepository functionRepository;

    public FunctionServiceImpl(FunctionRepository functionRepository) {
        this.functionRepository = functionRepository;
    }

    @Override
    public Function create(Function function) {
        return functionRepository.save(function);
    }

    @Override
    public Function update(Function function) {
        return functionRepository.save(function);
    }

    @Override
    public void deleteById(Long id) {
        functionRepository.deleteById(id);
    }

    @Override
    public Function findById(Long id) {
        return functionRepository.findById(id).orElse(null);
    }

    @Override
    public List<Function> findAll() {
        return functionRepository.findAll();
    }
}