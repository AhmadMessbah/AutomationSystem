package com.mftplus.automationsystem.correspondence.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;



@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
@ToString

@Entity(name="letterStatusEntity")
@Table(name="letter_status_tbl")
public class LetterStatus {

    @Id
    @SequenceGenerator(name = "letterStatusSeq", sequenceName = "letter_status_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "letterStatusSeq")
    @Column(name = "id")
    private Long id;

    @Column(name = "status")
    private String status;

}
