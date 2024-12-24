package com.mftplus.automationsystem.payment.service;

import com.mftplus.automationsystem.payment.model.Function;

import java.util.List;

public interface FunctionService
{
    Function create(Function function);
    Function update(Function function);
    void deleteById(Long id);
    Function findById(Long id);
    List<Function> findAll();
}