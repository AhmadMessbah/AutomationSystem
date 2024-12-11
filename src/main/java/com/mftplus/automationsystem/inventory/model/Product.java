package com.mftplus.automationsystem.inventory.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
@ToString

@Entity(name="productEntity")
@Table(name="product_tbl")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

//    private Float price;

//    private Long code;

    @Column(name = "is_active")
    private boolean status;

    @Column(name="date_time")
    private LocalDateTime dateTime;

    private String description;

    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH }, fetch = FetchType.EAGER)
    @JoinColumn(name = "product_group_id")
    private ProductGroup productGroup;

    @Column(name = "date_of_modified")
    private LocalDateTime dateOfModified;

    @PrePersist
    public void beforeDateModified(){
        dateOfModified = LocalDateTime.now();
    }

    @Column(name = "barcode", unique = true)
    private String barcode;
}
