package com.mftplus.automationsystem.correspondence.model;

import com.mftplus.automationsystem.users.model.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
@ToString

@Entity(name="letterDetailEntity")
@Table(name="letter_detail_tbl")
public class LetterDetail {

    @Id
    @SequenceGenerator(name = "letterDetailSeq", sequenceName = "letter_detail_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "letterDetailSeq")
    @Column(name = "id")
    private Long id;

    @OneToOne
    private LetterPriority priority;

    @OneToOne
    private LetterStatus status;

    private LocalDateTime lastUpdate;

    @ManyToOne(fetch = FetchType.EAGER)
    private User detailChangeUser;
}
