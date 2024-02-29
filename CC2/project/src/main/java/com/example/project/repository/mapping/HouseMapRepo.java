package com.example.project.repository.mapping;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.model.mapping.HouseMap;

@Repository
public interface HouseMapRepo extends JpaRepository<HouseMap,Long>{
    
}
