package com.mftplus.automationsystem.queuing.service.impl;

import com.mftplus.automationsystem.queuing.model.Timing;
import com.mftplus.automationsystem.queuing.repository.TimingRepository;
import com.mftplus.automationsystem.queuing.service.TimingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimingServiceImpl implements TimingService {
    private final TimingRepository timingRepository;

    public TimingServiceImpl(TimingRepository timingRepository) {
        this.timingRepository = timingRepository;
    }

    @Override
    public void save(Timing timing) {
        timingRepository.save(timing);
    }

    @Override
    public void update(Timing timing) {
        timingRepository.save(timing);
    }

    @Override
    public void delete(Long id) {
        timingRepository.deleteById(id);
    }

    @Override
    public List<Timing> findAll() {
        return timingRepository.findAll();
    }

    @Override
    public Timing findById(Long id) {
        return timingRepository.findById(id).orElse(null);
    }
}
