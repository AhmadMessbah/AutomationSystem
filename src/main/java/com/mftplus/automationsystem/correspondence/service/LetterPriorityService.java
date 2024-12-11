package com.mftplus.automationsystem.correspondence.service;

import com.mftplus.automationsystem.correspondence.model.LetterPriority;

import java.util.List;

public interface LetterPriorityService {
    void save (LetterPriority letterPriority);
    void update (LetterPriority letterPriority);
    void delete (Long id);
    List<LetterPriority> findAll();
    LetterPriority findById(Long id);
}
