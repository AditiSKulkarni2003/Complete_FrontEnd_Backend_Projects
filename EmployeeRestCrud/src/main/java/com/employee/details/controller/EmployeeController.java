package com.employee.details.controller;

import com.employee.details.model.Employee;
import com.employee.details.service.EmployeeService;

import javax.ejb.EJB;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/employees")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EmployeeController {

    @EJB
    private EmployeeService employeeService;

    @POST
    public Response createEmployee(Employee employee) {
        employeeService.createEmployee(employee);
        return Response.status(Response.Status.CREATED).entity(employee).build();
    }

    @GET
    @Path("/{empId}")
    public Response getEmployeeById(@PathParam("empId") int empId) {
        Employee employee = employeeService.findEmployeeById(empId);
        if (employee != null) {
            return Response.ok(employee).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @GET
    public List<Employee> getAllEmployees() {
        return employeeService.findAllEmployees();
    }

    @PUT
    @Path("/{empId}")
    public Response updateEmployee(@PathParam("empId") int empId, Employee employee) {
        Employee existingEmployee = employeeService.findEmployeeById(empId);
        if (existingEmployee != null) {
            employee.setEmpId(empId);
            employeeService.updateEmployee(employee);
            return Response.ok(employee).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @DELETE
    @Path("/{empId}")
    public Response deleteEmployee(@PathParam("empId") int empId) {
        employeeService.deleteEmployee(empId);
        return Response.noContent().build();
    }


}

