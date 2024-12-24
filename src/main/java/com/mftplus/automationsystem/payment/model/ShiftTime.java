package com.mftplus.automationsystem.payment.model;

import com.mftplus.automationsystem.payment.model.enums.ShiftType;
import com.mftplus.automationsystem.payment.model.enums.WeekDay;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Entity
public class ShiftTime extends AbstractBaseEntity
{
    @OneToMany
    private List<Employee> employees;

    @Enumerated(value = EnumType.ORDINAL)
    private ShiftType shiftType;

    @Enumerated(value = EnumType.ORDINAL)
    private WeekDay weekDay;

    private String shiftTitle;

    private LocalDateTime startDateTime;

    private LocalDateTime endDateTime;
}