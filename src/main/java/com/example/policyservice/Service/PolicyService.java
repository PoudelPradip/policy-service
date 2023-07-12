package com.example.policyservice.Service;
import com.example.policyservice.entity.Policy;
import com.example.policyservice.repo.PolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PolicyService {
    private PolicyRepository policyRepository;

    @Autowired
    public PolicyService(PolicyRepository policyRepository) {
        this.policyRepository = policyRepository;
    }

    public List<Policy> getAllPolicies() {
        return policyRepository.findAll();
    }

    public Policy getPolicyById(Integer id) {
        return policyRepository.findById(id).orElse(null);
    }

}
