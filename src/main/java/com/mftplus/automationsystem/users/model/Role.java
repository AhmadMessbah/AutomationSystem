package com.mftplus.automationsystem.users.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@SuperBuilder
@ToString

@Entity(name="roleEntity")
@Table(name="role_tbl")
public class Role {
    @Id
    @Column(name = "name", length = 30)
    private String name;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "role_permission_tbl",
            joinColumns = @JoinColumn(name = "role_name"),
            inverseJoinColumns = @JoinColumn(name = "permission"),
            foreignKey = @ForeignKey(name = "fk_role_permission"),
            inverseForeignKey = @ForeignKey(name = "fk_inverse_role_permission")
    )
    private Set<Permission> permissionSet;



    // Constructor to handle deserialization from string
    public Role(String name) {
        this.name = name;
    }
}
