package com.example.policyservice.repo;

import com.example.policyservice.entity.PolicyRenewal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PolicyRenewalRepository extends JpaRepository<PolicyRenewal, String> {
}
