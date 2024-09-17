import { Component, OnInit } from '@angular/core';
import { EmpRestCrudService } from '../../services/emp-rest-crud.service';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { ConsultantDelivery, Manager, AssociateConsultantDelivery, Employee } from '../../models/empRestCrud';
import { HttpClientModule } from "@angular/common/http";


@Component({
  selector: 'app-emp-rest-crud',
  standalone: true,
  imports: [CommonModule, FormsModule, HttpClientModule],
  templateUrl: './emp-rest-crud.component.html',
  styleUrls: ['./emp-rest-crud.component.css'],
  providers: [EmpRestCrudService],
})
export class EmpRestCrudComponent implements OnInit {
  showForm = false;
  employees: Employee[] = [];
  selectedEmployee: Employee | null = null;
  isEditMode = false;

  employee: Employee = {
    empName: '',
    empCompanyName: '',
    empBloodGroup: '',
    gcmLevel: '',
    dassId: '',
    empType: '',
    address: {
      city: '',
      pinCode: ''
    }
  };

  constructor(private employeeService: EmpRestCrudService) {}

  ngOnInit(): void {
    this.loadEmployees();
  }


  loadEmployees(): void {
    this.employeeService.getAllEmployees().subscribe(
      (data: Employee[]) => {
      this.employees = data;
    });
  }

  selectEmployee(employee: Employee): void {
    this.selectedEmployee = employee;
    this.isEditMode = true;

    this.employee = { ...employee };

    if (!this.employee.address) {
      this.employee.address = { city: '', pinCode: '' };
    }
    this.toggleForm();
  }

  createEmployee(): void {
    if (!this.employee.address) {
      this.employee.address = { city: '', pinCode: '' };
    }

    this.employeeService.createEmployee(this.employee).subscribe(() => {
      this.loadEmployees();
      this.resetForm();
    });
  }

  updateEmployee(): void {
    if (this.selectedEmployee && this.employee.empId) {

      this.employeeService.updateEmployee(this.employee.empId, this.employee).subscribe(() => {
        this.loadEmployees();
        this.resetForm();
      });
    }
  }

  deleteEmployee(id: number): void {
    this.employeeService.deleteEmployee(id).subscribe(() => {
      this.loadEmployees();
    });
  }

  resetForm(): void {
    this.employee = {
      empName: '',
      empCompanyName: '',
      empBloodGroup: '',
      gcmLevel: '',
      dassId: '',
      empType: '',
      address: {
        city: '',
        pinCode: ''
      }
    };
    this.selectedEmployee = null;
    this.isEditMode = false;
    this.showForm = false;
  }

  toggleForm(): void {
    this.showForm = !this.showForm;
    if (!this.showForm) {
      this.resetForm();
    }
  }

  isConsultantDelivery(employee: Employee): employee is ConsultantDelivery {
    return employee.empType === 'ConsultantDelivery';
  }

  isManager(employee: Employee): employee is Manager {
    return employee.empType === 'Manager';
  }

  isAssociateConsultantDelivery(employee: Employee): employee is AssociateConsultantDelivery {
    return employee.empType === 'AssociateConsultantDelivery';
  }


}
