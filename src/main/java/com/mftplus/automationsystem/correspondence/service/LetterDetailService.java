package com.mftplus.automationsystem.correspondence.service;

import com.mftplus.automationsystem.correspondence.model.LetterDetail;

import java.util.List;

public interface LetterDetailService {
    void save (LetterDetail letterDetail);
    void update (LetterDetail letterDetail);
    void delete (Long id);
    List<LetterDetail> findAll();
    LetterDetail findById(Long id);
}
