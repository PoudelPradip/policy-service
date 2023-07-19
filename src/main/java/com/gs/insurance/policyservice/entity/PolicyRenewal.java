package com.gs.insurance.policyservice.entity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
@Entity
@Getter
@Setter
@Table(name = "POLICY_RENEWABLE")
public class PolicyRenewal {
    @Id
    @Column(name = "ID", length = 20)
    private String id;

    @Column(name = "DATE_OF_RENEWAL", nullable = false)
    private Date dateOfRenewal;

    @Column(name = "TYPE_OF_RENEWAL", length = 15, nullable = false)
    private String typeOfRenewal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "POLICY_ID", referencedColumnName = "ID", nullable = false)
    private Policy policy;

    @Column(name = "CREATED_DTS", nullable = false)
    private Timestamp createdDts;

    @Column(name = "LAST_UPDATED_DTS", nullable = false)
    private Timestamp lastUpdatedDts;
}
