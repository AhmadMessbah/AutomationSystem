package com.mftplus.automationsystem.correspondence.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
@ToString

@Entity(name="secretariatEntity")
@Table(name="secretariat_tbl")
public class Secretariat {

    @Id
    @SequenceGenerator(name = "secretariatSeq", sequenceName = "secretariat_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "secretariatSeq")
    @Column(name = "id")
    private Long id;

    private String name;

    private String location;

    @OneToMany
    private List<Letter> letterList;

    public void addLetter(Letter letter) {
        if (letterList == null) {
            letterList = new ArrayList<>();
        }
        letterList.add(letter);
    }
}