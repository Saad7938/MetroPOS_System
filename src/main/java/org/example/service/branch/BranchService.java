package org.example.service.branch;

import org.example.model.branch.Branch;
import org.example.repository.branch.BranchRepository;

public class BranchService {
    private final BranchRepository branchRepository;

    public BranchService() {
        this.branchRepository = new BranchRepository();
    }

    public Branch createBranch(Branch branch) {
        return branchRepository.save(branch);
    }
}
