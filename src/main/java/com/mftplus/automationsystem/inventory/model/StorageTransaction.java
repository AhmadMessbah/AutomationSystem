package com.mftplus.automationsystem.inventory.model;

import com.mftplus.automationsystem.inventory.model.enums.InventoryStatus;
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

@Entity(name="storageTransactionEntity")
@Table(name="storage_transaction_tbl")
public class StorageTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "inventory_status")
    private InventoryStatus inventoryStatus;

    @Column(name = "registerDateTime")
    private LocalDateTime registerDateTime;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH} , fetch = FetchType.EAGER)
    @JoinColumn(name=("storage_transaction_product"), foreignKey = @ForeignKey(name="fk-storage_transaction_product"))
    private Product product;

    @Column(name = "quantity")
    private Double quantity;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH} , fetch = FetchType.EAGER)
    private Storage storage;



}
