package com.mftplus.automationsystem.correspondence.model;

import com.mftplus.automationsystem.organization.model.Department;
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

@Entity(name="appealEntity")
@Table(name="appeal_tbl")
public class Appeal {

    @Id
    @SequenceGenerator(name = "appealSeq", sequenceName = "appeal_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "appealSeq")
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "creation_time")
    private LocalDateTime creationDateTime;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "appeal", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Letter> letterList;

    @ManyToOne
    @JoinColumn(
            name = "department_id",
            foreignKey = @ForeignKey(name = "fk_appeal_department")
    )
    private Department department;

    @ManyToOne
    @JoinColumn(
            name = "applicator_id",
            foreignKey = @ForeignKey(name = "fk_appeal_user")
    )
    private User applicator;

    public void addLetter(Letter letter) {
        if(letterList == null) {
            letterList = new ArrayList<>();
        }
        letterList.add(letter);
    }

}
