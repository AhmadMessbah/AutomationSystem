package com.mftplus.automationsystem.correspondence.service.impl;

import com.mftplus.automationsystem.correspondence.model.Referrals;
import com.mftplus.automationsystem.correspondence.repository.ReferralsRepository;
import com.mftplus.automationsystem.correspondence.service.ReferralsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReferralsServiceImpl implements ReferralsService {

    private final ReferralsRepository referralsRepository;

    public ReferralsServiceImpl(ReferralsRepository referralsRepository) {
        this.referralsRepository = referralsRepository;
    }

    @Override
    public void save(Referrals referrals) {
        referralsRepository.save(referrals);
    }

    @Override
    public void update(Referrals referrals) {
        referralsRepository.save(referrals);
    }

    @Override
    public void delete(Long id) {
        referralsRepository.deleteById(id);
    }

    @Override
    public List<Referrals> findAll() {
        return referralsRepository.findAll();
    }

    @Override
    public Referrals findById(Long id) {
        return referralsRepository.findById(id).orElse(null);
    }
}
