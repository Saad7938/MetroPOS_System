package org.example.model.user;

public abstract class User {
    private String id;
    private String name;
    private String empNo;
    private String email;
    private String password;
    private String branchCode;
    private double salary;
    private boolean firstLogin;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmpNo() {
        return empNo;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isFirstLogin() {
        return firstLogin;
    }
        public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setFirstLogin(boolean firstLogin) {
        this.firstLogin = firstLogin;
    }
}

