package com.mftplus.automationsystem.inventory.model;

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

@Entity(name="productGroupEntity")
@Table(name="productGroup_tbl")
public class ProductGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String description;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "parent_group_id")
    private ProductGroup parentGroup;

    @ToString.Exclude
    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "parentGroup")
    private List<ProductGroup> childGroupList;

    public void addChildGroup(ProductGroup childGroup){
        if (childGroupList == null){
            childGroupList = new ArrayList<>();
        }
        childGroupList.add(childGroup);
    }
}
