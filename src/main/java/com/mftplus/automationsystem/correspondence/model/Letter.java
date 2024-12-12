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

    @Column(name = "letter_number")
    private Long number;

    @Column(name = "secretariat_number")
    private Long secretariatNumber;

    @Column(name = "creation_time")
    private LocalDateTime creationDateTime;

    @Column(name = "secretariat_time")
    private LocalDateTime secretariatDateTime;

    @Column(name = "subject")
    private String subject;

    @Column(name = "content")
    private String content;

    @ManyToOne
    @JoinColumn(
            name = "sender_id",
            foreignKey = @ForeignKey(name = "fk_letter_user")
    )
    private User sender;

    @ManyToOne
    @JoinColumn(
            name = "appeal_id",
            foreignKey = @ForeignKey(name = "fk_letter_appeal")
    )
    private Appeal appeal;

    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "letter_attachment_tbl",
            joinColumns = @JoinColumn(name = "letter_id"),
            inverseJoinColumns = @JoinColumn(name = "attachment_id"),
            foreignKey = @ForeignKey(name = "fk_letter_attachment"),
            inverseForeignKey = @ForeignKey(name = "fk_inverse_letter_attachment")
    )
    private List<Attachment> attachmentList;

    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "letter_letter_detail_tbl",
            joinColumns = @JoinColumn(name = "letter_id"),
            inverseJoinColumns = @JoinColumn(name = "letter_detail_id"),
            foreignKey = @ForeignKey(name = "fk_letter_detail"),
            inverseForeignKey = @ForeignKey(name = "fk_inverse_letter_detail")
    )
    private List<LetterDetail> letterDetailList;

    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "letter_referrals_tbl",
            joinColumns = @JoinColumn(name = "letter_id"),
            inverseJoinColumns = @JoinColumn(name = "referrals_id"),
            foreignKey = @ForeignKey(name = "fk_letter_referrals"),
            inverseForeignKey = @ForeignKey(name = "fk_inverse_letter_referrals")
    )
    private List<Referrals> referralsList;

    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "letter_initials_tbl",
            joinColumns = @JoinColumn(name = "letter_id"),
            inverseJoinColumns = @JoinColumn(name = "initials_id"),
            foreignKey = @ForeignKey(name = "fk_letter_initials"),
            inverseForeignKey = @ForeignKey(name = "fk_inverse_letter_initials")
    )
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
