package com.sales.SpringBootApplication.repository;

import org.springframework.data.repository.CrudRepository;

import com.sales.SpringBootApplication.service.SalesService;

public interface SalesRepository extends CrudRepository<SalesService, Integer> {

}
