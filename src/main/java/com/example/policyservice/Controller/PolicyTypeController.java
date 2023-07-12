//package com.example.policyservice.Controller;
//
//import com.example.policyservice.Service.PolicyTypeService;
//import com.example.policyservice.entity.PolicyType;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/policy-types")
//public class PolicyTypeController {
//    private PolicyTypeService policyTypeService;
//
//    @Autowired
//    public PolicyTypeController(PolicyTypeService policyTypeService) {
//        this.policyTypeService = policyTypeService;
//    }
//
//    @GetMapping
//    public List<PolicyType> getAllPolicyTypes() {
//        return policyTypeService.getAllPolicyTypes();
//    }
//
//    @GetMapping("/{id}")
//    public PolicyType getPolicyTypeById(@PathVariable Integer id) {
//        return policyTypeService.getPolicyTypeById(id);
//    }
//
//    @PostMapping
//    public PolicyType addPolicyType(@RequestBody PolicyType policyType) {
//        return policyTypeService.addPolicyType(policyType);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deletePolicyType(@PathVariable Integer id) {
//        policyTypeService.deletePolicyType(id);
//    }
//}
