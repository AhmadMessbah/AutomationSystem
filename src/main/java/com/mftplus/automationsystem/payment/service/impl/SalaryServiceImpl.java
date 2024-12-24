package com.mftplus.automationsystem.payment.service.impl;

import com.mftplus.automationsystem.payment.model.Salary;
import com.mftplus.automationsystem.payment.repository.SalaryRepository;
import com.mftplus.automationsystem.payment.service.SalaryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaryServiceImpl implements SalaryService
{
    private final SalaryRepository salaryRepository;

    public SalaryServiceImpl(SalaryRepository salaryRepository) {
        this.salaryRepository = salaryRepository;
    }

    @Override
    public Salary create(Salary salary) {
        return salaryRepository.save(salary);
    }

    @Override
    public Salary update(Salary salary) {
        return salaryRepository.save(salary);
    }

    @Override
    public void deleteById(Long id) {
        salaryRepository.deleteById(id);
    }

    @Override
    public Salary findById(Long id) {
        return salaryRepository.findById(id).orElse(null);
    }

    @Override
    public List<Salary> findAll() {
        return salaryRepository.findAll();
    }
}