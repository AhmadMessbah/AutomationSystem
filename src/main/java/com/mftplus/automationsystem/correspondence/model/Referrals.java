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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(
            name = "forwarder_id",
            foreignKey = @ForeignKey(name = "fk_referrals_forwarder")
    )
    private User forwarder;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(
            name = "receiver_id",
            foreignKey = @ForeignKey(name = "fk_referrals_receiver")
    )
    private User receiver;

    @Column(name = "approval")
    private boolean needApproval;
}
