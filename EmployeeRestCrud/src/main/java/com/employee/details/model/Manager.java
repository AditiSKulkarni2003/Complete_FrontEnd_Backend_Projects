package com.employee.details.model;

public class Manager extends Employee {

    public Manager(String empName, String empCompanyName, String empBloodGroup, Address address, String gcmLevel, String dassId, String teamSize, String location) {
        super(empName, empCompanyName, empBloodGroup, address, gcmLevel, dassId, "Manager");
        this.setTeamSize(teamSize);
        this.setLocation(location);
    }
}
