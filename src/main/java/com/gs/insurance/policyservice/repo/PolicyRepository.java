package com.gs.insurance.policyservice.repo;

import com.gs.insurance.policyservice.entity.Policy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PolicyRepository extends JpaRepository<Policy, Integer> {
}