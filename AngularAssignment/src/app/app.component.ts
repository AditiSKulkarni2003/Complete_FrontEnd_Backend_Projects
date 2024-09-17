import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {EmpListComponent} from "./emp-list/emp-list.component";
import { CommonModule } from '@angular/common';
import {EmployeedetailsComponent} from "./EmpManagement/employeedetails/employeedetails.component";
import {DemoComponent} from "./demo/demo.component";
import {EmpRestCrudComponent} from "./EmployeeRestCrud/emp-rest-crud/emp-rest-crud.component";



@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,EmpListComponent,EmployeedetailsComponent,EmpRestCrudComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'AngularAssignment';
}
