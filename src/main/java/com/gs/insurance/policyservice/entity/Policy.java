package com.gs.insurance.policyservice.entity;
import com.gs.insurance.policyservice.entity.PolicyType;


import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "POLICY")
public class Policy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "POLICY_NUMBER", unique = true, nullable = false)
    private Long policyNumber;

    @Column(name = "ACCOUNT_NUMBER", nullable = false)
    private Long accountNumber;

    @ManyToOne
    @JoinColumn(name = "TYPE_CD", nullable = false)
    private policyType type;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "EFFECTIVE_DATE", nullable = false)
    private LocalDate effectiveDate;

    @Column(name = "EXPIRATION_DATE", nullable = false)
    private LocalDate expirationDate;

    @Column(name = "CANCEL_DATE", nullable = false)
    private LocalDate cancelDate;

    @Column(name = "TERM")
    private Short term;

    @Column(name = "PREMIUM_AMOUNT", nullable = false)
    private String premiumAmount;


}