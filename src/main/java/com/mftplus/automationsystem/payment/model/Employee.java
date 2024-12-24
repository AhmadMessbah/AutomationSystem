package com.mftplus.automationsystem.payment.model;

import com.mftplus.automationsystem.organization.model.Department;
import com.mftplus.automationsystem.users.model.Profile;
import com.mftplus.automationsystem.users.model.User;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

@Entity
public class Employee extends AbstractBaseEntity
{
    @OneToOne
    private Department department;

    @OneToOne
    private Profile profile;

    @OneToOne
    private User user;
}