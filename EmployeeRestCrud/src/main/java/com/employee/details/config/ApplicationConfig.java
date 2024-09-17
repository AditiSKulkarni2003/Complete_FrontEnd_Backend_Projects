package com.employee.details.config;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/")
public class ApplicationConfig extends Application {

    private Set<Class<?>> resources = new HashSet<>();

    public ApplicationConfig() {

        resources.add(com.employee.details.controller.EmployeeController.class);
    }

    @Override
    public Set<Class<?>> getClasses() {
        return resources;
    }
}
