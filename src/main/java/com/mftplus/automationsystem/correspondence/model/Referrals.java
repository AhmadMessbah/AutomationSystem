package com.mftplus.automationsystem.correspondence.model;

import com.mftplus.automationsystem.users.model.User;
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

@Entity(name="referralsEntity")
@Table(name="referrals_tbl")
public class Referrals {

    @Id
    @SequenceGenerator(name = "referralsSeq", sequenceName = "referrals_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "referralsSeq")
    @Column(name = "id")
    private Long id;

    @ManyToOne
    private User forwarder;

    @ManyToOne
    private User receiver;

    private boolean needApproval;
}
