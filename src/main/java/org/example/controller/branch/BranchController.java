package org.example.controller.branch;

import org.example.model.branch.Branch;
import org.example.service.branch.BranchService;

public class BranchController {
    private final BranchService branchService;

    public BranchController() {
        this.branchService = new BranchService();
    }

    public Branch createBranch(Branch branch) {
        return branchService.createBranch(branch);
    }
}
