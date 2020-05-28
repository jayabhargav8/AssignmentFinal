package com.sales.SpringBootApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sales.SpringBootApplication.model.SalesDetails;


public interface SalesRepository extends JpaRepository<SalesDetails, Integer> {

}
