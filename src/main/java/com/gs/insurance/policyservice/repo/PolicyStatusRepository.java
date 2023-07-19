package com.gs.insurance.policyservice.repo;

import com.gs.insurance.policyservice.entity.PolicyStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PolicyStatusRepository extends JpaRepository<PolicyStatus, Integer> {

}