package com.mftplus.automationsystem.payment.service;

import com.mftplus.automationsystem.payment.model.Employee;

import java.util.List;

public interface EmployeeService
{
    Employee create(Employee employee);
    Employee update(Employee employee);
    void deleteById(Long id);
    Employee findById(Long id);
    List<Employee> findAll();
}