package com.mftplus.automationsystem.correspondence.model;

import com.mftplus.automationsystem.organization.model.Department;
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

@Entity(name="appealEntity")
@Table(name="appeal_tbl")
public class Appeal {

    @Id
    @SequenceGenerator(name = "appealSeq", sequenceName = "appeal_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "appealSeq")
    @Column(name = "id")
    private Long id;

    private String title;

    private LocalDateTime creationDateTime;

    @OneToMany
    private List<Letter> letterList;

    @ManyToOne
    private Department department;

    public void addLetter(Letter letter) {
        if(letterList == null) {
            letterList = new ArrayList<>();
        }
        letterList.add(letter);
    }

}
