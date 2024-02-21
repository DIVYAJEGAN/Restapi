package com.example.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.project.model.Buy;


@Repository
public interface BuyRepo extends JpaRepository<Buy,Long>{
    List<Buy> findByName(String name);
    
}
