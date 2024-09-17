import { TestBed } from '@angular/core/testing';

import { EmpRestCrudService } from './emp-rest-crud.service';

describe('EmpRestCrudService', () => {
  let service: EmpRestCrudService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(EmpRestCrudService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
