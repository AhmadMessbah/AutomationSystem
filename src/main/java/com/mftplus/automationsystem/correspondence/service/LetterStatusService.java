package com.mftplus.automationsystem.correspondence.service;

import com.mftplus.automationsystem.correspondence.model.LetterStatus;

import java.util.List;

public interface LetterStatusService {
    void save (LetterStatus letterStatus);
    void update (LetterStatus letterStatus);
    void delete (Long id);
    List<LetterStatus> findAll();
    LetterStatus findById(Long id);
}
