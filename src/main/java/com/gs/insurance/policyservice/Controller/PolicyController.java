package com.gs.insurance.policyservice.Controller;

import com.gs.insurance.policyservice.Service.PolicyService;
import com.gs.insurance.policyservice.dto.PolicyDto;
import com.gs.insurance.policyservice.entity.Policy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/policies")
public class PolicyController {
    private final PolicyService policyService;

    @Autowired
    public PolicyController(PolicyService policyService) {
        this.policyService = policyService;
    }

    @GetMapping
    public List<Policy> getAllPolicies() {
        return policyService.getAllPolicies();
    }
    @PostMapping("/create-policy")
    public List<Policy> save(@RequestBody PolicyDto policyDto){
        return policyService.save(policyDto);
    }
    @GetMapping("/{id}")
    public Policy getPolicyById(@PathVariable Integer id) {
        return policyService.getPolicyById(id);
    }
}