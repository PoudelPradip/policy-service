package com.gs.insurance.policyservice.repo;

import com.gs.insurance.policyservice.entity.PolicyRenewal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PolicyRenewalRepository extends JpaRepository<PolicyRenewal, String> {
}
