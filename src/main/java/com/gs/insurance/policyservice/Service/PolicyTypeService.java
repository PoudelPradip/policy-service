package com.gs.insurance.policyservice.Service;

import com.example.policyservice.entity.PolicyType;
import com.example.policyservice.repo.PolicyTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PolicyTypeService {
    private PolicyTypeRepository policyTypeRepository;

    @Autowired
    public PolicyTypeService(PolicyTypeRepository policyTypeRepository) {
        this.policyTypeRepository = policyTypeRepository;
    }

    public List<PolicyType> getAllPolicyTypes() {
        return policyTypeRepository.findAll();
    }

    public PolicyType getPolicyTypeById(Integer id) {
        return policyTypeRepository.findById(id).orElse(null);
    }

    public PolicyType addPolicyType(PolicyType policyType) {
        return policyTypeRepository.save(policyType);
    }

    public void deletePolicyType(Integer id) {
        policyTypeRepository.deleteById(id);
    }

  }
