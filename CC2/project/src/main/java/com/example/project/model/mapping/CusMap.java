package com.example.project.model.mapping;

import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer")
public class CusMap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long cusid;
    String cusName;
    String propertyType;
    String location;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cus_id")
    List <HouseMap> house=new ArrayList<>();

    public Long getCusid() {
        return cusid;
    }
    public void setCusid(Long cusid) {
        this.cusid = cusid;
    }
    public String getCusName() {
        return cusName;
    }
    public void setCusName(String cusName) {
        this.cusName = cusName;
    }
    public String getPropertyType() {
        return propertyType;
    }
    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public List<HouseMap> getHouse() {
        return house;
    }
    public void setHouse(List<HouseMap> house) {
        this.house = house;
    }
    
}
