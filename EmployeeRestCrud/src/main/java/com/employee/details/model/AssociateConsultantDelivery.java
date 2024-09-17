package com.employee.details.model;

public class AssociateConsultantDelivery extends Employee {

    public AssociateConsultantDelivery(String empName, String empCompanyName, String empBloodGroup, Address address, String gcmLevel, String dassId, String skillSet, String reportsTo, String projectRole) {
        super(empName, empCompanyName, empBloodGroup, address, gcmLevel, dassId, "AssociateConsultantDelivery");
        this.setSkillSet(skillSet);
        this.setReportsTo(reportsTo);
        this.setProjectRole(projectRole);
    }
}
