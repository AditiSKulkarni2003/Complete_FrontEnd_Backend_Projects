export interface Address {
  addressId?: number;
  buildingName?: string;
  city: string;
  pinCode: string;
  mobNo?: string;
}

export interface Employee {
  empId?: number;
  empName: string;
  empCompanyName: string;
  empBloodGroup: string;
  address: Address;
  gcmLevel: string;
  dassId: string;
  empType: string;


}

export interface ConsultantDelivery extends Employee {
  consultingLevel?: string;
  leadProjects?: string;
}

export interface Manager extends Employee {
  teamSize?: string;
  location?: string;
}

export interface AssociateConsultantDelivery extends Employee {
  skillSet?: string;
  projectRole?: string;
  reportsTo?: string;
}
