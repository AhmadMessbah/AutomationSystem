package com.mftplus.automationsystem.inventory.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;


@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
@ToString

@Entity(name="ProductGroupEntity")
@Table(name="productGroup_table")
public class ProductGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @OneToMany
    private List<Product> products;

    @ManyToOne
    private ProductGroup parent;
}
