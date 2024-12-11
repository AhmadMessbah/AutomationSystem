package com.mftplus.automationsystem.correspondence.service;

import com.mftplus.automationsystem.correspondence.model.Letter;

import java.util.List;

public interface LetterService {
    void save(Letter letter);
    void update(Letter letter);
    void delete(Long id);
    List<Letter> findAll();
    Letter findById(Long id);
}
