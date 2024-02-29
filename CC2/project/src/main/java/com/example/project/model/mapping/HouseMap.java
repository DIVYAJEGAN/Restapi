package com.example.project.model.mapping;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="housemap")
public class HouseMap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long houseid;
    int price;
    String location;    
    int bedrooms;
    int bathrooms;
    public Long getHouseid() {
        return houseid;
    }
    public void setHouseid(Long houseid) {
        this.houseid = houseid;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public int getBedrooms() {
        return bedrooms;
    }
    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }
    public int getBathrooms() {
        return bathrooms;
    }
    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    
}
