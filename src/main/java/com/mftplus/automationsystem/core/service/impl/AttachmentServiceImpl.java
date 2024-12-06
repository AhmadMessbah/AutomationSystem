package com.mftplus.automationsystem.core.service.impl;


import com.mftplus.automationsystem.core.model.Attachment;
import com.mftplus.automationsystem.core.repository.AttachmentRepository;
import com.mftplus.automationsystem.core.service.AttachmentService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AttachmentServiceImpl implements AttachmentService {
    private final AttachmentRepository attachmentRepository;

    public AttachmentServiceImpl(AttachmentRepository attachmentRepository) {
        this.attachmentRepository = attachmentRepository;
    }
    @Override
    public void save(Attachment attachment) {
//        if (!Objects.equals(attachment.getTicket().getStatus().toString(), "closed")){
//            attachmentRepository.save(attachment);
//        };
        attachmentRepository.save(attachment);

    }

    @Override
    public void update(Attachment attachment) {
        attachmentRepository.save(attachment);

    }

    @Override
    public void delete(Long id) {
        attachmentRepository.deleteById(id);

    }

    @Override
    public List<Attachment> findAll() {
        return attachmentRepository.findAllByOrderByAttachTimeDesc();
    }

    @Override
    public Attachment findById(Long id) {
        return attachmentRepository.findById(id).orElse(null);
    }

}
