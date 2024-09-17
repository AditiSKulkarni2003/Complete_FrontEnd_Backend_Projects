import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmpRestCrudComponent } from './emp-rest-crud.component';

describe('EmpRestCrudComponent', () => {
  let component: EmpRestCrudComponent;
  let fixture: ComponentFixture<EmpRestCrudComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [EmpRestCrudComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EmpRestCrudComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
