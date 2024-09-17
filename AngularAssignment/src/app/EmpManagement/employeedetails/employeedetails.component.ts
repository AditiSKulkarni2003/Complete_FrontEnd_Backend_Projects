import { Component, OnInit } from '@angular/core';
import { Employee } from "../../models/employee";
import { EmpManagementServiceService } from "../../services/emp-management-service.service";
import { FormsModule } from "@angular/forms";
import { CommonModule } from "@angular/common";
import { HttpClientModule } from "@angular/common/http";

@Component({
  selector: 'app-employeedetails',
  standalone: true,
  imports: [
    FormsModule, CommonModule, HttpClientModule
  ],
  providers: [EmpManagementServiceService],
  templateUrl: './employeedetails.component.html',
  styleUrls: ['./employeedetails.component.css']
})
export class EmployeedetailsComponent implements OnInit {
  employees: Employee[] = [];
  employee: Employee = new Employee(0, '');
  isEditing: boolean = false;

  constructor(private empmanagementService: EmpManagementServiceService) { }

  ngOnInit(): void {
    this.getAllEmployees();
  }

  getAllEmployees(): void {
    this.empmanagementService.getAllEmployees().subscribe({
      next: (data) => {
        console.log('Employees data:', data);
        this.employees = data;
      },
      error: (err) => {
        console.error('Error fetching employees:', err);
      }
    });
  }


  updateEmployee(id: number): void {
    this.isEditing = true;
    this.empmanagementService.getEmployee(id).subscribe((data) => {
      this.employee = data;
    });
  }

  saveEmployee(): void {
    if (this.isEditing) {
      this.empmanagementService.updateEmployee(this.employee.empId, this.employee).subscribe(() => {
        this.getAllEmployees();
        this.resetForm();
      });
    } else {
      this.empmanagementService.createEmployee(this.employee).subscribe(() => {
        this.getAllEmployees();
        this.resetForm();
      });
    }
  }

  deleteEmployee(id: number): void {
    this.empmanagementService.deleteEmployee(id).subscribe(() => {
      this.getAllEmployees();
    });
  }

  resetForm(): void {
    this.employee = new Employee(0, '');
    this.isEditing = false;
  }}
