package org.example.model.user;

public class BranchManager extends User {
    private Long branchId;

    // Constructor
    public BranchManager(Long branchId) {
        this.branchId = branchId;
    }

    // Getters and setters
    public Long getBranchId() {
        return branchId;
    }

    public void setBranchId(Long branchId) {
        this.branchId = branchId;
    }
}

