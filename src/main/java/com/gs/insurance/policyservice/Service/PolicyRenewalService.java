package com.gs.insurance.policyservice.Service;

import com.gs.insurance.policyservice.repo.PolicyRenewalRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PolicyRenewalService {

    private final PolicyRenewalRepository policyRenewalRepository;

    @Autowired
    public PolicyRenewalService(PolicyRenewalRepository policyRenewalRepository) {
        this.policyRenewalRepository = policyRenewalRepository;
    }

}
