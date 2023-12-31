package com.gs.insurance.policyservice.Service;
import com.gs.insurance.policyservice.entity.PolicyStatus;
import com.gs.insurance.policyservice.repo.PolicyStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

public class PolicyStatusService {
    private PolicyStatusRepository policyStatusRepository;

    @Autowired
    public PolicyStatusService(PolicyStatusRepository policyStatusRepository) {
        this.policyStatusRepository = policyStatusRepository;
    }

    public List<PolicyStatus> getAllPolicyStatuses() {
        return policyStatusRepository.findAll();
    }

    public PolicyStatus getPolicyStatusById(Integer id) {
        return policyStatusRepository.findById(id).orElse(null);
    }

    public PolicyStatus addPolicyStatus(PolicyStatus policyStatus) {
        return policyStatusRepository.save(policyStatus);
    }

    public void deletePolicyStatus(Integer id) {
        policyStatusRepository.deleteById(id);
    }

}
