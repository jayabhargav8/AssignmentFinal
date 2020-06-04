package com.sales.SpringBootApplication.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.sales.SpringBootApplication.model.SalesDetails;

@Repository
public interface PageRepository extends PagingAndSortingRepository<SalesDetails, Long> {


}