package com.employee.details.model;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "addressId")
    private int id;

    @Column(name = "buildingName")
    private String buildingName;

    @Column(name = "city")
    private String city;

    @Column(name = "pinCode")
    private String pinCode;

    @Column(name = "mobNo")
    private String mobNo;


    public Address() {}

    public Address(String buildingName, String city, String pinCode, String mobNo) {
        this.buildingName = buildingName;
        this.city = city;
        this.pinCode = pinCode;
        this.mobNo = mobNo;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", buildingName='" + buildingName + '\'' +
                ", city='" + city + '\'' +
                ", pinCode='" + pinCode + '\'' +
                ", mobNo='" + mobNo + '\'' +
                '}';
    }
}
