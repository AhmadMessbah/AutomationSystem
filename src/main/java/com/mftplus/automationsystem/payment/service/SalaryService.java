package com.mftplus.automationsystem.payment.service;

import com.mftplus.automationsystem.payment.model.Salary;

import java.util.List;

public interface SalaryService
{
    Salary create(Salary salary);
    Salary update(Salary salary);
    void deleteById(Long id);
    Salary findById(Long id);
    List<Salary> findAll();
}