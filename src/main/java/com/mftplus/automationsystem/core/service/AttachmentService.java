package com.mftplus.automationsystem.core.service;

import com.mftplus.automationsystem.core.model.Attachment;

import java.time.LocalDateTime;
import java.util.List;

public interface AttachmentService {
    void save(Attachment attachment);
    void update(Attachment attachment);
    void delete(Long id);
    List<Attachment> findAll();
    Attachment findById(Long id);
}
