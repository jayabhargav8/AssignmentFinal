package com.sales.SpringBootApplication.repository;

import org.springframework.data.repository.CrudRepository;

import com.sales.SpringBootApplication.model.SalesDetails;


public interface SalesRepository extends CrudRepository<SalesDetails, Integer> {

}
