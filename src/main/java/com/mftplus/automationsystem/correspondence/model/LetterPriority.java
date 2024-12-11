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

@Entity(name="letterPriorityEntity")
@Table(name="letter_priority_tbl")
public class LetterPriority {

    @Id
    @SequenceGenerator(name = "letterPrioritySeq", sequenceName = "letter_priority_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "letterPrioritySeq")
    @Column(name = "id")
    private Long id;

    private String priority;
}
