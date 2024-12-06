package com.mftplus.automationsystem.organization.model;


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

@Entity(name="departmentEntity")
@Table(name="department_table")
public class Department {
    @Id
    @SequenceGenerator(name = "departmentSeq",sequenceName = "department_seq" , allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "departmentSeq")
    @Column(name="id")
    private Long id;

    @Column(name="title", length = 50, unique = true)
    private String title;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "parent_department_id",nullable = true,foreignKey = @ForeignKey(name = "fk_department_parent_id"))
    private Department parentDepartment;

    @ToString.Exclude
    @OneToMany( fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "parentDepartment")
    private List<Department> childDepartmentList;

    public void addChildDepartment(Department childDepartment){
        if (childDepartmentList == null){
            childDepartmentList = new ArrayList<>();
        }
        childDepartmentList.add(childDepartment);
    }

}
