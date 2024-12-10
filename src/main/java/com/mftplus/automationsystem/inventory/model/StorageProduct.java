package com.mftplus.automationsystem.inventory.model;

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

@Entity(name="storageProductEntity")
@Table(name="storage_product_tbl")
public class StorageProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
    private Product product;

    @Column(name = "quantity")
    private Double quantity;

    @Column(name = "remainder")
    private Double remainder;

    @Column(name = "limit")
    private Double limit;

    @OneToOne(cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
    private Storage storage;
}
