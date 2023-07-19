package com.example.policyservice.entity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@Table(name = "POLICY_TYPE")
public class PolicyType {
    @Id
    private Integer id;

    @Column(name = "TYPE_TXT")
    private String typeText;

    @Column(name = "CREATED_DTS")
    private Timestamp createdDts;

    @Column(name = "LAST_UPDATED_DTS")
    private Timestamp lastUpdatedDts;
}