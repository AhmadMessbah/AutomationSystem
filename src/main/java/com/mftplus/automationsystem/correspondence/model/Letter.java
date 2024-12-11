package com.mftplus.automationsystem.correspondence.model;

import com.mftplus.automationsystem.core.model.Attachment;
import com.mftplus.automationsystem.users.model.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
@ToString

@Entity(name="letterEntity")
@Table(name="letter_tbl")
public class Letter {

    @Id
    @SequenceGenerator(name = "letterSeq", sequenceName = "letter_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "letterSeq")
    @Column(name = "id")
    private Long id;

    private Long number;

    private Long secretariatNumber;

    private LocalDateTime creationDateTime;

    private LocalDateTime secretariatDateTime;

    private String subject;

    private String content;

    @ManyToOne
    private User sender;

    @ManyToOne
    private Appeal appeal;

    @OneToMany
    private List<Attachment> attachmentList;

    @OneToMany
    private List<LetterDetail> letterDetailList;

    @OneToMany
    private List<Referrals> referralsList;

    @OneToMany
    private List<Initials> initialsList;

    public void addAttachment(Attachment attachment) {
        if (attachmentList == null) {
            attachmentList = new ArrayList<>();
        }
        attachmentList.add(attachment);
    }

    public void addLetterDetail(LetterDetail letterDetail) {
        if (letterDetailList == null) {
            letterDetailList = new ArrayList<>();
        }
        letterDetailList.add(letterDetail);
    }

    public void addReferrals(Referrals referrals) {
        if (referralsList == null) {
            referralsList = new ArrayList<>();
        }
        referralsList.add(referrals);
    }

    public void addInitials(Initials initials) {
        if (initialsList == null) {
            initialsList = new ArrayList<>();
        }
        initialsList.add(initials);
    }

}
