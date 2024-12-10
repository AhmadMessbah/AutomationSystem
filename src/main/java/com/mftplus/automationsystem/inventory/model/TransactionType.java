package com.mftplus.automationsystem.inventory.model;

import com.mftplus.automationsystem.inventory.model.enums.InventoryStatus;
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

@Entity(name="transactionEntity")
@Table(name="transaction_tbl")
public class TransactionType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "inventory_status")
    private InventoryStatus inventoryStatus;
}
