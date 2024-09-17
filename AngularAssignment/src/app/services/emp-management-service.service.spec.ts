import { TestBed } from '@angular/core/testing';

import { EmpManagementServiceService } from './emp-management-service.service';

describe('EmpManagementServiceService', () => {
  let service: EmpManagementServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(EmpManagementServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
