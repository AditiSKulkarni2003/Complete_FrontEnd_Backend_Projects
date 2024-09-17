package com.employee.details.model;

public class ConsultantDelivery extends Employee {

    public ConsultantDelivery(String empName, String empCompanyName, String empBloodGroup, Address address, String gcmLevel, String dassId, String consultingLevel, String leadProjects) {
        super(empName, empCompanyName, empBloodGroup, address, gcmLevel, dassId, "ConsultantDelivery");
        this.setConsultingLevel(consultingLevel);
        this.setLeadProjects(leadProjects);
    }
}
