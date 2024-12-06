package com.mftplus.automationsystem.core.repository;

import com.mftplus.automationsystem.core.model.Attachment;
import com.mftplus.automationsystem.core.model.enums.FileType;
import com.mftplus.automationsystem.ticketing.model.Ticket;
import com.mftplus.automationsystem.users.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface AttachmentRepository extends JpaRepository<Attachment, Long> {
    List<Attachment> findByFileNameIsLikeOrderByAttachTime(String title);
    List<Attachment> findByAttachTimeOrderByAttachTimeDesc(LocalDateTime attachTime); ;
    List<Attachment> findByFileType(FileType fileType);
    List<Attachment> findAllByOrderByAttachTimeDesc();
}
