//package com.example.policyservice.Controller;
//
//import com.example.policyservice.Service.PolicyStatusService;
//import com.example.policyservice.entity.PolicyStatus;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/policy-statuses")
//public class PolicyStatusController {
//    private PolicyStatusService policyStatusService;
//
//    @Autowired
//    public PolicyStatusController(PolicyStatusService policyStatusService) {
//        this.policyStatusService = policyStatusService;
//    }
//
//    @GetMapping
//    public List<PolicyStatus> getAllPolicyStatuses() {
//        return policyStatusService.getAllPolicyStatuses();
//    }
//
//    @GetMapping("/{id}")
//    public PolicyStatus getPolicyStatusById(@PathVariable Integer id) {
//        return policyStatusService.getPolicyStatusById(id);
//    }
//
//    @PostMapping
//    public PolicyStatus addPolicyStatus(@RequestBody PolicyStatus policyStatus) {
//        return policyStatusService.addPolicyStatus(policyStatus);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deletePolicyStatus(@PathVariable Integer id) {
//        policyStatusService.deletePolicyStatus(id);
//    }
//}