package com.employee.details.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private int empId;

    @Column(name = "emp_name", nullable = false)
    private String empName;

    @Column(name = "emp_company_name", nullable = false)
    private String empCompanyName;

    @Column(name = "emp_blood_group", nullable = false)
    private String empBloodGroup;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "addressId")
    private Address address;

    @JsonProperty("gcmLevel")
    @Column(name = "gcm_level", nullable = false)
    private String gcmLevel;

    @Column(name = "dass_id", nullable = false)
    private String dassId;

    @Column(name = "emp_type", nullable = false)
    private String empType;

    @Column(name = "skill_set")
    private String skillSet;

    @Column(name = "project_role")
    private String projectRole;

    @Column(name = "reports_to")
    private String reportsTo;

    @Column(name = "consulting_level")
    private String consultingLevel;

    @Column(name = "lead_projects")
    private String leadProjects;

    @Column(name = "team_size")
    private String teamSize;

    @Column(name = "location")
    private String location;


    public Employee() {}

    public Employee(String empName, String empCompanyName, String empBloodGroup, Address address, String gcmLevel, String dassId, String empType) {
        this.empName = empName;
        this.empCompanyName = empCompanyName;
        this.empBloodGroup = empBloodGroup;
        this.address = address;
        this.gcmLevel = gcmLevel;
        this.dassId = dassId;
        this.empType = empType;
    }


    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpCompanyName() {
        return empCompanyName;
    }

    public void setEmpCompanyName(String empCompanyName) {
        this.empCompanyName = empCompanyName;
    }

    public String getEmpBloodGroup() {
        return empBloodGroup;
    }

    public void setEmpBloodGroup(String empBloodGroup) {
        this.empBloodGroup = empBloodGroup;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getgcmLevel() {
        return gcmLevel;
    }

    public void setgcmLevel(String gcmLevel) {
        this.gcmLevel = gcmLevel;
    }

    public String getDassId() {
        return dassId;
    }

    public void setDassId(String dassId) {
        this.dassId = dassId;
    }

    public String getEmpType() {
        return empType;
    }

    public void setEmpType(String empType) {
        this.empType = empType;
    }

    public String getSkillSet() {
        return skillSet;
    }

    public void setSkillSet(String skillSet) {
        this.skillSet = skillSet;
    }

    public String getProjectRole() {
        return projectRole;
    }

    public void setProjectRole(String projectRole) {
        this.projectRole = projectRole;
    }

    public String getReportsTo() {
        return reportsTo;
    }

    public void setReportsTo(String reportsTo) {
        this.reportsTo = reportsTo;
    }

    public String getConsultingLevel() {
        return consultingLevel;
    }

    public void setConsultingLevel(String consultingLevel) {
        this.consultingLevel = consultingLevel;
    }

    public String getLeadProjects() {
        return leadProjects;
    }

    public void setLeadProjects(String leadProjects) {
        this.leadProjects = leadProjects;
    }

    public String getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(String teamSize) {
        this.teamSize = teamSize;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
