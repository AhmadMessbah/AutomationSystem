package com.mftplus.automationsystem.payment.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Function extends AbstractBaseEntity
{
    @OneToMany
    private List<Employee> employees;
}