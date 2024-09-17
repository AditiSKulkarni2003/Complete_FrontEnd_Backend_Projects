package com.employee.details.service;


import com.employee.details.model.Employee;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Stateless
public class EmployeeService {

    @PersistenceContext(unitName = "employeePU")
    private EntityManager entityManager;

    @Transactional
    public void createEmployee(Employee employee) {
        entityManager.persist(employee);
    }

    public Employee findEmployeeById(int empId) {
        return entityManager.find(Employee.class, empId);
    }

    @Transactional
    public void updateEmployee(Employee employee) {
        entityManager.merge(employee);
    }

    @Transactional
    public void deleteEmployee(int empId) {
        Employee employee = findEmployeeById(empId);
        if (employee != null) {
            entityManager.remove(employee);
        }
    }

    public List<Employee> findAllEmployees() {
        return entityManager.createQuery("SELECT e FROM com.employee.details.model.Employee e ", Employee.class).getResultList();
    }
}
