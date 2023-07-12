package com.example.policyservice.Controller;

import com.example.policyservice.Service.PolicyRenewalService;
import org.springframework.beans.factory.annotation.Autowired;

public class PolicyRenewalController {
    private final PolicyRenewalService policyRenewalService;

    @Autowired
    public PolicyRenewalController(PolicyRenewalService policyRenewalService) {
        this.policyRenewalService = policyRenewalService;
    }

}
