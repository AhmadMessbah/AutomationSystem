package com.mftplus.automationsystem.payment.service;

import com.mftplus.automationsystem.payment.model.ShiftTime;

import java.util.List;

public interface ShiftTimeService
{
    ShiftTime create(ShiftTime shiftTime);
    ShiftTime update(ShiftTime shiftTime);
    void deleteById(Long id);
    ShiftTime findById(Long id);
    List<ShiftTime> findAll();
}