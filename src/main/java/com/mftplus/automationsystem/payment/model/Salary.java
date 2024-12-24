package com.mftplus.automationsystem.payment.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

import java.time.LocalDateTime;

@Entity
public class Salary extends AbstractBaseEntity
{
    @OneToOne
    private Employee employee;

    private LocalDateTime localDateTime;
}