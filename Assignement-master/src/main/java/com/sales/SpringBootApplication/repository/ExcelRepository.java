package com.sales.SpringBootApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sales.SpringBootApplication.model.SalesDetails;


@Repository
public interface ExcelRepository  extends JpaRepository<SalesDetails, Long>{

}
