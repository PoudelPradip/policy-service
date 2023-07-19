package com.gs.insurance.policyservice.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
@Entity
@Getter
@Setter
@Table(name = "POLICY")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "POLICY_NUMBER")
    private Long policyNumber;

    @Column(name = "ACCOUNT_NUMBER")
    private Long accountNumber;

    @Column(name = "TYPE_CD")
    private Integer typeCd;

    @Column(name = "NAME")
    private String name;

    @Column(name = "EFFECTIVE_DATE")
    private Date effectiveDate;

    @Column(name = "EXPIRATION_DATE")
    private Date expirationDate;

    @Column(name = "CANCEL_DATE")
    private Date cancelDate;

    @Column(name = "TERM")
    private Integer term;

    @Column(name = "PREMIUM_AMOUNT")
    private String premiumAmount;

    @Column(name = "CREATED_DTS")
    private Timestamp createdDts;

    @Column(name = "LAST_UPDATED_DTS")
    private Timestamp lastUpdatedDts;

}
