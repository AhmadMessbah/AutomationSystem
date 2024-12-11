package com.mftplus.automationsystem.inventory.model;

import com.mftplus.automationsystem.inventory.model.enums.InventoryStatus;
import com.mftplus.automationsystem.users.model.User;
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

@Entity(name = "propertyEntity")
@Table(name = "property_tbl")
public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "quantity")
    private Double quantity;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "inventory_status")
    private InventoryStatus inventoryStatus;

    @ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
    private ProductGroup productGroup;

    @OneToMany
    private List<Product> productList;

    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinColumn(name="username")
    private User user;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH} , fetch = FetchType.EAGER)
    @JoinColumn(name="storage")
    private Storage storage;

    @OneToOne(cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
    @JoinColumn(name = "storage_transaction", foreignKey = @ForeignKey(name="fk-storage_transaction"))
    private StorageTransaction storageTransaction;
}
