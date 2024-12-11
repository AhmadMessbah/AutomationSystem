package com.mftplus.automationsystem.correspondence.model;

import com.mftplus.automationsystem.users.model.User;
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

@Entity(name="initialsEntity")
@Table(name="initials_tbl")
public class Initials {

    @Id
    @SequenceGenerator(name = "initialsSeq", sequenceName = "initials_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "initialsSeq")
    @Column(name = "id")
    private Long id;

    private String text;

    @ManyToOne
    private User author;
}
