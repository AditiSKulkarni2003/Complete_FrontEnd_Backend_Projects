import { CommonModule } from '@angular/common';
import {Component} from '@angular/core';
import {FormsModule} from "@angular/forms";


@Component({
  selector: 'app-emp-list',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './emp-list.component.html',
  styleUrl: './emp-list.component.css'
})

export class EmpListComponent {

  employees: any[] = [
    {id: 1, empName: 'Aditi', companyName: 'WGS', role: 'Devlopment'},
    {id: 2, empName: 'Laxmikant', companyName: 'WGS', role: 'Devlopment'},
    {id: 3, empName: 'AAA', companyName: 'Wipro', role: 'DevOps'}
  ];

  newEmployee={id:0,empName:'', companyName:'', role:''};
  updateIndex: number | null = null;


  readEmployees() {
    return this.employees;
  }


  addEmployee(){
    if(this.newEmployee.empName && this.newEmployee.companyName && this.newEmployee.role){
      if(this.updateIndex !== null){
        this.employees[this.updateIndex]={...this.newEmployee};
        this.updateIndex=null;
      }

      else {
        this.newEmployee.id=this.employees.length+1;
        this.employees.push({...this.newEmployee});
      }
      this.newEmployee={id :0,empName: '',companyName: '',role: ''};
    }
  }
  updateEmp(index: number){
    this.newEmployee={...this.employees[index]};
    this.updateIndex=index;
  }

  deleteEmployee(index:number){
    this.employees.splice(index,1);
  }


}
