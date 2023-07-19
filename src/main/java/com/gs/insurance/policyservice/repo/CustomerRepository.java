package com.gs.insurance.policyservice.repo;

import com.gs.insurance.policyservice.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
