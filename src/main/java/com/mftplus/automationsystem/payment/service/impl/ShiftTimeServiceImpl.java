package com.mftplus.automationsystem.payment.service.impl;

import com.mftplus.automationsystem.payment.model.ShiftTime;
import com.mftplus.automationsystem.payment.repository.ShiftTimeRepository;
import com.mftplus.automationsystem.payment.service.ShiftTimeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShiftTimeServiceImpl implements ShiftTimeService
{
    private final ShiftTimeRepository shiftTimeRepository;

    public ShiftTimeServiceImpl(ShiftTimeRepository shiftTimeRepository) {
        this.shiftTimeRepository = shiftTimeRepository;
    }

    @Override
    public ShiftTime create(ShiftTime shiftTime) {
        return shiftTimeRepository.save(shiftTime);
    }

    @Override
    public ShiftTime update(ShiftTime shiftTime) {
        return shiftTimeRepository.save(shiftTime);
    }

    @Override
    public void deleteById(Long id) {
        shiftTimeRepository.deleteById(id);
    }

    @Override
    public ShiftTime findById(Long id) {
        return shiftTimeRepository.findById(id).orElse(null);
    }

    @Override
    public List<ShiftTime> findAll() {
        return shiftTimeRepository.findAll();
    }
}