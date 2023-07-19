package com.gs.insurance.policyservice.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@Table(name = "POLICY_STATUS")
public class PolicyStatus {
    @Id
    private Integer id;

    @Column(name = "STATUS_TXT")
    private String statusText;

    @Column(name = "CREATED_DTS")
    private Timestamp createdDts;

    @Column(name = "LAST_UPDATED_DTS")
    private Timestamp lastUpdatedDts;
}
