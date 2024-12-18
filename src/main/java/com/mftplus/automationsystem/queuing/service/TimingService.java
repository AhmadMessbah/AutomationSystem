package com.mftplus.automationsystem.queuing.service;

import com.mftplus.automationsystem.queuing.model.Timing;

import java.util.List;

public interface TimingService {
    void save(Timing timing);
    void update(Timing timing);
    void delete(Long id);
    List<Timing> findAll();
    Timing findById(Long id);

}
