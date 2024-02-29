package com.example.project.repository.mapping;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.model.mapping.CusMap;

@Repository
public interface CusMapRepo extends JpaRepository<CusMap,Long>{

    
}